/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.KeyEvent;
import DAO.ConexaoBD;

/**
 *
 * @author Felipe
 */
public class viewLogin extends javax.swing.JFrame {
    Connection conn ;  
    PreparedStatement prst;
    ResultSet rs ;

    
   
    /**
     * Creates new form viewLogin
     */
    public viewLogin() {
        initComponents();
        conn = ConexaoBD.conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLoginUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSenhaUsuario = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("System OS");

        bttnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bttnEntrar.setText("Entrar");
        bttnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEntrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Senha");

        txtLoginUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginUsuarioKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Ordem de Serviço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLoginUsuario)
                            .addComponent(txtSenhaUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(bttnEntrar)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnEntrar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEntrarActionPerformed
    logar();
    }//GEN-LAST:event_bttnEntrarActionPerformed

    private void txtLoginUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginUsuarioKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            txtSenhaUsuario.requestFocus();
        }
    }//GEN-LAST:event_txtLoginUsuarioKeyPressed

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
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtLoginUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables

    //logar usuario no sistema
    private void logar() {
        try {
            // as  linhas abaixo preparam  a consulta em função do que foi digitado nas caixas de texto. 
            //O ? é substituido pelo conteudo das variaveis que são armazenadas em prst.setSting
            String sql = "SELECT * FROM tbl_usuario WHERE login_usuario= ? and senha_usuario = ?";
            prst = conn.prepareStatement(sql);
            prst.setString(1, txtLoginUsuario.getText());
            prst.setString(2, String.valueOf(txtSenhaUsuario.getPassword()));

            //a linha abaixo executa a query(consulta)
            rs = prst.executeQuery();
            //se exitir um usuario e uma senha correspondente
            if (rs.next()) {
                // a linha abaixo obtem o conteudo do campo perfil da tbl_usuario
                String perfil = rs.getString(5);
                // as linhas abaixo fazem o tratamento do perfil do usuario, para saber se ele tem acesso a determinados recursos. 
                //Se o perfil fo "admin" tem acesso a relatorio e cadatros de novos usuarios.
                if (perfil.equals("admin")) {
                    viewPrincipal objPrincipal = new viewPrincipal();
                    objPrincipal.setVisible(true); // mostrar tela
                    //acesso pelo menu
                    viewPrincipal.menRelatorio.setEnabled(true);
                    viewPrincipal.menCadastroUsuario.setEnabled(true);
                    viewPrincipal.lblUsuario.setText(rs.getString(2)); //exibe o nome do usuario na tela
                    viewPrincipal.lblUsuario.setForeground(Color.red);
                    //acesso pelos botões
                    viewPrincipal.bttnUsuario.setEnabled(true);
                    dispose(); // fechar tela 
                } else {
                    //Se o perfil não for "admin" tem acesso apenas a pagina principal sem o demais recusos.
                    viewPrincipal objPrincipal = new viewPrincipal();
                    objPrincipal.setVisible(true); // mostrar tela
                    viewPrincipal.lblUsuario.setText(rs.getString(2)); //exibe o nome do usuario na tel
                    dispose(); // fechar tela 
                }
            } else {
                // enviar mensagem de erro
                JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválida");
            }
                //preparaçao e execuçao com sucesso = usuario autenticado. 
        } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
                 //usuario não autenticado, vai retornar um excessão.
        }
    }
}

