//Gabriel Henrique Pissaia RA:1830040
package ficharpg;
import java.util.Random;
import javax.swing.JOptionPane;
public class JRolagemdado extends javax.swing.JFrame {
    private static JRolagemdado JRolagemdadounico;
    public JRolagemdado() {
        initComponents();
    }
    public static JRolagemdado getHistoria(){
        if (JRolagemdadounico == null){
            JRolagemdadounico = new JRolagemdado(); 
        }
        return JRolagemdadounico;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btd2 = new javax.swing.JButton();
        btd4 = new javax.swing.JButton();
        btd6 = new javax.swing.JButton();
        btd8 = new javax.swing.JButton();
        btd10 = new javax.swing.JButton();
        btd12 = new javax.swing.JButton();
        btd20 = new javax.swing.JButton();
        btd100 = new javax.swing.JButton();
        btsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btd2.setText("D2");
        btd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btd2ActionPerformed(evt);
            }
        });

        btd4.setText("D4");
        btd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btd4ActionPerformed(evt);
            }
        });

        btd6.setText("D6");
        btd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btd6ActionPerformed(evt);
            }
        });

        btd8.setText("D8");
        btd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btd8ActionPerformed(evt);
            }
        });

        btd10.setText("D10");
        btd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btd10ActionPerformed(evt);
            }
        });

        btd12.setText("D12");
        btd12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btd12ActionPerformed(evt);
            }
        });

        btd20.setText("D20");
        btd20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btd20ActionPerformed(evt);
            }
        });

        btd100.setText("D100");
        btd100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btd100ActionPerformed(evt);
            }
        });

        btsair.setText("Voltar");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btd6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btd2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btd4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btd8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btd100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btd12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btd20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btd10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btsair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btd2)
                    .addComponent(btd10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btd4)
                    .addComponent(btd12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btd20)
                    .addComponent(btd6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btd100)
                    .addComponent(btd8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btsair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(181, 221));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        dispose();
    }//GEN-LAST:event_btsairActionPerformed

    private void btd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btd2ActionPerformed
        Random Dado = new Random();
        int numDado = Dado.nextInt(2) + 1;
        JOptionPane.showMessageDialog(null, "Resultado de seu D2 foi:"+numDado, "Rolagem dado", 0);
    }//GEN-LAST:event_btd2ActionPerformed

    private void btd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btd6ActionPerformed
        Random Dado = new Random();
        int numDado = Dado.nextInt(6) + 1;
        JOptionPane.showMessageDialog(null, "Resultado de seu D6 foi:"+numDado, "Rolagem dado", 0);
    }//GEN-LAST:event_btd6ActionPerformed

    private void btd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btd4ActionPerformed
        Random Dado = new Random();
        int numDado = Dado.nextInt(4) + 1;
        JOptionPane.showMessageDialog(null, "Resultado de seu D4 foi:"+numDado, "Rolagem dado", 0);
    }//GEN-LAST:event_btd4ActionPerformed

    private void btd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btd8ActionPerformed
        Random Dado = new Random();
        int numDado = Dado.nextInt(8) + 1;
        JOptionPane.showMessageDialog(null, "Resultado de seu D8 foi:"+numDado, "Rolagem dado", 0);
    }//GEN-LAST:event_btd8ActionPerformed

    private void btd12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btd12ActionPerformed
        Random Dado = new Random();
        int numDado = Dado.nextInt(12) + 1;
        JOptionPane.showMessageDialog(null, "Resultado de seu D12 foi:"+numDado, "Rolagem dado", 0);
    }//GEN-LAST:event_btd12ActionPerformed

    private void btd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btd10ActionPerformed
        Random Dado = new Random();
        int numDado = Dado.nextInt(10) + 1;
        JOptionPane.showMessageDialog(null, "Resultado de seu D10 foi:"+numDado, "Rolagem dado", 0);
    }//GEN-LAST:event_btd10ActionPerformed

    private void btd20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btd20ActionPerformed
        Random Dado = new Random();
        int numDado = Dado.nextInt(20) + 1;
        JOptionPane.showMessageDialog(null, "Resultado de seu D20 foi:"+numDado, "Rolagem dado", 0);
    }//GEN-LAST:event_btd20ActionPerformed

    private void btd100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btd100ActionPerformed
        Random Dado = new Random();
        int numDado = Dado.nextInt(100) + 1;
        JOptionPane.showMessageDialog(null, "Resultado de seu D100 foi:"+numDado, "Rolagem dado", 0);
    }//GEN-LAST:event_btd100ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JRolagemdado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btd10;
    private javax.swing.JButton btd100;
    private javax.swing.JButton btd12;
    private javax.swing.JButton btd2;
    private javax.swing.JButton btd20;
    private javax.swing.JButton btd4;
    private javax.swing.JButton btd6;
    private javax.swing.JButton btd8;
    private javax.swing.JButton btsair;
    // End of variables declaration//GEN-END:variables
}
