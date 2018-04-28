package br.wagnerpassos.visao;

import br.wagnerpassos.modelo.bean.Jogador;
import br.wagnerpassos.modelo.bean.Torneio;
import br.wagnerpassos.modelo.dao.JogadorDAO;
import br.wagnerpassos.modelo.dao.TorneioDAO;
import br.wagnerpassos.modelo.validador.Validador;
import br.wagnerpassos.swing.util.ImpressoraSwing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wagne
 */
public class TelaCadastroNoTorneio extends javax.swing.JDialog {
    TorneioDAO torneioDAO = new TorneioDAO();
    JogadorDAO jogadorDAO = new JogadorDAO();
    List<Jogador> memVirtualJogadores = new ArrayList<>();
    Torneio memVirtualTorneio = new Torneio();
    
    public void atualizaTabelaTorneio(){
        listaTorneios.clear();
        listaTorneios.addAll(torneioDAO.read());
        int linha;
        linha = listaTorneios.size() - 1;
        if(linha >= 0){
            tabelaTorneios.setRowSelectionInterval(linha, linha);
            tabelaTorneios.scrollRectToVisible(
            tabelaTorneios.getCellRect(linha, linha, true));
        }
    }
    
    public void atualizaTabelaTorneio(String busca){
        listaTorneios.clear();
        listaTorneios.addAll(torneioDAO.read());
        
        for(Iterator<Torneio> iter = listaTorneios.listIterator(); iter.hasNext();){
            Torneio torneio = iter.next();
            if(!torneio.getNome().toLowerCase().contains(busca.toLowerCase()))
                iter.remove();
        }
        int linha = listaTorneios.size() - 1;
        if(linha >= 0){
            tabelaTorneios.setRowSelectionInterval(linha, linha);
            tabelaTorneios.scrollRectToVisible(
            tabelaTorneios.getCellRect(linha, linha, true));
        }
    }
    
    public void atualizaTabelaJogador(){
        int linha;
        
        listaJogadores.clear();
        listaJogadores.addAll(removerRepetidos());
        
        linha = listaJogadores.size() - 1;
        if(linha >= 0){
            tabelaJogadores.setRowSelectionInterval(linha, linha);
            tabelaJogadores.scrollRectToVisible(
            tabelaJogadores.getCellRect(linha, linha, true));
        }
    }
    
    public void atualizaTabelaJogador(String busca){
        listaJogadores.clear();     
        listaJogadores.addAll(removerRepetidos());
        
        for(Iterator<Jogador> iter = listaJogadores.listIterator(); iter.hasNext();){
            Jogador jogador = iter.next();
            if(!jogador.getNome().toLowerCase().contains(busca.toLowerCase()))
                iter.remove();
        }
        int linha = listaJogadores.size() - 1;
        if(linha >= 0){
            tabelaJogadores.setRowSelectionInterval(linha, linha);
            tabelaJogadores.scrollRectToVisible(
            tabelaJogadores.getCellRect(linha, linha, true));
        }
    }
    
    public List<Jogador> removerRepetidos(){
        Torneio torneioLocal = saberTorneioAtual();
        ArrayList<Jogador> jogadoresLocais = new ArrayList<>();
        
        jogadoresLocais.addAll(memVirtualJogadores);
        for (Jogador jogador : memVirtualTorneio.getJogadoresTorneio()) 
            if(jogadoresLocais.contains(jogador))
                jogadoresLocais.remove(jogador);
        
        return jogadoresLocais;
    }
    
    
    public void atualizaTabelaJogadorNoTorneio(){
        int linha;
        
        listaJogadoresTorneio.clear();
        listaJogadoresTorneio.addAll(memVirtualJogadores);
        for (Jogador jogador : memVirtualJogadores) {
             if(!memVirtualTorneio.getJogadoresTorneio().contains(jogador))
                    listaJogadoresTorneio.remove(jogador);
        }
        
        linha = listaJogadoresTorneio.size() - 1;
        if(listaJogadoresTorneio.size() > 0 && linha >= 0){
            tabelaJogadoresNoTorneio.setRowSelectionInterval(linha, linha);
            tabelaJogadoresNoTorneio.scrollRectToVisible(
            tabelaJogadoresNoTorneio.getCellRect(linha, linha, true));
        }
    }
    
    public void adicionarJogadorNoTorneio(){
        Jogador jogadorLocal = saberJogadorAtual();
        Torneio torneioLocal = saberTorneioAtual();

        torneioDAO.save(torneioLocal, jogadorLocal);
    }
    
    public Torneio saberTorneioAtual(){
        int linhaTorneio = tabelaTorneios.getSelectedRow();
        return listaTorneios.get(linhaTorneio);
    }
    
    public Jogador saberJogadorAtual(){
        int linhaJogador = tabelaJogadores.getSelectedRow();
        return listaJogadores.get(linhaJogador);
    }
    
    public void controlarBotoesSuperiores(Boolean controle){
        botaoPrimeiro.setEnabled(controle);
        botaoAnterior.setEnabled(controle);
        botaoProximo.setEnabled(controle);
        botaoUltimo.setEnabled(controle);
        txtBusca.setEnabled(controle);
        txtBusca.setEditable(controle);
    }
    
    public boolean validadorSwing(Torneio torneio){
        Validador validador = new Validador();
        List<String> erros = validador.validarTorneio(torneio);
        if(erros.size() > 0)
            ImpressoraSwing.getInstance().impressoraJOP(erros);
        return validador.validarTorneio(torneio).size() <= 0;
    }
    
    public void popularMemoriaJogador(){
        memVirtualJogadores.clear();
        memVirtualJogadores.addAll(jogadorDAO.read());
    }
    
    public void popularMemoriaTorneioAtual(){
        memVirtualTorneio.getJogadoresTorneio().clear();
        memVirtualTorneio.getJogadoresTorneio().addAll(torneioDAO.findListaJogadores(saberTorneioAtual()));
    }
   
    
    /**
     * Creates new form FormularioJogador
     */
    public TelaCadastroNoTorneio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        TelaCadastroNoTorneio.this.atualizaTabelaTorneio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listaTorneios = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Torneio>());
        conversorData = new br.wagnerpassos.swing.util.ConverterData();
        conversorHora = new br.wagnerpassos.swing.util.ConverterHora();
        conversorDouble = new br.wagnerpassos.swing.util.ConverterDouble();
        listaJogadores = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Jogador>());
        listaJogadoresTorneio = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Jogador>());
        painelNavegacao = new javax.swing.JPanel();
        botaoPrimeiro = new javax.swing.JButton();
        botaoAnterior = new javax.swing.JButton();
        botaoProximo = new javax.swing.JButton();
        botaoUltimo = new javax.swing.JButton();
        botaoFechar = new javax.swing.JButton();
        abas = new javax.swing.JTabbedPane();
        listagem = new javax.swing.JPanel();
        jScrollPaneTorneios = new javax.swing.JScrollPane();
        tabelaTorneios = new javax.swing.JTable();
        dados = new javax.swing.JPanel();
        painelAcoes = new javax.swing.JPanel();
        lNomeJogador = new javax.swing.JLabel();
        txtNomeJogador = new javax.swing.JTextField();
        jScrollPaneJogadores = new javax.swing.JScrollPane();
        tabelaJogadores = new javax.swing.JTable();
        botaoAdicionarAoTorneio = new javax.swing.JButton();
        lCadastradosNoTorneio = new javax.swing.JLabel();
        lNomeTorneio = new javax.swing.JLabel();
        jScrollPaneJogadoresTorneio = new javax.swing.JScrollPane();
        tabelaJogadoresNoTorneio = new javax.swing.JTable();
        painelBusca = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        txtPesquisaNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelNavegacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Painel de navegação - Torneio"));
        painelNavegacao.setLayout(new java.awt.GridLayout(1, 0));

        botaoPrimeiro.setText("Primeiro");
        botaoPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrimeiroActionPerformed(evt);
            }
        });
        painelNavegacao.add(botaoPrimeiro);

        botaoAnterior.setText("Anterior");
        botaoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAnteriorActionPerformed(evt);
            }
        });
        painelNavegacao.add(botaoAnterior);

        botaoProximo.setText("Próximo");
        botaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximoActionPerformed(evt);
            }
        });
        painelNavegacao.add(botaoProximo);

        botaoUltimo.setText("Ultimo");
        botaoUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUltimoActionPerformed(evt);
            }
        });
        painelNavegacao.add(botaoUltimo);

        botaoFechar.setText("Fechar");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });
        painelNavegacao.add(botaoFechar);

        getContentPane().add(painelNavegacao, java.awt.BorderLayout.NORTH);
        painelNavegacao.getAccessibleContext().setAccessibleName("");
        painelNavegacao.getAccessibleContext().setAccessibleDescription("");

        abas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                abasStateChanged(evt);
            }
        });
        abas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                abasFocusGained(evt);
            }
        });

        listagem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listagem.setLayout(new java.awt.BorderLayout());

        tabelaTorneios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaTorneios, tabelaTorneios);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nivel}"));
        columnBinding.setColumnName("Nivel");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataFormatada}"));
        columnBinding.setColumnName("Data");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPaneTorneios.setViewportView(tabelaTorneios);
        if (tabelaTorneios.getColumnModel().getColumnCount() > 0) {
            tabelaTorneios.getColumnModel().getColumn(0).setMinWidth(30);
            tabelaTorneios.getColumnModel().getColumn(0).setMaxWidth(40);
            tabelaTorneios.getColumnModel().getColumn(1).setMinWidth(160);
            tabelaTorneios.getColumnModel().getColumn(2).setPreferredWidth(140);
            tabelaTorneios.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        listagem.add(jScrollPaneTorneios, java.awt.BorderLayout.CENTER);

        abas.addTab("Lista de Torneios", listagem);

        dados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dadosFocusGained(evt);
            }
        });

        painelAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Painel de ações - Adicionar jogadores a um Torneio"));

        lNomeJogador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lNomeJogador.setText("Busque pelo nome do jogador");

        txtNomeJogador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeJogadorKeyReleased(evt);
            }
        });

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaJogadores, tabelaJogadores);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Cód.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPaneJogadores.setViewportView(tabelaJogadores);
        if (tabelaJogadores.getColumnModel().getColumnCount() > 0) {
            tabelaJogadores.getColumnModel().getColumn(0).setMinWidth(25);
            tabelaJogadores.getColumnModel().getColumn(0).setMaxWidth(40);
            tabelaJogadores.getColumnModel().getColumn(1).setMinWidth(80);
        }

        botaoAdicionarAoTorneio.setText("< Adicionar ao Torneio >");
        botaoAdicionarAoTorneio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarAoTorneioActionPerformed(evt);
            }
        });

        lCadastradosNoTorneio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lCadastradosNoTorneio.setText("Jogadores cadastrados");

        lNomeTorneio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tabelaTorneios, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), lNomeTorneio, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listaJogadoresTorneio, tabelaJogadoresNoTorneio);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Cód.");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPaneJogadoresTorneio.setViewportView(tabelaJogadoresNoTorneio);
        if (tabelaJogadoresNoTorneio.getColumnModel().getColumnCount() > 0) {
            tabelaJogadoresNoTorneio.getColumnModel().getColumn(0).setMinWidth(25);
            tabelaJogadoresNoTorneio.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        javax.swing.GroupLayout painelAcoesLayout = new javax.swing.GroupLayout(painelAcoes);
        painelAcoes.setLayout(painelAcoesLayout);
        painelAcoesLayout.setHorizontalGroup(
            painelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botaoAdicionarAoTorneio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lNomeJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(painelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneJogadoresTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelAcoesLayout.createSequentialGroup()
                        .addComponent(lCadastradosNoTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lNomeTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelAcoesLayout.setVerticalGroup(
            painelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(lNomeJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lCadastradosNoTorneio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lNomeTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(painelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAcoesLayout.createSequentialGroup()
                        .addComponent(txtNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneJogadores, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoAdicionarAoTorneio))
                    .addComponent(jScrollPaneJogadoresTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout dadosLayout = new javax.swing.GroupLayout(dados);
        dados.setLayout(dadosLayout);
        dadosLayout.setHorizontalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLayout.createSequentialGroup()
                .addComponent(painelAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dadosLayout.setVerticalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abas.addTab("Dados", dados);

        getContentPane().add(abas, java.awt.BorderLayout.CENTER);

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaKeyTyped(evt);
            }
        });

        txtPesquisaNome.setText("Buscar por [NOME]");

        javax.swing.GroupLayout painelBuscaLayout = new javax.swing.GroupLayout(painelBusca);
        painelBusca.setLayout(painelBuscaLayout);
        painelBuscaLayout.setHorizontalGroup(
            painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPesquisaNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(404, Short.MAX_VALUE))
        );
        painelBuscaLayout.setVerticalGroup(
            painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisaNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(painelBusca, java.awt.BorderLayout.SOUTH);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        dispose();
    }//GEN-LAST:event_botaoFecharActionPerformed

    private void botaoPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrimeiroActionPerformed
        tabelaTorneios.setRowSelectionInterval(0, 0);
        tabelaTorneios.scrollRectToVisible(tabelaTorneios.getCellRect(0, 0, true));
    }//GEN-LAST:event_botaoPrimeiroActionPerformed

    private void botaoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAnteriorActionPerformed
        int linha = tabelaTorneios.getSelectedRow();
        if(linha - 1 >= 0)
            linha--;
        tabelaTorneios.setRowSelectionInterval(linha, linha);
        tabelaTorneios.scrollRectToVisible(tabelaTorneios.getCellRect(linha, 0, true));
    }//GEN-LAST:event_botaoAnteriorActionPerformed

    private void botaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximoActionPerformed
        int linha = tabelaTorneios.getSelectedRow();
        if(linha + 1 <= tabelaTorneios.getRowCount() -1)
            linha++;
        tabelaTorneios.setRowSelectionInterval(linha, linha);
        tabelaTorneios.scrollRectToVisible(tabelaTorneios.getCellRect(linha, 0, true));
    }//GEN-LAST:event_botaoProximoActionPerformed

    private void botaoUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUltimoActionPerformed
        int linha = tabelaTorneios.getRowCount() -1;
        tabelaTorneios.setRowSelectionInterval(linha, linha);
        tabelaTorneios.scrollRectToVisible(tabelaTorneios.getCellRect(linha, 0, true));
    }//GEN-LAST:event_botaoUltimoActionPerformed

    private void txtBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyPressed
        
    }//GEN-LAST:event_txtBuscaKeyPressed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void txtBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyTyped

    }//GEN-LAST:event_txtBuscaKeyTyped

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
        String texto = txtBusca.getText();
        atualizaTabelaTorneio(texto);
    }//GEN-LAST:event_txtBuscaKeyReleased

    private void abasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_abasStateChanged
        if(abas.getSelectedIndex() == 1){
            controlarBotoesSuperiores(false);
            popularMemoriaTorneioAtual();
            popularMemoriaJogador();
            atualizaTabelaJogadorNoTorneio();
            atualizaTabelaJogador();           
        }else
            controlarBotoesSuperiores(true);
    }//GEN-LAST:event_abasStateChanged

    private void abasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_abasFocusGained
        
    }//GEN-LAST:event_abasFocusGained

    private void dadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dadosFocusGained
        
    }//GEN-LAST:event_dadosFocusGained

    private void txtNomeJogadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeJogadorKeyReleased
        atualizaTabelaJogador(txtNomeJogador.getText());
    }//GEN-LAST:event_txtNomeJogadorKeyReleased

    private void botaoAdicionarAoTorneioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarAoTorneioActionPerformed
        if(listaJogadores.size() > 0){
            switch(ImpressoraSwing.getInstance().impressoraConfirmacao("Confirma a inclusão do jogador "+ saberJogadorAtual().getNome() +" no torneio?")){
                case JOptionPane.YES_OPTION:
                    adicionarJogadorNoTorneio();
                    popularMemoriaTorneioAtual();
                    atualizaTabelaJogadorNoTorneio();
                    atualizaTabelaJogador();
                    break;
            }
        }
    }//GEN-LAST:event_botaoAdicionarAoTorneioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroNoTorneio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroNoTorneio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroNoTorneio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroNoTorneio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastroNoTorneio dialog = new TelaCadastroNoTorneio(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abas;
    private javax.swing.JButton botaoAdicionarAoTorneio;
    private javax.swing.JButton botaoAnterior;
    private javax.swing.JButton botaoFechar;
    private javax.swing.JButton botaoPrimeiro;
    private javax.swing.JButton botaoProximo;
    private javax.swing.JButton botaoUltimo;
    private br.wagnerpassos.swing.util.ConverterData conversorData;
    private br.wagnerpassos.swing.util.ConverterDouble conversorDouble;
    private br.wagnerpassos.swing.util.ConverterHora conversorHora;
    private javax.swing.JPanel dados;
    private javax.swing.JScrollPane jScrollPaneJogadores;
    private javax.swing.JScrollPane jScrollPaneJogadoresTorneio;
    private javax.swing.JScrollPane jScrollPaneTorneios;
    private javax.swing.JLabel lCadastradosNoTorneio;
    private javax.swing.JLabel lNomeJogador;
    private javax.swing.JLabel lNomeTorneio;
    private java.util.List<Jogador> listaJogadores;
    private java.util.List<Jogador> listaJogadoresTorneio;
    private java.util.List<Torneio> listaTorneios;
    private javax.swing.JPanel listagem;
    private javax.swing.JPanel painelAcoes;
    private javax.swing.JPanel painelBusca;
    private javax.swing.JPanel painelNavegacao;
    private javax.swing.JTable tabelaJogadores;
    private javax.swing.JTable tabelaJogadoresNoTorneio;
    private javax.swing.JTable tabelaTorneios;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtNomeJogador;
    private javax.swing.JLabel txtPesquisaNome;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
