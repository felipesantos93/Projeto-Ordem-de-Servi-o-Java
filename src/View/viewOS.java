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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
// a linnha abaixo importa recursos da biblioteca rs2xml.jar (para usar o campo de pesquisar)
import net.proteanit.sql.DbUtils;
import DAO.ConexaoBD;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Felipe
 */
public class viewOS extends javax.swing.JInternalFrame {

    Connection conn;
    PreparedStatement prst;
    ResultSet rs;

    // a linha abaixo cria uma variavel para armazenar um texto de acordo com radion button selecionado
    private String tipo;

    /**
     * Creates new form viewOS
     */
    public viewOS() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroOs = new javax.swing.JTextField();
        txtDataOS = new javax.swing.JTextField();
        rbttnOrcamento = new javax.swing.JRadioButton();
        rbttnOrdemDeServico = new javax.swing.JRadioButton();
        cbxOS = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPesquisaClienteOS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdClienteOS = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClienteOS = new javax.swing.JTable();
        txtEquipamentoOS = new javax.swing.JTextField();
        txtDefeitoOS = new javax.swing.JTextField();
        txtServicoOS = new javax.swing.JTextField();
        txtTecnicoOS = new javax.swing.JTextField();
        txtValoOS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bttnSalvarOS = new javax.swing.JButton();
        bttnExcluirOs = new javax.swing.JButton();
        bttnImprimirOS = new javax.swing.JButton();
        bttnPesquisarOs = new javax.swing.JButton();
        bttnAlterarOs = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("OS");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nº OS :");

        jLabel2.setText("Data :");

        txtNumeroOs.setEditable(false);

        txtDataOS.setEditable(false);

        buttonGroup1.add(rbttnOrcamento);
        rbttnOrcamento.setText("Orçamento");
        rbttnOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbttnOrcamentoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbttnOrdemDeServico);
        rbttnOrdemDeServico.setText("Ordem de Serviço");
        rbttnOrdemDeServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbttnOrdemDeServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbttnOrcamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbttnOrdemDeServico))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNumeroOs, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDataOS)
                                .addGap(2, 2, 2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbttnOrcamento)
                    .addComponent(rbttnOrdemDeServico))
                .addGap(26, 26, 26))
        );

        cbxOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Na Bancada", "Entrega OK", "Orçamento reprovado", "Aguardando aprovação", "Aguardando peças", "Abandonado pelo cliente", "Retornou", " " }));
        cbxOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOSActionPerformed(evt);
            }
        });

        jLabel3.setText("Situação");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-magnifying-glass-16.png"))); // NOI18N

        txtPesquisaClienteOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaClienteOSKeyReleased(evt);
            }
        });

        jLabel5.setText("* Id");

        tabelaClienteOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "NOME", "FONE"
            }
        ));
        tabelaClienteOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteOSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClienteOS);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPesquisaClienteOS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdClienteOS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesquisaClienteOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtIdClienteOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtEquipamentoOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEquipamentoOSKeyPressed(evt);
            }
        });

        txtDefeitoOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDefeitoOSKeyPressed(evt);
            }
        });

        txtServicoOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtServicoOSKeyPressed(evt);
            }
        });

        txtTecnicoOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTecnicoOSKeyPressed(evt);
            }
        });

        txtValoOS.setText("0");
        txtValoOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValoOSActionPerformed(evt);
            }
        });

        jLabel6.setText("* Equipamento:");

        jLabel7.setText("* Defeito:");

        jLabel8.setText("Serviço:");

        jLabel9.setText("Técnico:");

        jLabel10.setText("Valor Total");

        bttnSalvarOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-save-48.png"))); // NOI18N
        bttnSalvarOS.setToolTipText("Salvar");
        bttnSalvarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSalvarOSActionPerformed(evt);
            }
        });

        bttnExcluirOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-excluir-lixeira-48.png"))); // NOI18N
        bttnExcluirOs.setToolTipText("Excluir");
        bttnExcluirOs.setEnabled(false);
        bttnExcluirOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnExcluirOsActionPerformed(evt);
            }
        });

        bttnImprimirOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-enviar-para-a-impressora-48.png"))); // NOI18N
        bttnImprimirOS.setToolTipText("Imprimir");
        bttnImprimirOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnImprimirOS.setEnabled(false);
        bttnImprimirOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnImprimirOSActionPerformed(evt);
            }
        });

        bttnPesquisarOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-magnifying-glass-48.png"))); // NOI18N
        bttnPesquisarOs.setToolTipText("Pesquisar");
        bttnPesquisarOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnPesquisarOsActionPerformed(evt);
            }
        });

        bttnAlterarOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-pencil-drawing-48.png"))); // NOI18N
        bttnAlterarOs.setToolTipText("Alterar");
        bttnAlterarOs.setEnabled(false);
        bttnAlterarOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAlterarOsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxOS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEquipamentoOS))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtServicoOS)
                            .addComponent(txtDefeitoOS)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTecnicoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValoOS, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bttnSalvarOS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnPesquisarOs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnAlterarOs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnExcluirOs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnImprimirOS)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtEquipamentoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtDefeitoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtServicoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTecnicoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txtValoOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bttnPesquisarOs))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttnExcluirOs)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bttnSalvarOS)
                                .addComponent(bttnAlterarOs))
                            .addComponent(bttnImprimirOS))))
                .addContainerGap())
        );

        setBounds(0, 0, 618, 484);
    }// </editor-fold>//GEN-END:initComponents

    private void rbttnOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbttnOrcamentoActionPerformed
        //atribuindo um texto a variavel tipo se for selecionado
        tipo = "Orçamento";
    }//GEN-LAST:event_rbttnOrcamentoActionPerformed

    private void cbxOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxOSActionPerformed

    private void rbttnOrdemDeServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbttnOrdemDeServicoActionPerformed
        //atribuindo um texto a variavel tipo se for selecionado
        tipo = "Ordem de Serviço";
    }//GEN-LAST:event_rbttnOrdemDeServicoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //ao abrir o form marcar o radio button orçamento
        rbttnOrcamento.setSelected(true);
        tipo = "Orçamento";
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtPesquisaClienteOSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaClienteOSKeyReleased
        // chamando o metodo pesquisar cliente
        pesquisarClientes();
    }//GEN-LAST:event_txtPesquisaClienteOSKeyReleased

    private void bttnSalvarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSalvarOSActionPerformed
        emitirOS();

    }//GEN-LAST:event_bttnSalvarOSActionPerformed

    private void tabelaClienteOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteOSMouseClicked
        // chamando o metodo setarCampos
        setarCampos();
    }//GEN-LAST:event_tabelaClienteOSMouseClicked

    private void bttnPesquisarOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnPesquisarOsActionPerformed
        pesquisarOS();
    }//GEN-LAST:event_bttnPesquisarOsActionPerformed

    private void bttnAlterarOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAlterarOsActionPerformed
        alterarOs();
    }//GEN-LAST:event_bttnAlterarOsActionPerformed

    private void bttnExcluirOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnExcluirOsActionPerformed
        excluirOs();
    }//GEN-LAST:event_bttnExcluirOsActionPerformed

    private void txtValoOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValoOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValoOSActionPerformed

    private void bttnImprimirOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnImprimirOSActionPerformed
        ImprimindoOs();
        limparCampos();
    }//GEN-LAST:event_bttnImprimirOSActionPerformed

    private void txtEquipamentoOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquipamentoOSKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDefeitoOS.requestFocus();
        }
    }//GEN-LAST:event_txtEquipamentoOSKeyPressed

    private void txtDefeitoOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDefeitoOSKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtServicoOS.requestFocus();
        }
    }//GEN-LAST:event_txtDefeitoOSKeyPressed

    private void txtServicoOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServicoOSKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTecnicoOS.requestFocus();
        }
    }//GEN-LAST:event_txtServicoOSKeyPressed

    private void txtTecnicoOSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTecnicoOSKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtValoOS.requestFocus();
        }
    }//GEN-LAST:event_txtTecnicoOSKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAlterarOs;
    private javax.swing.JButton bttnExcluirOs;
    private javax.swing.JButton bttnImprimirOS;
    private javax.swing.JButton bttnPesquisarOs;
    private javax.swing.JButton bttnSalvarOS;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbttnOrcamento;
    private javax.swing.JRadioButton rbttnOrdemDeServico;
    private javax.swing.JTable tabelaClienteOS;
    private javax.swing.JTextField txtDataOS;
    private javax.swing.JTextField txtDefeitoOS;
    private javax.swing.JTextField txtEquipamentoOS;
    private javax.swing.JTextField txtIdClienteOS;
    private javax.swing.JTextField txtNumeroOs;
    private javax.swing.JTextField txtPesquisaClienteOS;
    private javax.swing.JTextField txtServicoOS;
    private javax.swing.JTextField txtTecnicoOS;
    private javax.swing.JTextField txtValoOS;
    // End of variables declaration//GEN-END:variables

    //método para  pesquisar clientes pelo nome com filtro
    private void pesquisarClientes() {

        // as linhas abaixo criam um apelido aos campos da tabela
        String sql = "SELECT id_cliente AS CODIGO, nome_cliente AS NOME, fone_cliente AS FONE FROM tbl_clientes WHERE nome_cliente LIKE ?";
        try {
            prst = conn.prepareStatement(sql);
            //passando o conteúdo da caixa de pesquisa para o ?
            //atenção ao "%" pois ele é a continuação da String slq
            prst.setString(1, txtPesquisaClienteOS.getText() + "%");
            rs = prst.executeQuery();
            // a linha abaixo usa biblioteca rs2xml.jar para preencher a tabela
            tabelaClienteOS.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PesquisarClientes: " + erro);
        }
    }

    private void setarCampos() {
        int setar = tabelaClienteOS.getSelectedRow();
        txtIdClienteOS.setText(tabelaClienteOS.getModel().getValueAt(setar, 0).toString());

    }

    //metodo para cadastrar os
    private void emitirOS() {

        String sql = "INSERT INTO tbl_os (tipo, situacao , equipamento, defeito, servico,tecnico, valor, id_cliente ) VALUES (?,?,?,?,?,?,?,?)";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, tipo);
            prst.setString(2, cbxOS.getSelectedItem().toString());
            prst.setString(3, txtEquipamentoOS.getText());
            prst.setString(4, txtDefeitoOS.getText());
            prst.setString(5, txtServicoOS.getText());
            prst.setString(6, txtTecnicoOS.getText());
            prst.setString(7, txtValoOS.getText().replace(",", "."));
            prst.setString(8, txtIdClienteOS.getText());

            //validacao dos campos obrigatorios
            if ((txtIdClienteOS.getText().isEmpty()) || (txtEquipamentoOS.getText().isEmpty()) || (txtDefeitoOS.getText().isEmpty()) || cbxOS.getSelectedItem().equals(" ")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                prst.executeUpdate();
                JOptionPane.showMessageDialog(null, "OS emitida com sucesso!");
                //recuperar os
                recuperarOs();
                bttnSalvarOS.setEnabled(false);
                bttnPesquisarOs.setEnabled(false);
                bttnImprimirOS.setEnabled(true);
                prst.close();
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "emitirOs: " + erro);
        }
    }
    // gerenciador de botoes

    private void limparCampos() {
        //limpar campos
        txtDataOS.setText(" ");
        txtIdClienteOS.setText(" ");
        txtNumeroOs.setText(" ");
        txtEquipamentoOS.setText(" ");
        txtDefeitoOS.setText(" ");
        txtServicoOS.setText(" ");
        txtTecnicoOS.setText(" ");
        txtValoOS.setText("0");
        txtPesquisaClienteOS.setText(" ");
        ((DefaultTableModel) tabelaClienteOS.getModel()).setRowCount(0);
        cbxOS.setSelectedItem(" ");
        //habilitar objetos
        bttnSalvarOS.setEnabled(true);
        bttnPesquisarOs.setEnabled(true);
        txtPesquisaClienteOS.setEnabled(true);
        tabelaClienteOS.setVisible(true);
        //desabilitar objetos
        bttnAlterarOs.setEnabled(false);
        bttnExcluirOs.setEnabled(false);
        bttnImprimirOS.setEnabled(false);

    }
    // método abaixo pesquisa Osad

    private void pesquisarOS() {
        //a linha abaixo cria uma caixa de entrada do tipo JOption pane
        String num_os = JOptionPane.showInputDialog("número da OS");
        String sql = " SELECT os, date_format(data_os,'%d/%m/%Y - %H:%i'), tipo, situacao, equipamento, defeito, servico, tecnico, valor, id_cliente FROM tbl_os WHERE os = " + num_os;
        try {
            prst = conn.prepareStatement(sql);
            rs = prst.executeQuery();
            if (rs.next()) {
                txtNumeroOs.setText(rs.getString(1));
                txtDataOS.setText(rs.getString(2));
                //setando os radio buttons
                String rbtTipo = rs.getString(3);
                if (rbtTipo.equals("Orçamento")) {
                    rbttnOrcamento.setSelected(true);
                    tipo = "Orçamento";

                } else {
                    rbttnOrdemDeServico.setSelected(true);
                    tipo = "Ordem de Serviço";
                }
                cbxOS.setSelectedItem(rs.getString(4));
                txtEquipamentoOS.setText(rs.getString(5));
                txtDefeitoOS.setText(rs.getString(6));
                txtServicoOS.setText(rs.getString(7));
                txtTecnicoOS.setText(rs.getString(8));
                txtValoOS.setText(rs.getString(9));
                txtIdClienteOS.setText(rs.getString(10));
                //evitando problemas com o botao salvar
                bttnSalvarOS.setEnabled(false);
                bttnPesquisarOs.setEnabled(false);
                txtPesquisaClienteOS.setEnabled(false);
                tabelaClienteOS.setVisible(false);
                //habilitar botoes
                bttnAlterarOs.setEnabled(true);
                bttnExcluirOs.setEnabled(true);
                bttnImprimirOS.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "OS não cadastrada");
            }
        } catch (java.sql.SQLSyntaxErrorException erro) {
            JOptionPane.showMessageDialog(null, "OS inválida");
        } catch (SQLException erro2) {
            JOptionPane.showMessageDialog(null, erro2);

        }
    }

    private void alterarOs() {

        String sql = "UPDATE tbl_os SET tipo = ? , situacao = ?, equipamento = ?, defeito = ?, servico = ?, tecnico = ?, valor = ? WHERE os = ?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, tipo);
            prst.setString(2, cbxOS.getSelectedItem().toString());
            prst.setString(3, txtEquipamentoOS.getText());
            prst.setString(4, txtDefeitoOS.getText());
            prst.setString(5, txtServicoOS.getText());
            prst.setString(6, txtTecnicoOS.getText());
            //substitui , po .
            prst.setString(7, txtValoOS.getText().replace(",", "."));
            prst.setString(8, txtNumeroOs.getText());

            //validacao dos campos obrigatorios
            if ((txtIdClienteOS.getText().isEmpty()) || (txtEquipamentoOS.getText().isEmpty()) || (txtDefeitoOS.getText().isEmpty()) || cbxOS.getSelectedItem().equals(" ")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                prst.executeUpdate();
                JOptionPane.showMessageDialog(null, "OS alterada com sucesso!");
                limparCampos();
                prst.close();
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "alterarOs" + erro);

        }
    }

    private void excluirOs() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem ceteza que deseja excluir essa OS?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_NO_OPTION) {
            String sql = "DELETE FROM tbl_os WHERE os = ?";
            try {
                prst = conn.prepareStatement(sql);
                prst.setString(1, txtNumeroOs.getText());
                prst.executeUpdate();
                JOptionPane.showMessageDialog(null, "OS excluida com sucesso!");
                limparCampos();

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "excluirOs" + erro);
            }

        }

    }

    private void ImprimindoOs() {
        // gerando impressão Os
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão de Os?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_NO_OPTION) {
            // imprimindo Os com o framework jasperReport
            try {
                //usando a classe HashMap para criar um filtro por periodo  
                HashMap filtro = new HashMap();
                filtro.put("os", Integer.parseInt(txtNumeroOs.getText()));
                // usando a classe JasperPrint para preparar a impressão de Os
                JasperPrint print = JasperFillManager.fillReport("C:/reports/os.jasper", filtro, conn);
                // a linha abaixo exibi o relatorio atraves da classe JasperViewer
                JasperViewer.viewReport(print, false);
            } catch (JRException erro) {
                JOptionPane.showMessageDialog(null, "Imprimindo Os" + erro);
            }

        }
    }

    private void recuperarOs() {
        // esse método corrige bug na impressão da Os logo depois de cadastrada, pois recuperar o ultimo numero da Os que é gerado automaticamente. 
        String sql;
        sql = "SELECT max(os)FROM tbl_os";
        try {
            prst = conn.prepareStatement(sql);
            rs = prst.executeQuery();
            if (rs.next()) {
                txtNumeroOs.setText(rs.getString(1));
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }

}
