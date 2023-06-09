/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import Bean.ProdutoBean;
import DAO.Prod_DAO;
import javax.swing.JOptionPane;

/**
 *
 * @author vh
 */
public class Forms_Produtos extends javax.swing.JFrame {

    /**
     * Creates new form Forms_Produtos
     */
    public Forms_Produtos() {
        initComponents();
    }

    
    public void Limpartexto(){
        nome_field.setText("");
        Qnt_field.setText("");
        prec_field.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id_field = new javax.swing.JTextField();
        novo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        nome_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cat_field = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Qnt_field = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        prec_field = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/floricon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dyuthi", 0, 48)); // NOI18N
        jLabel2.setText("Produtos");

        jLabel3.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");

        id_field.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        id_field.setText("0");
        id_field.setToolTipText("");

        novo.setFont(new java.awt.Font("Dyuthi", 0, 14)); // NOI18N
        novo.setText("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Procurar Produto");

        jLabel5.setFont(new java.awt.Font("Dyuthi", 0, 24)); // NOI18N
        jLabel5.setText("Código Produto");

        nome_field.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        nome_field.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        jLabel6.setText("Categoria:");

        cat_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Decoração", "Buque", "Data comemorativa" }));

        jLabel7.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        jLabel7.setText("Quantidade:");

        Qnt_field.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        Qnt_field.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        jLabel8.setText("Preço:");

        prec_field.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        prec_field.setToolTipText("");

        buscar.setFont(new java.awt.Font("Dyuthi", 0, 14)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        limpar.setFont(new java.awt.Font("Dyuthi", 0, 14)); // NOI18N
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        Atualizar.setFont(new java.awt.Font("Dyuthi", 0, 14)); // NOI18N
        Atualizar.setText("Atualizar");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });

        excluir.setFont(new java.awt.Font("Dyuthi", 0, 14)); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dyuthi", 0, 18)); // NOI18N
        jLabel9.setText("R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar)
                                .addGap(16, 16, 16))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cat_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Qnt_field, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(4, 4, 4)
                                        .addComponent(prec_field, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel9)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nome_field, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(limpar)
                .addGap(18, 18, 18)
                .addComponent(novo)
                .addGap(18, 18, 18)
                .addComponent(Atualizar)
                .addGap(18, 18, 18)
                .addComponent(excluir)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(buscar))
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nome_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cat_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Qnt_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(prec_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novo)
                    .addComponent(Atualizar)
                    .addComponent(excluir)
                    .addComponent(limpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        
        Prod_DAO pdao = new Prod_DAO();
        ProdutoBean pb = new ProdutoBean();
        int id = 0;
        
        pb.setProd_name(nome_field.getText());
        pb.setProd_categ(cat_field.getSelectedItem().toString());
        pb.setProd_Quant(Integer.parseInt(Qnt_field.getText()));
        pb.setProd_preço(Float.parseFloat(prec_field.getText()));
        
        if(id_field.getText() == null){
            id = 0;
            id_field.setText(Integer.toString(id));
        }else{
            id = Integer.parseInt(id_field.getText());
        }
        
        pdao.CreateProd(pb,id);
        
    }//GEN-LAST:event_novoActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
       
        Limpartexto();
        Prod_DAO pdao = new Prod_DAO();
        ProdutoBean pb = new ProdutoBean();
        
        pdao.BuscarProd(Integer.parseInt(id_field.getText()),pb);
        nome_field.setText(pb.getProd_name());
        
        switch (pb.getProd_categ()) {
            case "Decoração":
                cat_field.setSelectedIndex(0);
                break;
            case "Buque":
                cat_field.setSelectedIndex(1);
                break;
            case "Data comemorativa":
                cat_field.setSelectedIndex(2);
                break;
            default:
                throw new AssertionError();
        }
        
        Qnt_field.setText(Integer.toString(pb.getProd_Quant()));
        prec_field.setText(Float.toString(pb.getProd_preço()));
        
    }//GEN-LAST:event_buscarActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        
        int n = JOptionPane.showConfirmDialog(null, "Deseja relamente atualizar","Atualizar?",JOptionPane.YES_NO_OPTION);
        
        if(n == JOptionPane.YES_OPTION){
        
        Prod_DAO pdao = new Prod_DAO();
        ProdutoBean pb = new ProdutoBean();
        
        pb.setProd_name(nome_field.getText());
        pb.setProd_categ(cat_field.getSelectedItem().toString());
        pb.setProd_Quant(Integer.parseInt(Qnt_field.getText()));
        pb.setProd_preço(Float.parseFloat(prec_field.getText()));
        
        pdao.UpdateProd(Integer.parseInt(id_field.getText()), pb);
        
        }
    }//GEN-LAST:event_AtualizarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        
        int n = JOptionPane.showConfirmDialog(null, "Deseja relamente deletar","Deletar?",JOptionPane.YES_NO_OPTION);
        
        if(n == JOptionPane.YES_OPTION){
        
        Prod_DAO pdao = new Prod_DAO();
        pdao.DeleteProd(Integer.parseInt(id_field.getText()));
        Limpartexto();
        
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        Limpartexto();
    }//GEN-LAST:event_limparActionPerformed

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
            java.util.logging.Logger.getLogger(Forms_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forms_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forms_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forms_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forms_Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JTextField Qnt_field;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> cat_field;
    private javax.swing.JButton excluir;
    private javax.swing.JTextField id_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField nome_field;
    private javax.swing.JButton novo;
    private javax.swing.JTextField prec_field;
    // End of variables declaration//GEN-END:variables
}
