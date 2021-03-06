/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.wagnerpassos.visao;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author wagne
 */
public class TelaPrincipalArt extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipalArt
     */
    public TelaPrincipalArt() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        painelLateral = new javax.swing.JPanel();
        painelBotaoPrincipal = new javax.swing.JPanel();
        lFotoPrincipal = new javax.swing.JLabel();
        lTextoPrincipal = new javax.swing.JLabel();
        painelBotaoUsuario = new javax.swing.JPanel();
        lFotoUsuario = new javax.swing.JLabel();
        lTextoUsuario = new javax.swing.JLabel();
        painelBotaoTorneio = new javax.swing.JPanel();
        lFotoTorneio = new javax.swing.JLabel();
        lTextoTorneio = new javax.swing.JLabel();
        painelBotaoAdministracao = new javax.swing.JPanel();
        lFotoAdm = new javax.swing.JLabel();
        lTextoAdm = new javax.swing.JLabel();
        painelBotaoRelatorio = new javax.swing.JPanel();
        lFotoRelatorio = new javax.swing.JLabel();
        lTextoRelatorio = new javax.swing.JLabel();
        lNomeLoja = new javax.swing.JLabel();
        lLogado = new javax.swing.JLabel();
        separadorNomeLoje = new javax.swing.JSeparator();
        painelSuperior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        painelFundo.setBackground(new java.awt.Color(255, 255, 255));
        painelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelLateral.setBackground(new java.awt.Color(49, 56, 155));
        painelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelBotaoPrincipal.setBackground(new java.awt.Color(49, 56, 155));
        painelBotaoPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelBotaoPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelBotaoPrincipalMouseExited(evt);
            }
        });

        lFotoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Home_18px.png"))); // NOI18N

        lTextoPrincipal.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lTextoPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        lTextoPrincipal.setText("Principal");
        lTextoPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lTextoPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lTextoPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lTextoPrincipalMouseExited(evt);
            }
        });

        javax.swing.GroupLayout painelBotaoPrincipalLayout = new javax.swing.GroupLayout(painelBotaoPrincipal);
        painelBotaoPrincipal.setLayout(painelBotaoPrincipalLayout);
        painelBotaoPrincipalLayout.setHorizontalGroup(
            painelBotaoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotaoPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lFotoPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(lTextoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        painelBotaoPrincipalLayout.setVerticalGroup(
            painelBotaoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotaoPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotaoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lFotoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lTextoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        painelLateral.add(painelBotaoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, 50));

        painelBotaoUsuario.setBackground(new java.awt.Color(49, 56, 155));
        painelBotaoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelBotaoUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelBotaoUsuarioMouseExited(evt);
            }
        });

        lFotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_User_Account_18px.png"))); // NOI18N

        lTextoUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lTextoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lTextoUsuario.setText("Jogador");
        lTextoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lTextoUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lTextoUsuarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout painelBotaoUsuarioLayout = new javax.swing.GroupLayout(painelBotaoUsuario);
        painelBotaoUsuario.setLayout(painelBotaoUsuarioLayout);
        painelBotaoUsuarioLayout.setHorizontalGroup(
            painelBotaoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotaoUsuarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lFotoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(lTextoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        painelBotaoUsuarioLayout.setVerticalGroup(
            painelBotaoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotaoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotaoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lFotoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lTextoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        painelLateral.add(painelBotaoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, 50));

        painelBotaoTorneio.setBackground(new java.awt.Color(49, 56, 155));
        painelBotaoTorneio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelBotaoTorneioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelBotaoTorneioMouseExited(evt);
            }
        });

        lFotoTorneio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Tournament_18px.png"))); // NOI18N

        lTextoTorneio.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lTextoTorneio.setForeground(new java.awt.Color(255, 255, 255));
        lTextoTorneio.setText("Torneio");
        lTextoTorneio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lTextoTorneioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lTextoTorneioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout painelBotaoTorneioLayout = new javax.swing.GroupLayout(painelBotaoTorneio);
        painelBotaoTorneio.setLayout(painelBotaoTorneioLayout);
        painelBotaoTorneioLayout.setHorizontalGroup(
            painelBotaoTorneioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotaoTorneioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lFotoTorneio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(lTextoTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        painelBotaoTorneioLayout.setVerticalGroup(
            painelBotaoTorneioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotaoTorneioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotaoTorneioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lFotoTorneio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lTextoTorneio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        painelLateral.add(painelBotaoTorneio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, 50));

        painelBotaoAdministracao.setBackground(new java.awt.Color(49, 56, 155));
        painelBotaoAdministracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelBotaoAdministracaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelBotaoAdministracaoMouseExited(evt);
            }
        });

        lFotoAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Database_Administrator_18px.png"))); // NOI18N

        lTextoAdm.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lTextoAdm.setForeground(new java.awt.Color(255, 255, 255));
        lTextoAdm.setText("Administração");
        lTextoAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lTextoAdmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lTextoAdmMouseExited(evt);
            }
        });

        javax.swing.GroupLayout painelBotaoAdministracaoLayout = new javax.swing.GroupLayout(painelBotaoAdministracao);
        painelBotaoAdministracao.setLayout(painelBotaoAdministracaoLayout);
        painelBotaoAdministracaoLayout.setHorizontalGroup(
            painelBotaoAdministracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotaoAdministracaoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lFotoAdm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(lTextoAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        painelBotaoAdministracaoLayout.setVerticalGroup(
            painelBotaoAdministracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotaoAdministracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotaoAdministracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lFotoAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lTextoAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        painelLateral.add(painelBotaoAdministracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, 50));

        painelBotaoRelatorio.setBackground(new java.awt.Color(49, 56, 155));
        painelBotaoRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelBotaoRelatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelBotaoRelatorioMouseExited(evt);
            }
        });

        lFotoRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Report_Card_18px.png"))); // NOI18N

        lTextoRelatorio.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lTextoRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        lTextoRelatorio.setText("Relatórios");
        lTextoRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lTextoRelatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lTextoRelatorioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout painelBotaoRelatorioLayout = new javax.swing.GroupLayout(painelBotaoRelatorio);
        painelBotaoRelatorio.setLayout(painelBotaoRelatorioLayout);
        painelBotaoRelatorioLayout.setHorizontalGroup(
            painelBotaoRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotaoRelatorioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lFotoRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(lTextoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        painelBotaoRelatorioLayout.setVerticalGroup(
            painelBotaoRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotaoRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotaoRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lFotoRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lTextoRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        painelLateral.add(painelBotaoRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, 50));

        lNomeLoja.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lNomeLoja.setForeground(new java.awt.Color(255, 255, 255));
        lNomeLoja.setText("MinhaLoja");
        painelLateral.add(lNomeLoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 220, 80));

        lLogado.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lLogado.setForeground(new java.awt.Color(204, 204, 204));
        lLogado.setText("      Logado como: [Wagner Passos]");
        lLogado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lLogadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lLogadoMouseExited(evt);
            }
        });
        painelLateral.add(lLogado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 260, 20));
        painelLateral.add(separadorNomeLoje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 20));

        painelFundo.add(painelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 610));

        painelSuperior.setBackground(new java.awt.Color(80, 86, 168));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Principal");

        javax.swing.GroupLayout painelSuperiorLayout = new javax.swing.GroupLayout(painelSuperior);
        painelSuperior.setLayout(painelSuperiorLayout);
        painelSuperiorLayout.setHorizontalGroup(
            painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuperiorLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        painelSuperiorLayout.setVerticalGroup(
            painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuperiorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        painelFundo.add(painelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 760, 140));

        lX.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lX.setForeground(new java.awt.Color(49, 56, 155));
        lX.setText("X");
        lX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lXMouseExited(evt);
            }
        });
        painelFundo.add(lX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 20, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lXMouseExited
        lX.setForeground(new Color(49,56,155));
    }//GEN-LAST:event_lXMouseExited

    private void lXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lXMouseEntered
        lX.setForeground(Color.orange);
    }//GEN-LAST:event_lXMouseEntered

    private void lXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lXMouseClicked

    private void lLogadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lLogadoMouseExited
        lLogado.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_lLogadoMouseExited

    private void lLogadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lLogadoMouseEntered
        lLogado.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_lLogadoMouseEntered

    private void painelBotaoRelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBotaoRelatorioMouseExited
        painelBotaoRelatorio.setBackground(new Color(49,56,155));
    }//GEN-LAST:event_painelBotaoRelatorioMouseExited

    private void painelBotaoRelatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBotaoRelatorioMouseEntered
        painelBotaoRelatorio.setBackground(new Color(76,84,198));
    }//GEN-LAST:event_painelBotaoRelatorioMouseEntered

    private void lTextoRelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTextoRelatorioMouseExited
        painelBotaoRelatorio.setBackground(new Color(49,56,155));
    }//GEN-LAST:event_lTextoRelatorioMouseExited

    private void lTextoRelatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTextoRelatorioMouseEntered
        painelBotaoRelatorio.setBackground(new Color(76,84,198));
    }//GEN-LAST:event_lTextoRelatorioMouseEntered

    private void painelBotaoAdministracaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBotaoAdministracaoMouseExited
        painelBotaoAdministracao.setBackground(new Color(49,56,155));
    }//GEN-LAST:event_painelBotaoAdministracaoMouseExited

    private void painelBotaoAdministracaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBotaoAdministracaoMouseEntered
        painelBotaoAdministracao.setBackground(new Color(76,84,198));
    }//GEN-LAST:event_painelBotaoAdministracaoMouseEntered

    private void lTextoAdmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTextoAdmMouseExited
        painelBotaoAdministracao.setBackground(new Color(49,56,155));
    }//GEN-LAST:event_lTextoAdmMouseExited

    private void lTextoAdmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTextoAdmMouseEntered
        painelBotaoAdministracao.setBackground(new Color(76,84,198));
    }//GEN-LAST:event_lTextoAdmMouseEntered

    private void painelBotaoTorneioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBotaoTorneioMouseExited
        painelBotaoTorneio.setBackground(new Color(49,56,155));
    }//GEN-LAST:event_painelBotaoTorneioMouseExited

    private void painelBotaoTorneioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBotaoTorneioMouseEntered
        painelBotaoTorneio.setBackground(new Color(76,84,198));
    }//GEN-LAST:event_painelBotaoTorneioMouseEntered

    private void lTextoTorneioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTextoTorneioMouseExited
        painelBotaoTorneio.setBackground(new Color(49,56,155));
    }//GEN-LAST:event_lTextoTorneioMouseExited

    private void lTextoTorneioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTextoTorneioMouseEntered
        painelBotaoTorneio.setBackground(new Color(76,84,198));
    }//GEN-LAST:event_lTextoTorneioMouseEntered

    private void painelBotaoUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBotaoUsuarioMouseExited
        painelBotaoUsuario.setBackground(new Color(49,56,155));
    }//GEN-LAST:event_painelBotaoUsuarioMouseExited

    private void painelBotaoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBotaoUsuarioMouseEntered
        painelBotaoUsuario.setBackground(new Color(76,84,198));
    }//GEN-LAST:event_painelBotaoUsuarioMouseEntered

    private void lTextoUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTextoUsuarioMouseExited
        painelBotaoUsuario.setBackground(new Color(49,56,155));
    }//GEN-LAST:event_lTextoUsuarioMouseExited

    private void lTextoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTextoUsuarioMouseEntered
        painelBotaoUsuario.setBackground(new Color(76,84,198));
    }//GEN-LAST:event_lTextoUsuarioMouseEntered

    private void painelBotaoPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBotaoPrincipalMouseExited
        painelBotaoPrincipal.setBackground(new Color(49,56,155));
    }//GEN-LAST:event_painelBotaoPrincipalMouseExited

    private void painelBotaoPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBotaoPrincipalMouseEntered
        painelBotaoPrincipal.setBackground(new Color(76,84,198));
    }//GEN-LAST:event_painelBotaoPrincipalMouseEntered

    private void lTextoPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTextoPrincipalMouseExited
        painelBotaoPrincipal.setBackground(new Color(49,56,155));
    }//GEN-LAST:event_lTextoPrincipalMouseExited

    private void lTextoPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTextoPrincipalMouseEntered
        painelBotaoPrincipal.setBackground(new Color(76,84,198));
    }//GEN-LAST:event_lTextoPrincipalMouseEntered

    private void lTextoPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTextoPrincipalMouseClicked

    }//GEN-LAST:event_lTextoPrincipalMouseClicked
        
    
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
            java.util.logging.Logger.getLogger(TelaPrincipalArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaPrincipalArt tela = new TelaPrincipalArt();
                tela.setVisible(true);
                TelaPrincipalArt.FrameDragListener fdl = new TelaPrincipalArt.FrameDragListener(tela);
                tela.addMouseListener(fdl);
                tela.addMouseMotionListener(fdl);
            }
        });
    }
    
    public static class FrameDragListener extends MouseAdapter {

        private final JFrame frame;
        private Point mouseDownCompCoords = null;

        public FrameDragListener(JFrame frame) {
            this.frame = frame;
        }

        public void mouseReleased(MouseEvent e) {
            mouseDownCompCoords = null;
        }

        public void mousePressed(MouseEvent e) {
            mouseDownCompCoords = e.getPoint();
        }

        public void mouseDragged(MouseEvent e) {
            Point currCoords = e.getLocationOnScreen();
            frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lFotoAdm;
    private javax.swing.JLabel lFotoPrincipal;
    private javax.swing.JLabel lFotoRelatorio;
    private javax.swing.JLabel lFotoTorneio;
    private javax.swing.JLabel lFotoUsuario;
    private javax.swing.JLabel lLogado;
    private javax.swing.JLabel lNomeLoja;
    private javax.swing.JLabel lTextoAdm;
    private javax.swing.JLabel lTextoPrincipal;
    private javax.swing.JLabel lTextoRelatorio;
    private javax.swing.JLabel lTextoTorneio;
    private javax.swing.JLabel lTextoUsuario;
    private javax.swing.JLabel lX;
    private javax.swing.JPanel painelBotaoAdministracao;
    private javax.swing.JPanel painelBotaoPrincipal;
    private javax.swing.JPanel painelBotaoRelatorio;
    private javax.swing.JPanel painelBotaoTorneio;
    private javax.swing.JPanel painelBotaoUsuario;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelLateral;
    private javax.swing.JPanel painelSuperior;
    private javax.swing.JSeparator separadorNomeLoje;
    // End of variables declaration//GEN-END:variables
}
