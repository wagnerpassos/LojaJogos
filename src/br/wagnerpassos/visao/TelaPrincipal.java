/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.visao;

import br.wagnerpassos.fabrica.ConnectionFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author wagne
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormularioPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        telaLogin();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGeral = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        botaoPrincipal = new javax.swing.JMenu();
        botaoCadastro = new javax.swing.JMenu();
        menuJogador = new javax.swing.JMenuItem();
        menuTorneio = new javax.swing.JMenuItem();
        botaoRelatorio = new javax.swing.JMenu();
        botaoEventos = new javax.swing.JMenu();
        menuInicioTorneio = new javax.swing.JMenuItem();
        botaoAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema - NOMEDALOJA");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout painelGeralLayout = new javax.swing.GroupLayout(painelGeral);
        painelGeral.setLayout(painelGeralLayout);
        painelGeralLayout.setHorizontalGroup(
            painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 871, Short.MAX_VALUE)
        );
        painelGeralLayout.setVerticalGroup(
            painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        botaoPrincipal.setText("Principal");
        botaoPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuBar1.add(botaoPrincipal);

        botaoCadastro.setText("Cadastro");
        botaoCadastro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        menuJogador.setBackground(new java.awt.Color(255, 255, 255));
        menuJogador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuJogador.setText("Jogador");
        menuJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuJogadorActionPerformed(evt);
            }
        });
        botaoCadastro.add(menuJogador);

        menuTorneio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuTorneio.setText("Torneio");
        menuTorneio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTorneioActionPerformed(evt);
            }
        });
        botaoCadastro.add(menuTorneio);

        jMenuBar1.add(botaoCadastro);

        botaoRelatorio.setText("Relatório");
        botaoRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuBar1.add(botaoRelatorio);

        botaoEventos.setText("Eventos");
        botaoEventos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botaoEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEventosActionPerformed(evt);
            }
        });

        menuInicioTorneio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuInicioTorneio.setText("Iniciar Torneio");
        menuInicioTorneio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioTorneioActionPerformed(evt);
            }
        });
        botaoEventos.add(menuInicioTorneio);

        jMenuBar1.add(botaoEventos);

        botaoAjuda.setText("Ajuda");
        botaoAjuda.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        menuSobre.setText("Sobre");
        botaoAjuda.add(menuSobre);

        jMenuBar1.add(botaoAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJogadorActionPerformed
        TelaJogador tela = new TelaJogador(this, true);
        tela.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        tela.setTitle("Manutenção de Jogadores");
        tela.setLocationRelativeTo(null);
        tela.setResizable(false);
        tela.setVisible(true);
    }//GEN-LAST:event_menuJogadorActionPerformed

    private void menuTorneioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTorneioActionPerformed
        TelaTorneio tela = new TelaTorneio(this, true);
        tela.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        tela.setTitle("Manutenção de Torneios");
        tela.setLocationRelativeTo(null);
        tela.setResizable(false);
        tela.setVisible(true);
    }//GEN-LAST:event_menuTorneioActionPerformed
   
    public void telaLogin(){
        TelaLogin tela = new TelaLogin(this, true);
        tela.setLocationRelativeTo(null);
        TelaLogin.DialogDragListener dfl = new TelaLogin.DialogDragListener(tela);
        tela.addMouseListener(dfl);
        tela.addMouseMotionListener(dfl);
        tela.setVisible(true);
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ConnectionFactory.getInstance().closeAll();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(this.getExtendedState()|JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setExtendedState(this.getExtendedState()|JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowActivated

    private void botaoEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEventosActionPerformed

    }//GEN-LAST:event_botaoEventosActionPerformed

    private void menuInicioTorneioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioTorneioActionPerformed
        TelaCadastroNoTorneio formulario = new TelaCadastroNoTorneio(this, true);
        formulario.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        formulario.setTitle("Manutenção de Torneios");
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(false);
        formulario.setVisible(true);
    }//GEN-LAST:event_menuInicioTorneioActionPerformed

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
                if ("Mac OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaPrincipal().setVisible(true);
                TelaPrincipal formulario = new TelaPrincipal();
                formulario.setLocationRelativeTo(null);
                formulario.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu botaoAjuda;
    private javax.swing.JMenu botaoCadastro;
    private javax.swing.JMenu botaoEventos;
    private javax.swing.JMenu botaoPrincipal;
    private javax.swing.JMenu botaoRelatorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuInicioTorneio;
    private javax.swing.JMenuItem menuJogador;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JMenuItem menuTorneio;
    private javax.swing.JPanel painelGeral;
    // End of variables declaration//GEN-END:variables
}
