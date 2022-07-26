
package ficharpg;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JElfo extends javax.swing.JFrame {
    
    private GerElfo gerElfo = new GerElfo();
    private Elfo elfo = new Elfo();
    private static JElfo JElfounico;
    
    private JElfo() {
        initComponents();
    }
    
    public static JElfo getJelf(){
        if (JElfounico == null){
            JElfounico = new JElfo(); 
        }
        return JElfounico;
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VoltarElfo = new javax.swing.JButton();
        TextPVElfo = new javax.swing.JTextField();
        TextPMElfo = new javax.swing.JTextField();
        TextForElfo = new javax.swing.JTextField();
        TextIntElfo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextSabElfo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextDexElfo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextConElfo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextCarElfo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LimparElfo = new javax.swing.JButton();
        CadastrarElfo = new javax.swing.JButton();
        TextCodElfo = new javax.swing.JTextField();
        TextNomejElfo = new javax.swing.JTextField();
        TextNomepElfo = new javax.swing.JTextField();
        ConsultarElfo = new javax.swing.JButton();
        DeletarElfo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCadPer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Elfo");

        VoltarElfo.setText("Voltar");
        VoltarElfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarElfoActionPerformed(evt);
            }
        });

        TextForElfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextForElfoActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo do personagem");

        jLabel2.setText("Seu Nome");

        jLabel3.setText("Nome de seu personagem");

        jLabel4.setText("Pontos de Vida");

        jLabel5.setText("Pontos Magicos");

        jLabel6.setText("Força");

        jLabel7.setText("Inteligencia");

        jLabel8.setText("Sabedoria");

        jLabel9.setText("Destresa");

        jLabel10.setText("Constituição");

        jLabel11.setText("Carisma");

        LimparElfo.setText("Limpar");
        LimparElfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparElfoActionPerformed(evt);
            }
        });

        CadastrarElfo.setText("Cadastrar");
        CadastrarElfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarElfoActionPerformed(evt);
            }
        });

        TextCodElfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCodElfoActionPerformed(evt);
            }
        });

        TextNomejElfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomejElfoActionPerformed(evt);
            }
        });

        ConsultarElfo.setText("Consultar");
        ConsultarElfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarElfoActionPerformed(evt);
            }
        });

        DeletarElfo.setText("Sua Jornada Acabou");
        DeletarElfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarElfoActionPerformed(evt);
            }
        });

        tabCadPer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "For", "Int", "Sab", "Dex", "Con", "Car"
            }
        ));
        jScrollPane1.setViewportView(tabCadPer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ConsultarElfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CadastrarElfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LimparElfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VoltarElfo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DeletarElfo)
                        .addGap(85, 85, 85)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11))
                    .addGap(45, 45, 45)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextCodElfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextNomejElfo, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(TextNomepElfo))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextPVElfo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextPMElfo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextForElfo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextIntElfo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextSabElfo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextDexElfo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextCarElfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(TextConElfo, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addContainerGap(457, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 292, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VoltarElfo)
                            .addComponent(CadastrarElfo)
                            .addComponent(LimparElfo)
                            .addComponent(ConsultarElfo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeletarElfo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(TextCodElfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(TextNomejElfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(TextNomepElfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(TextPVElfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(TextPMElfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(TextForElfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(TextIntElfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(TextSabElfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(TextDexElfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(TextConElfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(TextCarElfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(90, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarElfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarElfoActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarElfoActionPerformed

    private void TextForElfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextForElfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextForElfoActionPerformed

    private void TextCodElfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCodElfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCodElfoActionPerformed

    private void CadastrarElfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarElfoActionPerformed
        cadastrar();
        listarTabela();
        limpar();
    }//GEN-LAST:event_CadastrarElfoActionPerformed

    private void LimparElfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparElfoActionPerformed
        limpar();
    }//GEN-LAST:event_LimparElfoActionPerformed

    private void TextNomejElfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomejElfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomejElfoActionPerformed

    private void ConsultarElfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarElfoActionPerformed
        consultar();
    }//GEN-LAST:event_ConsultarElfoActionPerformed

    private void DeletarElfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarElfoActionPerformed
        excluir();
        listarTabela();
    }//GEN-LAST:event_DeletarElfoActionPerformed

    public void limpar(){
        TextCodElfo.setText("");
        TextNomejElfo.setText("");
        TextNomepElfo.setText("");
        TextPVElfo.setText("");
        TextPMElfo.setText("");
        TextForElfo.setText("");
        TextIntElfo.setText("");
        TextSabElfo.setText("");
        TextDexElfo.setText("");
        TextConElfo.setText("");
        TextCarElfo.setText("");
        TextCodElfo.requestFocus();
    }
    
    public void cadastrar(){
        elfo = new Elfo();
        try{
        elfo.getp1().setCodp(Integer.parseInt(TextCodElfo.getText()));
        elfo.getp1().setNomej(TextNomejElfo.getText());
        elfo.getp1().setNomep(TextNomepElfo.getText());
        elfo.getp1().setPV(Integer.parseInt(TextPVElfo.getText()));
        elfo.getp1().setPM(Integer.parseInt(TextPMElfo.getText()));
        elfo.setFor(Integer.parseInt(TextForElfo.getText()));
        elfo.setInt(Integer.parseInt(TextIntElfo.getText()));
        elfo.setSab(Integer.parseInt(TextSabElfo.getText()));
        elfo.setDex(Integer.parseInt(TextDexElfo.getText()));
        elfo.setCon(Integer.parseInt(TextConElfo.getText()));
        elfo.setCar(Integer.parseInt(TextCarElfo.getText()));
        
        elfo = gerElfo.cadElf(elfo);
        
        if(elfo != null){
            JOptionPane.showMessageDialog(null, "Personagem cadastrado com sucesso!", "Cadastro Personagem", 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ja existe um personagem com esse codigo:"+TextCodElfo.getText(), "Erro de Cadastro", 0);
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Sem contar seu nome e nome de seu personagem, devem ser postos numeros nas demais caixas de texto!", "Erro de cadastro",0);
        }   limpar();
    }
    
    public void excluir(){
        elfo = new Elfo();
        
        elfo.getp1().setCodp(Integer.parseInt(TextCodElfo.getText()));
        
        elfo = gerElfo.removeElfCod(elfo);
        
        if(elfo != null){
           JOptionPane.showMessageDialog(null, "Nobre Elfo, suas açoes foram o suficiente para que deixase uma marca em cada pessoa, como uma magia poderosa", "Adeus Aventureiro", 0);
           limpar();
        }
        else{
           JOptionPane.showMessageDialog(null, "Não existe personagem com esse codigo:"+TextCodElfo.getText(), "Erro de Consulta", 0);
           limpar();
        }
    }
    
    public void consultar(){
        elfo = new Elfo();
        
        elfo.getp1().setCodp(Integer.parseInt(TextCodElfo.getText()));
        
        elfo = gerElfo.consElfCod(elfo);
        
        if(elfo != null){
           TextCodElfo.setText(Integer.toString(elfo.getp1().getCodp()));
           TextNomejElfo.setText(elfo.getp1().getNomej());
           TextNomepElfo.setText(elfo.getp1().getNomep());
           TextPVElfo.setText(Integer.toString(elfo.getp1().getPV()));
           TextPMElfo.setText(Integer.toString(elfo.getp1().getPM()));
           TextForElfo.setText(Integer.toString(elfo.getFor()));
           TextIntElfo.setText(Integer.toString(elfo.getInt()));
           TextSabElfo.setText(Integer.toString(elfo.getSab()));
           TextDexElfo.setText(Integer.toString(elfo.getDex()));
           TextConElfo.setText(Integer.toString(elfo.getCon()));
           TextCarElfo.setText(Integer.toString(elfo.getCar()));
        }
        else{
            JOptionPane.showMessageDialog(null, "Não existe personagem com esse codigo:"+TextCodElfo.getText(), "Erro de Consulta", 0);
            limpar();
        }
    }
    
    public void listarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabCadPer.getModel();
        modelo.setRowCount(0);
        int posLin = 0;
        
        for(Elfo elf: gerElfo.getBdElfo()){
            modelo.insertRow(posLin, new Object[]{elf.getFor(),elf.getInt(),elf.getSab(),elf.getDex(),elf.getCon(),elf.getCar()});
            posLin++;
        }
    }
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
            java.util.logging.Logger.getLogger(JElfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JElfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JElfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JElfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JElfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarElfo;
    private javax.swing.JButton ConsultarElfo;
    private javax.swing.JButton DeletarElfo;
    private javax.swing.JButton LimparElfo;
    private javax.swing.JTextField TextCarElfo;
    private javax.swing.JTextField TextCodElfo;
    private javax.swing.JTextField TextConElfo;
    private javax.swing.JTextField TextDexElfo;
    private javax.swing.JTextField TextForElfo;
    private javax.swing.JTextField TextIntElfo;
    private javax.swing.JTextField TextNomejElfo;
    private javax.swing.JTextField TextNomepElfo;
    private javax.swing.JTextField TextPMElfo;
    private javax.swing.JTextField TextPVElfo;
    private javax.swing.JTextField TextSabElfo;
    private javax.swing.JButton VoltarElfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabCadPer;
    // End of variables declaration//GEN-END:variables
}
