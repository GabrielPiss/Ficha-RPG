//Gabriel Henrique Pissaia RA:1830040
package ficharpg;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class JHumano extends javax.swing.JFrame {
    private GerHuma gerHuma = new GerHuma();
    private Humano humano = new Humano();
    private static JHumano JHumanounico;
    private JHumano() {
        initComponents();
    } 
    public static JHumano getJhum(){
        if (JHumanounico == null){
            JHumanounico = new JHumano(); 
        }
        return JHumanounico;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VoltarHumano = new javax.swing.JButton();
        TextPVHumano = new javax.swing.JTextField();
        TextPMHumano = new javax.swing.JTextField();
        TextForHumano = new javax.swing.JTextField();
        TextIntHumano = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextSabHumano = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextDexHumano = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextConHumano = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextCarHumano = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LimparHumano = new javax.swing.JButton();
        CadastrarHumano = new javax.swing.JButton();
        TextCodHumano = new javax.swing.JTextField();
        TextNomejHumano = new javax.swing.JTextField();
        TextNomepHumano = new javax.swing.JTextField();
        ConsultarHumano = new javax.swing.JButton();
        DeletarHumano = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCadPer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Humano");

        VoltarHumano.setText("Voltar");
        VoltarHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarHumanoActionPerformed(evt);
            }
        });

        TextForHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextForHumanoActionPerformed(evt);
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

        LimparHumano.setText("Limpar");
        LimparHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparHumanoActionPerformed(evt);
            }
        });

        CadastrarHumano.setText("Cadastrar");
        CadastrarHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarHumanoActionPerformed(evt);
            }
        });

        ConsultarHumano.setText("Consultar");
        ConsultarHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarHumanoActionPerformed(evt);
            }
        });

        DeletarHumano.setText("Sua Jornada Acabou");
        DeletarHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarHumanoActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DeletarHumano)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ConsultarHumano)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CadastrarHumano)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LimparHumano)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VoltarHumano))
                    .addGroup(layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextCodHumano, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextNomejHumano)
                                .addComponent(TextNomepHumano, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TextPVHumano, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextPMHumano, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextForHumano, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextIntHumano, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextSabHumano, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextDexHumano, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextCarHumano, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextConHumano, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TextCodHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextNomejHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextNomepHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextPVHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TextPMHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TextForHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TextIntHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TextSabHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TextDexHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TextConHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TextCarHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VoltarHumano)
                            .addComponent(LimparHumano)
                            .addComponent(CadastrarHumano)
                            .addComponent(ConsultarHumano))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeletarHumano)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarHumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarHumanoActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarHumanoActionPerformed

    private void TextForHumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextForHumanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextForHumanoActionPerformed

    private void LimparHumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparHumanoActionPerformed
        limpar();
    }//GEN-LAST:event_LimparHumanoActionPerformed

    private void CadastrarHumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarHumanoActionPerformed
        cadastrar();
        listarTabela();
        limpar();
    }//GEN-LAST:event_CadastrarHumanoActionPerformed

    private void ConsultarHumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarHumanoActionPerformed
        consultar();
    }//GEN-LAST:event_ConsultarHumanoActionPerformed

    private void DeletarHumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarHumanoActionPerformed
        excluir();
        listarTabela();
    }//GEN-LAST:event_DeletarHumanoActionPerformed

    public void limpar(){
        TextCodHumano.setText("");
        TextNomejHumano.setText("");
        TextNomepHumano.setText("");
        TextPVHumano.setText("");
        TextPMHumano.setText("");
        TextForHumano.setText("");
        TextIntHumano.setText("");
        TextSabHumano.setText("");
        TextDexHumano.setText("");
        TextConHumano.setText("");
        TextCarHumano.setText("");
        TextCodHumano.requestFocus();
    }
    public void cadastrar(){
        humano = new Humano();
        try{
        humano.getp1().setCodp(Integer.parseInt(TextCodHumano.getText()));
        humano.getp1().setNomej(TextNomejHumano.getText());
        humano.getp1().setNomep(TextNomepHumano.getText());
        humano.getp1().setPV(Integer.parseInt(TextPVHumano.getText()));
        humano.getp1().setPM(Integer.parseInt(TextPMHumano.getText()));
        humano.setFor(Integer.parseInt(TextForHumano.getText()));
        humano.setInt(Integer.parseInt(TextIntHumano.getText()));
        humano.setSab(Integer.parseInt(TextSabHumano.getText()));
        humano.setDex(Integer.parseInt(TextDexHumano.getText()));
        humano.setCon(Integer.parseInt(TextConHumano.getText()));
        humano.setCar(Integer.parseInt(TextCarHumano.getText()));
        humano = gerHuma.cadHum(humano);
        if(humano != null){
            JOptionPane.showMessageDialog(null, "Personagem cadastrado com sucesso!", "Cadastro Personagem", 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ja existe um personagem com esse codigo:"+TextCodHumano.getText(), "Erro de Cadastro", 0);
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Sem contar seu nome e nome de seu personagem, devem ser postos numeros nas demais caixas de texto!", "Erro de cadastro",0);
        }   limpar();
    }
    public void excluir(){
        humano = new Humano();
        humano.getp1().setCodp(Integer.parseInt(TextCodHumano.getText()));
        humano = gerHuma.removeHumCod(humano); 
        if(humano != null){
           JOptionPane.showMessageDialog(null, "Nobre aventureiro, tiste sua jornada ter chego ao fim, mas seu legado continuara", "Adeus Aventureiro", 0);
           limpar();
        }
        else{
           JOptionPane.showMessageDialog(null, "Não existe personagem com esse codigo:"+TextCodHumano.getText(), "Erro de Consulta", 0);
           limpar();
        }
    }
    public void consultar(){
        humano = new Humano();
        humano.getp1().setCodp(Integer.parseInt(TextCodHumano.getText()));
        humano = gerHuma.consHumCod(humano);
        if(humano != null){
           TextCodHumano.setText(Integer.toString(humano.getp1().getCodp()));
           TextNomejHumano.setText(humano.getp1().getNomej());
           TextNomepHumano.setText(humano.getp1().getNomep());
           TextPVHumano.setText(Integer.toString(humano.getp1().getPV()));
           TextPMHumano.setText(Integer.toString(humano.getp1().getPM()));
           TextForHumano.setText(Integer.toString(humano.getFor()));
           TextIntHumano.setText(Integer.toString(humano.getInt()));
           TextSabHumano.setText(Integer.toString(humano.getSab()));
           TextDexHumano.setText(Integer.toString(humano.getDex()));
           TextConHumano.setText(Integer.toString(humano.getCon()));
           TextCarHumano.setText(Integer.toString(humano.getCar()));
        }
        else{
            JOptionPane.showMessageDialog(null, "Não existe personagem com esse codigo:"+TextCodHumano.getText(), "Erro de Consulta", 0);
            limpar();
        }
    }
    public void listarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabCadPer.getModel();
        modelo.setRowCount(0);
        int posLin = 0;
        for(Humano hum: gerHuma.getBdHuma()){
            modelo.insertRow(posLin, new Object[]{hum.getFor(),hum.getInt(),hum.getSab(),hum.getDex(),hum.getCon(),hum.getCar()});
            posLin++;
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JHumano().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarHumano;
    private javax.swing.JButton ConsultarHumano;
    private javax.swing.JButton DeletarHumano;
    private javax.swing.JButton LimparHumano;
    private javax.swing.JTextField TextCarHumano;
    private javax.swing.JTextField TextCodHumano;
    private javax.swing.JTextField TextConHumano;
    private javax.swing.JTextField TextDexHumano;
    private javax.swing.JTextField TextForHumano;
    private javax.swing.JTextField TextIntHumano;
    private javax.swing.JTextField TextNomejHumano;
    private javax.swing.JTextField TextNomepHumano;
    private javax.swing.JTextField TextPMHumano;
    private javax.swing.JTextField TextPVHumano;
    private javax.swing.JTextField TextSabHumano;
    private javax.swing.JButton VoltarHumano;
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
