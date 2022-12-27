/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetolp;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaGerenciarCliente extends javax.swing.JFrame {

    public TelaGerenciarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        lb4 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        txttelefone = new javax.swing.JTextField();
        lb6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btcad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        btalt = new javax.swing.JButton();
        btexc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IFBA- Sistema de Locação de Filmes");

        lb1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lb1.setText("Gerenciar Clientes");

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        lb2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb2.setText("Código:");

        lb3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb3.setText("Nome:");

        lb4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb4.setText("CPF:");

        txtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpfActionPerformed(evt);
            }
        });

        lb5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb5.setText("Telefone:");

        lb6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb6.setText("E-mail:");

        btcad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btcad.setText("Cadastrar");
        btcad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadActionPerformed(evt);
            }
        });

        tbl1.setAutoCreateRowSorter(true);
        tbl1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOME", "CPF", "TELEFONE", "EMAIL"
            }
        ));
        tbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl1);

        btalt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btalt.setText("Alterar");
        btalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaltActionPerformed(evt);
            }
        });

        btexc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btexc.setText("Excluir");
        btexc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btalt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btexc)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btcad)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb5)
                            .addComponent(lb6)
                            .addComponent(lb3)
                            .addComponent(lb2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(txttelefone))
                                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lb1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb4))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb5))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btcad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btalt)
                    .addComponent(btexc))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btexcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcActionPerformed

        int linhaSelecionada = tbl1.getSelectedRow();

        if(linhaSelecionada != -1)
        {
            DefaultTableModel tabelaCliente = (DefaultTableModel) tbl1.getModel();

            tabelaCliente.removeRow(linhaSelecionada);

            JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso!");
            limparcampos();
        }

        else
        {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para exclusão.");
        }
    }//GEN-LAST:event_btexcActionPerformed

    private void btaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaltActionPerformed

        int linhaSelecionada = tbl1.getSelectedRow();

        if(linhaSelecionada != -1)
        {
            String codigo = txtcodigo.getText();
            String nome = txtnome.getText();
            String cpf = txtcpf.getText();
            String telefone = txttelefone.getText();
            String email = txtemail.getText();

            if(!codigo.equals("") && !nome.equals("") && !telefone.equals("") && !cpf.equals("") && !email.equals("") )
            {
                tbl1.setValueAt(codigo, linhaSelecionada, 0);
                tbl1.setValueAt(nome, linhaSelecionada, 1);
                tbl1.setValueAt(cpf, linhaSelecionada, 2);
                tbl1.setValueAt(telefone, linhaSelecionada, 3);
                tbl1.setValueAt(email, linhaSelecionada, 4);

                JOptionPane.showMessageDialog(this, "Cliente alterado com sucesso!");
                limparcampos();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Os campos Código, Nome, Cpf, Telefone e E-mail são obrigatórios");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para alteração.");
        }
    }//GEN-LAST:event_btaltActionPerformed

    private void tbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl1MouseClicked
        // TODO add your handling code here:
        int linhaSelecionada = tbl1.getSelectedRow();

        if(linhaSelecionada != -1)
        {
            String codigo = tbl1.getValueAt(linhaSelecionada, 0).toString();
            txtcodigo.setText(codigo);

            String nome = tbl1.getValueAt(linhaSelecionada, 1).toString();
            txtnome.setText(nome);

            String cpf = tbl1.getValueAt(linhaSelecionada, 2).toString();
            txtcpf.setText(cpf);

            String telefone = tbl1.getValueAt(linhaSelecionada, 3).toString();
            txttelefone.setText(telefone);

            String email = tbl1.getValueAt(linhaSelecionada, 4).toString();
            txtemail.setText(email);
        }
    }//GEN-LAST:event_tbl1MouseClicked

    private void btcadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadActionPerformed
        // TODO add your handling code here:
        String codigo = txtcodigo.getText();
        String nome = txtnome.getText();
        String cpf = txtcpf.getText();
        String telefone = txttelefone.getText();
        String email = txtemail.getText();

        if(!codigo.equals("") && !cpf.equals("") && !nome.equals("") && !email.equals("") && !telefone.equals("")){

            DefaultTableModel tabelaCliente = (DefaultTableModel) tbl1.getModel();

            Object[] usuario = new Object[]{
                codigo,
                nome,
                cpf,
                telefone,
                email
            };

            tabelaCliente.addRow(usuario);

            limparcampos();

            JOptionPane.showMessageDialog(this, "Cliente cadastrado com Sucesso.");
        }

        else{
            JOptionPane.showMessageDialog(this, "Os campos Código, Nome, Cpf, Telefone e E-mail são obrigatórios");
        }

    }//GEN-LAST:event_btcadActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpfActionPerformed

    private void limparcampos(){
     txtnome.setText("");
     txtcodigo.setText("");
     txtcpf .setText("");
     txttelefone.setText("");
     txtemail.setText("");
   }
    
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
            java.util.logging.Logger.getLogger(TelaGerenciarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btalt;
    private javax.swing.JButton btcad;
    private javax.swing.JButton btexc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JTable tbl1;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txttelefone;
    // End of variables declaration//GEN-END:variables
}
