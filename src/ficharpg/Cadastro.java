//Gabriel Henrique Pissaia RA:1830040
package ficharpg;
import javax.swing.JOptionPane;
public class Cadastro extends javax.swing.JFrame {
    private static Cadastro Cadastrounico;   
    private Cadastro() {
        initComponents();
    }    
    public static Cadastro getCadper(){
        if (Cadastrounico == null){
            Cadastrounico = new Cadastro(); 
        }
        return Cadastrounico;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Humano = new javax.swing.JButton();
        Anao = new javax.swing.JButton();
        Elfo = new javax.swing.JButton();
        Hobbit = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RPG Ficha");

        Humano.setText("Humano");
        Humano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HumanoActionPerformed(evt);
            }
        });

        Anao.setText("Anão");
        Anao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnaoActionPerformed(evt);
            }
        });

        Elfo.setText("Elfo");
        Elfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElfoActionPerformed(evt);
            }
        });

        Hobbit.setText("Hobbit");
        Hobbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HobbitActionPerformed(evt);
            }
        });

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        jLabel1.setText("Escolha sua Raça:");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Humano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Elfo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(Sair)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Anao, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Hobbit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Humano)
                    .addComponent(Elfo)
                    .addComponent(Anao)
                    .addComponent(Hobbit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sair)
                .addGap(22, 22, 22))
        );

        setSize(new java.awt.Dimension(361, 174));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HumanoActionPerformed
        JHumano.getJhum().setVisible(true);
    }//GEN-LAST:event_HumanoActionPerformed

    private void AnaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnaoActionPerformed
        JAnao.getJana().setVisible(true);
    }//GEN-LAST:event_AnaoActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);
        if (x == 0){
        dispose();
        }
    }//GEN-LAST:event_SairActionPerformed

    private void ElfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElfoActionPerformed
        JElfo.getJelf().setVisible(true);
    }//GEN-LAST:event_ElfoActionPerformed

    private void HobbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HobbitActionPerformed
        JHobbit.getJhob().setVisible(true);
    }//GEN-LAST:event_HobbitActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anao;
    private javax.swing.JButton Elfo;
    private javax.swing.JButton Hobbit;
    private javax.swing.JButton Humano;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
