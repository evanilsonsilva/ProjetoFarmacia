package br.com.farmacia.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.farmacia.beans.Fornecedor;
import br.com.farmacia.dao.FornecedorDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Evanilson
 */
public class TelaCadastroFornecedor_1 extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroFornecedor
     */
    public TelaCadastroFornecedor_1() {
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

        jLabel2 = new javax.swing.JLabel();
        jPanelCadastroFornecedor = new javax.swing.JPanel();
        jLabelNomeFornecedor = new javax.swing.JLabel();
        jLabelCNPJFornecedor = new javax.swing.JLabel();
        jLabelEnderecoFornecedor = new javax.swing.JLabel();
        jLabelTelefoneFornecedor = new javax.swing.JLabel();
        jTextFieldNomeFornecedor = new javax.swing.JTextField();
        jTextFieldCNPJFornecedor = new javax.swing.JTextField();
        jTextFieldEnderecoFornecedor = new javax.swing.JTextField();
        jTextFieldTelefoneFornecedor = new javax.swing.JTextField();
        jButtonCadastrarFornecedor = new javax.swing.JButton();
        jLabelCadastroFornecedor = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCadastroFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNomeFornecedor.setText("Nome:");

        jLabelCNPJFornecedor.setText("CNPJ:");

        jLabelEnderecoFornecedor.setText("Endereço:");

        jLabelTelefoneFornecedor.setText("Telefone:");

        jButtonCadastrarFornecedor.setText("Cadastrar");
        jButtonCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroFornecedorLayout = new javax.swing.GroupLayout(jPanelCadastroFornecedor);
        jPanelCadastroFornecedor.setLayout(jPanelCadastroFornecedorLayout);
        jPanelCadastroFornecedorLayout.setHorizontalGroup(
            jPanelCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroFornecedorLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomeFornecedor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCNPJFornecedor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelEnderecoFornecedor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTelefoneFornecedor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addGroup(jPanelCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroFornecedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCadastrarFornecedor)
                .addContainerGap())
        );
        jPanelCadastroFornecedorLayout.setVerticalGroup(
            jPanelCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroFornecedorLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanelCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanelCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEnderecoFornecedor)
                    .addComponent(jTextFieldEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButtonCadastrarFornecedor)
                .addContainerGap())
        );

        jLabelCadastroFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastroFornecedor.setText("Cadastro Fornecedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelCadastroFornecedor)
                    .addComponent(jPanelCadastroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelCadastroFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCadastroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarFornecedorActionPerformed
       String nome = jTextFieldNomeFornecedor.getText();
       String cnpj = jTextFieldCNPJFornecedor.getText();
       String endereco = jTextFieldEnderecoFornecedor.getText();
       String telefone = jTextFieldTelefoneFornecedor.getText();
       
       Fornecedor fornecedor = new Fornecedor(0, nome, endereco, telefone, cnpj);
       FornecedorDAO fornecedorDAO =  new FornecedorDAO();
       
       try {
            fornecedorDAO.insereFornecedor(fornecedor);
            JOptionPane.showMessageDialog(null, "Forncedor cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL erro: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonCadastrarFornecedorActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFornecedor_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrarFornecedor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCNPJFornecedor;
    private javax.swing.JLabel jLabelCadastroFornecedor;
    private javax.swing.JLabel jLabelEnderecoFornecedor;
    private javax.swing.JLabel jLabelNomeFornecedor;
    private javax.swing.JLabel jLabelTelefoneFornecedor;
    private javax.swing.JPanel jPanelCadastroFornecedor;
    private javax.swing.JTextField jTextFieldCNPJFornecedor;
    private javax.swing.JTextField jTextFieldEnderecoFornecedor;
    private javax.swing.JTextField jTextFieldNomeFornecedor;
    private javax.swing.JTextField jTextFieldTelefoneFornecedor;
    // End of variables declaration//GEN-END:variables
}
