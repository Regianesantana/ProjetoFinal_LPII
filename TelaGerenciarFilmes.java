package projetolp; 

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaGerenciarFilmes extends javax.swing.JFrame {

    public TelaGerenciarFilmes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtDuracao = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblDuracao = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        TabeladeFilmes = new javax.swing.JScrollPane();
        tblFilme = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IFBA - Sistema de Locação de Filmes");

        lbltitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbltitulo.setText("Gerenciar Filmes");

        lblCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCodigo.setText("Código:");

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTitulo.setText("Título:");

        lblDuracao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDuracao.setText("Duração:");

        lblGenero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblGenero.setText("Gênero:");

        lblAno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAno.setText("Ano:");

        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tblFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "TÍTULO", "DURAÇÃO", "GÊNERO", "ANO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFilmeMouseClicked(evt);
            }
        });
        TabeladeFilmes.setViewportView(tblFilme);

        btnAlterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodigo)
                                    .addComponent(lblTitulo))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblDuracao)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDuracao))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblGenero)
                                        .addComponent(lblAno))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtGenero)
                                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(lbltitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCadastrar)
                            .addComponent(TabeladeFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAlterar)
                                .addGap(22, 22, 22)
                                .addComponent(btnExcluir)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbltitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuracao)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAno)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TabeladeFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
    
        String codigo = txtCodigo.getText();
        String titulo = txtTitulo.getText();
        String duracao = txtDuracao.getText();
        String genero = txtGenero.getText();
        String ano = txtAno.getText();
        
       if(!codigo.equals("") && !titulo.equals("") && !duracao.equals("") && !genero.equals("") && !ano.equals(""))
            {
    
      DefaultTableModel tabeladeFilmes = (DefaultTableModel) tblFilme.getModel();
       Object[] Filmes = new Object[]
      {
        codigo,
        titulo,
        duracao,
        genero,
        ano
      };
       
       tabeladeFilmes.addRow(Filmes);
       
       LimparCampos();
    
      JOptionPane.showMessageDialog(this, "Filme cadastrado com Sucesso!");
    }
    else
    {
        JOptionPane.showMessageDialog(this, "Os campos Código, Título, Duração, Gênero e Ano são obrigatórios.");
    }       
    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    private void LimparCampos()
    {
       txtCodigo.setText("");
       txtTitulo.setText("");
       txtDuracao.setText("");
       txtGenero.setText("");
       txtAno.setText("");
    }
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         
        int linhaSelecionada = tblFilme.getSelectedRow();
        
        if(linhaSelecionada == -1)
            
        {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para exclusão.");
        }
       
        
        
        else
        {
            DefaultTableModel tabeladeFilmes = (DefaultTableModel) tblFilme.getModel();
            
            tabeladeFilmes.removeRow(linhaSelecionada);
            LimparCampos();
            JOptionPane.showMessageDialog(this, "Filme excluído com sucesso!");
        }
        
        
                
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFilmeMouseClicked
    int linhaSelecionada = tblFilme.getSelectedRow();
        
        if(linhaSelecionada != -1)
        {
            String codigo = tblFilme.getValueAt(linhaSelecionada, 0).toString();
            txtCodigo.setText(codigo);
            
            String titulo = tblFilme.getValueAt(linhaSelecionada, 1).toString();
            txtTitulo.setText(titulo);
            
            String duracao = tblFilme.getValueAt(linhaSelecionada, 2).toString();
            txtDuracao.setText(duracao);
            
            String Genero = tblFilme.getValueAt(linhaSelecionada, 3).toString();
            txtGenero.setText(Genero);
            
            String ano = tblFilme.getValueAt(linhaSelecionada, 4).toString();
            txtAno.setText(ano);
          
        }
    }//GEN-LAST:event_tblFilmeMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
    int linhaSelecionada = tblFilme.getSelectedRow();
        
        if(linhaSelecionada != -1)
        {
        String codigo = txtCodigo.getText();
        String titulo = txtTitulo.getText();
        String duracao = txtDuracao.getText();
        String genero = txtGenero.getText();
        String ano = txtAno.getText();
        
        if(!codigo.equals("") && !titulo.equals("") && !duracao.equals("" ) && !genero.equals("" ) && !ano.equals("" ))
            {
                tblFilme.setValueAt(codigo, linhaSelecionada, 0);
                tblFilme.setValueAt(titulo, linhaSelecionada, 1);
                tblFilme.setValueAt(duracao, linhaSelecionada, 2);
                tblFilme.setValueAt(genero, linhaSelecionada, 3);
                tblFilme.setValueAt(ano, linhaSelecionada, 4);
                
                JOptionPane.showMessageDialog(this, "Filme alterado com sucesso!");
            }
        else
            {
                JOptionPane.showMessageDialog(this, "Os campos Código Título, Duração, Gênero e Ano são obrigatórios");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para alteração.");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed


    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciarFilmes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TabeladeFilmes;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDuracao;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTable tblFilme;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
