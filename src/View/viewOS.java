/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;



import java.sql.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
// a linnha abaixo importa recursos da biblioteca rs2xml.jar (para usar o campo de pesquisar)
import net.proteanit.sql.DbUtils;
import DAO.ConexaoBD;
import java.awt.HeadlessException;
import java.text.DecimalFormat;


/**
 *
 * @author Felipe
 */
public class viewOS extends javax.swing.JInternalFrame {
    
    
    Connection conn ;  
    PreparedStatement prst;
    ResultSet rs ;
    
    
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNumeroOs, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rbttnOrcamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbttnOrdemDeServico)
                    .addComponent(txtDataOS, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
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

        cbxOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Na Bancada", "Entrega OK", "Orçamento reprovado", "Aguardando aprovação", "Aguardando peças", "Abandonado pelo cliente", "Retornou", " " }));
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

        txtValoOS.setText("0");

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

        bttnImprimirOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-enviar-para-a-impressora-48.png"))); // NOI18N
        bttnImprimirOS.setToolTipText("Imprimir");
        bttnImprimirOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bttnPesquisarOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-magnifying-glass-48.png"))); // NOI18N
        bttnPesquisarOs.setToolTipText("Pesquisar");
        bttnPesquisarOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnPesquisarOsActionPerformed(evt);
            }
        });

        bttnAlterarOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/icons8-pencil-drawing-48.png"))); // NOI18N
        bttnAlterarOs.setToolTipText("Alterar");

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
        limparCampos();
    }//GEN-LAST:event_bttnSalvarOSActionPerformed

    private void tabelaClienteOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteOSMouseClicked
       // chamando o metodo setarCampos
        setarCampos();
    }//GEN-LAST:event_tabelaClienteOSMouseClicked

    private void bttnPesquisarOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnPesquisarOsActionPerformed
       pesquisarOS();
    }//GEN-LAST:event_bttnPesquisarOsActionPerformed


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
    
    private void setarCampos(){
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
            if ((txtIdClienteOS.getText().isEmpty()) || (txtEquipamentoOS.getText().isEmpty()) || (txtDefeitoOS.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                int adicionado = prst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "OS emitida com sucesso!");
                }
                prst.close();
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "emitirOs: " + erro);
        }
    }
        // método abaixo limpa os campos do formulario
    public void limparCampos() {
        txtEquipamentoOS.setText("");
        txtDefeitoOS.setText("");
        txtServicoOS.setText("");
        txtTecnicoOS.setText("");
        txtValoOS.setText("");
        
    }
     // método abaixo pesquisa Os
    public void pesquisarOS(){
        //a linha abaixo cria uma caixa de entrada do tipo JOption pane
        String num_os = JOptionPane.showInputDialog("número da OS");
        String sql = " SELECT * FROM tbl_os WHERE os =  " + num_os;
        try {
            prst= conn.prepareStatement(sql);
            rs=prst.executeQuery();
            if (rs.next()) {
                //txtDataOS
            } else {
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "OS não cadastrada");
        }
    }
   
    }
 

