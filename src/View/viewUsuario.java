/*
 * The MIT License
 *
 * Copyright 2023 Felipe dos Santos.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package view;

import java.sql.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import DAO.ConexaoBD;

/**
 *
 * @author Felipe
 */
public class viewUsuario extends javax.swing.JInternalFrame {

    Connection conn;
    PreparedStatement prst;
    ResultSet rs;

    /**
     * Creates new form viewUsuario
     */
    public viewUsuario() {
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

        bttnAlterar = new javax.swing.JButton();
        bttnConsultar = new javax.swing.JButton();
        bttnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        bttnCadastrar = new javax.swing.JButton();
        txtNomeUsuario = new javax.swing.JTextField();
        txtCodigoUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLoginUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        cbxPerfil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuário");
        setPreferredSize(new java.awt.Dimension(670, 565));

        bttnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-pencil-drawing-48.png"))); // NOI18N
        bttnAlterar.setToolTipText("Alterar");
        bttnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAlterarActionPerformed(evt);
            }
        });

        bttnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-magnifying-glass-48.png"))); // NOI18N
        bttnConsultar.setToolTipText("Consultar");
        bttnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnConsultarActionPerformed(evt);
            }
        });

        bttnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-excluir-lixeira-48.png"))); // NOI18N
        bttnExcluir.setToolTipText("Excluir");
        bttnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnExcluirActionPerformed(evt);
            }
        });

        tabelaUsuario = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOME", "LOGIN", "PERFIL"
            }
        ));
        tabelaUsuario.setFocusable(false);
        tabelaUsuario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaUsuario);
        if (tabelaUsuario.getColumnModel().getColumnCount() > 0) {
            tabelaUsuario.getColumnModel().getColumn(1).setMinWidth(200);
            tabelaUsuario.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        bttnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-save-48.png"))); // NOI18N
        bttnCadastrar.setToolTipText("Cadastrar");
        bttnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCadastrarActionPerformed(evt);
            }
        });

        txtNomeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeUsuarioKeyPressed(evt);
            }
        });

        jLabel1.setText("* Código:");

        jLabel2.setText("* Nome:");

        txtLoginUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginUsuarioKeyPressed(evt);
            }
        });

        jLabel3.setText("* Login:");

        txtSenhaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaUsuarioKeyPressed(evt);
            }
        });

        jLabel4.setText("* Senha:");

        cbxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "USUARIO" }));

        jLabel6.setText(" Perfil:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(33, 33, 33))
                            .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbxPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(bttnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(0, 0, 618, 484);
    }// </editor-fold>//GEN-END:initComponents

    private void bttnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCadastrarActionPerformed

        cadastrarUsuario();
        limparCampos();
    }//GEN-LAST:event_bttnCadastrarActionPerformed

    private void bttnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnExcluirActionPerformed
        excluirUsuario();
        limparCampos();
    }//GEN-LAST:event_bttnExcluirActionPerformed

    private void bttnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAlterarActionPerformed
        alterarUsuario();
        limparCampos();
    }//GEN-LAST:event_bttnAlterarActionPerformed

    private void bttnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnConsultarActionPerformed
        consultarUsuario();
    }//GEN-LAST:event_bttnConsultarActionPerformed

    private void txtNomeUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeUsuarioKeyPressed
        //apertar enter para ir para o proximo campo
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoginUsuario.requestFocus();
        }
    }//GEN-LAST:event_txtNomeUsuarioKeyPressed

    private void txtLoginUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginUsuarioKeyPressed
        //apertar enter para ir para o proximo campo
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtSenhaUsuario.requestFocus();
        }
    }//GEN-LAST:event_txtLoginUsuarioKeyPressed

    private void txtSenhaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaUsuarioKeyPressed
        //apertar enter para ir para o proximo campo
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbxPerfil.requestFocus();
        }
    }//GEN-LAST:event_txtSenhaUsuarioKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAlterar;
    private javax.swing.JButton bttnCadastrar;
    private javax.swing.JButton bttnConsultar;
    private javax.swing.JButton bttnExcluir;
    private javax.swing.JComboBox<String> cbxPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JTextField txtLoginUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables
// metodo de consulta usuario

    public void consultarUsuario() {
        String sql = "SELECT *FROM tbl_usuario WHERE id_usuario = ?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, txtCodigoUsuario.getText());
            rs = prst.executeQuery();
            if (rs.next()) {
                txtNomeUsuario.setText(rs.getString(2));
                txtLoginUsuario.setText(rs.getString(3));
                txtSenhaUsuario.setText(rs.getString(4));
                //a linha abaixo refere ao combobox
                cbxPerfil.setSelectedItem(rs.getString(5));
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");
                limparCampos();
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }

//metodo para limpar campos
    public void limparCampos() {
        txtNomeUsuario.setText("");
        txtLoginUsuario.setText("");
        txtSenhaUsuario.setText("");
        txtCodigoUsuario.setText("");
        txtCodigoUsuario.requestFocus();

    }

// metodo para cadastrar usuario
    public void cadastrarUsuario() {
        String sql = "INSERT INTO tbl_usuario (id_usuario, nome_usuario, login_usuario , senha_usuario, perfil) VALUES (?,?,?,?,?)";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, txtCodigoUsuario.getText());
            prst.setString(2, txtNomeUsuario.getText());
            prst.setString(3, txtLoginUsuario.getText());
            prst.setString(4, String.valueOf(txtSenhaUsuario.getPassword()));
            prst.setString(5, cbxPerfil.getSelectedItem().toString());
            // a linha abaixo atualiza a tabela usuario com os dados do formulario
            if ((txtCodigoUsuario.getText().isEmpty()) | (txtNomeUsuario.getText().isEmpty()) | (txtLoginUsuario.getText().isEmpty()) | (txtSenhaUsuario.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios!");
            } else {
                prst.executeUpdate();
                prst.close();
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado!" + erro);

        }
    }
// metodo para alterar dados do usuario

    private void alterarUsuario() {
        String sql = "UPDATE tbl_usuario SET nome_usuario = ? ,login_usuario = ? , senha_usuario = ?, perfil= ? WHERE id_usuario = ?";
        try {
            prst = conn.prepareStatement(sql);

            prst.setString(1, txtNomeUsuario.getText());
            prst.setString(2, txtLoginUsuario.getText());
            prst.setString(3, String.valueOf(txtSenhaUsuario.getPassword()));
            prst.setString(4, cbxPerfil.getSelectedItem().toString());
            prst.setString(5, txtCodigoUsuario.getText());
            // a linha abaixo atualiza a tabela usuario com os dados do formulario
            if ((txtCodigoUsuario.getText().isEmpty()) | (txtNomeUsuario.getText().isEmpty()) | (txtLoginUsuario.getText().isEmpty()) | (txtSenhaUsuario.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios!");
            } else {
                prst.executeUpdate();
                prst.close();
                JOptionPane.showMessageDialog(null, "Dados do usuário alterado com sucesso!");

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar usuário !" + erro);

        }
    }

    //metodo para excluir usuario
    private void excluirUsuario() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este usuário ?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM tbl_usuario WHERE id_usuario= ?";
            try {
                prst = conn.prepareStatement(sql);
                prst.setString(1, txtCodigoUsuario.getText());
                prst.executeUpdate();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, erro);
            }

        }

    }

}
