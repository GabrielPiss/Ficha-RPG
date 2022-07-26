
package ficharpg;
//Gabriel Henrique Pissaia RA:1830040
import javax.swing.JOptionPane;
import java.applet.AudioClip;
public class Principal extends javax.swing.JFrame { 
    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sairprinc = new javax.swing.JButton();
        Stopmusic = new javax.swing.JButton();
        Playmusic = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MenubarPrinc = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemCadper = new javax.swing.JMenuItem();
        RolagemDado = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sairprinc.setText("Sair");
        Sairprinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairprincActionPerformed(evt);
            }
        });
        getContentPane().add(Sairprinc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 100, -1));

        Stopmusic.setText("Parar Musica");
        Stopmusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StopmusicMouseClicked(evt);
            }
        });
        Stopmusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopmusicActionPerformed(evt);
            }
        });
        getContentPane().add(Stopmusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        Playmusic.setText("Ligar Musica");
        Playmusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlaymusicMouseClicked(evt);
            }
        });
        Playmusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaymusicActionPerformed(evt);
            }
        });
        getContentPane().add(Playmusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ficharpg/I-Choose-You-Skyrim-Wallpaper.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 260));

        jMenu1.setText("Principal");

        MenuItemCadper.setText("Criar Personagem");
        MenuItemCadper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCadperActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemCadper);

        RolagemDado.setText("Rolar Dados");
        RolagemDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RolagemDadoActionPerformed(evt);
            }
        });
        jMenu1.add(RolagemDado);

        MenubarPrinc.add(jMenu1);

        setJMenuBar(MenubarPrinc);

        setSize(new java.awt.Dimension(414, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemCadperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCadperActionPerformed
        Cadastro.getCadper().setVisible(true);
    }//GEN-LAST:event_MenuItemCadperActionPerformed

    private void SairprincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairprincActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Todos os dados inseridos serão apagados, por que eu ainda não sei armazenar no HD hahah, Deseja realmente sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);
        if (x == 0){
        dispose();
        }
    }//GEN-LAST:event_SairprincActionPerformed

    private void RolagemDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolagemDadoActionPerformed
        JRolagemdado.getHistoria().setVisible(true);
    }//GEN-LAST:event_RolagemDadoActionPerformed

    private void PlaymusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaymusicActionPerformed

    }//GEN-LAST:event_PlaymusicActionPerformed

    private void PlaymusicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaymusicMouseClicked
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/ficharpg/intromusic.wav"));
        Sound.play();
    }//GEN-LAST:event_PlaymusicMouseClicked

    private void StopmusicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopmusicMouseClicked
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/ficharpg/intromusic.wav"));
        Sound.stop();
    }//GEN-LAST:event_StopmusicMouseClicked

    private void StopmusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopmusicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StopmusicActionPerformed

        
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemCadper;
    private javax.swing.JMenuBar MenubarPrinc;
    private javax.swing.JButton Playmusic;
    private javax.swing.JMenuItem RolagemDado;
    private javax.swing.JButton Sairprinc;
    private javax.swing.JButton Stopmusic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}
