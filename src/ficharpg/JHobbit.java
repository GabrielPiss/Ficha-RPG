//Gabriel Henrique Pissaia RA:1830040
package ficharpg;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class JHobbit extends javax.swing.JFrame {   
    private GerHobbit gerHobb = new GerHobbit();
    private Hobbit hobbit = new Hobbit();
    private static JHobbit JHobbitunico;  
    private JHobbit() {
        initComponents();
    }   
    public static JHobbit getJhob(){
        if (JHobbitunico == null){
            JHobbitunico = new JHobbit(); 
        }
        return JHobbitunico; 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VoltarHobbit = new javax.swing.JButton();
        TextPVHobbit = new javax.swing.JTextField();
        TextPMHobbit = new javax.swing.JTextField();
        TextForHobbit = new javax.swing.JTextField();
        TextIntHobbit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextSabHobbit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextDexHobbit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextConHobbit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextCarHobbit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LimparHobbit = new javax.swing.JButton();
        CadastrarHobbit = new javax.swing.JButton();
        TextCodHobbit = new javax.swing.JTextField();
        TextNomejHobbit = new javax.swing.JTextField();
        TextNomepHobbit = new javax.swing.JTextField();
        ConsultarHobbit = new javax.swing.JButton();
        DeletarHobbit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCadPer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hobbit");

        VoltarHobbit.setText("Voltar");
        VoltarHobbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarHobbitActionPerformed(evt);
            }
        });

        TextForHobbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextForHobbitActionPerformed(evt);
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

        LimparHobbit.setText("Limpar");
        LimparHobbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparHobbitActionPerformed(evt);
            }
        });

        CadastrarHobbit.setText("Cadastrar");
        CadastrarHobbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarHobbitActionPerformed(evt);
            }
        });

        ConsultarHobbit.setText("Consultar");
        ConsultarHobbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarHobbitActionPerformed(evt);
            }
        });

        DeletarHobbit.setText("Sua Jornada Acabou");
        DeletarHobbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarHobbitActionPerformed(evt);
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
                                .addComponent(TextCodHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextNomejHobbit)
                                .addComponent(TextNomepHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TextIntHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TextSabHobbit, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextDexHobbit, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextCarHobbit, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextConHobbit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                                .addComponent(TextForHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextPMHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextPVHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ConsultarHobbit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CadastrarHobbit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LimparHobbit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VoltarHobbit))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(DeletarHobbit)
                                .addGap(98, 98, 98)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TextCodHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextNomejHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextNomepHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextPVHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TextPMHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TextForHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TextIntHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TextSabHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TextDexHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TextConHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TextCarHobbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VoltarHobbit)
                            .addComponent(LimparHobbit)
                            .addComponent(CadastrarHobbit)
                            .addComponent(ConsultarHobbit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeletarHobbit))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarHobbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarHobbitActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarHobbitActionPerformed

    private void TextForHobbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextForHobbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextForHobbitActionPerformed

    private void LimparHobbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparHobbitActionPerformed
        limpar();
    }//GEN-LAST:event_LimparHobbitActionPerformed

    private void CadastrarHobbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarHobbitActionPerformed
        cadastrar();
        listarTabela();
        limpar();
    }//GEN-LAST:event_CadastrarHobbitActionPerformed

    private void ConsultarHobbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarHobbitActionPerformed
        consultar();
    }//GEN-LAST:event_ConsultarHobbitActionPerformed

    private void DeletarHobbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarHobbitActionPerformed
        excluir();
        listarTabela();
    }//GEN-LAST:event_DeletarHobbitActionPerformed

    public void limpar(){
        TextCodHobbit.setText("");
        TextNomejHobbit.setText("");
        TextNomepHobbit.setText("");
        TextPVHobbit.setText("");
        TextPMHobbit.setText("");
        TextForHobbit.setText("");
        TextIntHobbit.setText("");
        TextSabHobbit.setText("");
        TextDexHobbit.setText("");
        TextConHobbit.setText("");
        TextCarHobbit.setText("");
        TextCodHobbit.requestFocus();
    }  
    public void cadastrar(){
        hobbit = new Hobbit();
        try{
        hobbit.getp1().setCodp(Integer.parseInt(TextCodHobbit.getText()));
        hobbit.getp1().setNomej(TextNomejHobbit.getText());
        hobbit.getp1().setNomep(TextNomepHobbit.getText());
        hobbit.getp1().setPV(Integer.parseInt(TextPVHobbit.getText()));
        hobbit.getp1().setPM(Integer.parseInt(TextPMHobbit.getText()));
        hobbit.setFor(Integer.parseInt(TextForHobbit.getText()));
        hobbit.setInt(Integer.parseInt(TextIntHobbit.getText()));
        hobbit.setSab(Integer.parseInt(TextSabHobbit.getText()));
        hobbit.setDex(Integer.parseInt(TextDexHobbit.getText()));
        hobbit.setCon(Integer.parseInt(TextConHobbit.getText()));
        hobbit.setCar(Integer.parseInt(TextCarHobbit.getText()));
        hobbit = gerHobb.cadHob(hobbit); 
        if(hobbit != null){
            JOptionPane.showMessageDialog(null, "Personagem cadastrado com sucesso!", "Cadastro Personagem", 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ja existe um personagem com esse codigo:"+TextCodHobbit.getText(), "Erro de Cadastro", 0);
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Sem contar seu nome e nome de seu personagem, devem ser postos numeros nas demais caixas de texto!", "Erro de cadastro",0);
        }   limpar();
    } 
    public void excluir(){
        hobbit = new Hobbit();
        hobbit.getp1().setCodp(Integer.parseInt(TextCodHobbit.getText()));
        hobbit = gerHobb.removeHobCod(hobbit);
        if(hobbit != null){
           JOptionPane.showMessageDialog(null, "Nobre Hobbit, sempre surpreendente e carismatico, teve descencia e honra no fim, sua linhagem sera conhecida pela eternidade", "Adeus Aventureiro", 0);
           limpar();
        }
        else{
           JOptionPane.showMessageDialog(null, "Não existe personagem com esse codigo:"+TextCodHobbit.getText(), "Erro de Consulta", 0);
           limpar();
        }
    }
    public void consultar(){
        hobbit = new Hobbit();
        hobbit.getp1().setCodp(Integer.parseInt(TextCodHobbit.getText()));
        hobbit = gerHobb.consHobCod(hobbit);
        if(hobbit != null){
           TextCodHobbit.setText(Integer.toString(hobbit.getp1().getCodp()));
           TextNomejHobbit.setText(hobbit.getp1().getNomej());
           TextNomepHobbit.setText(hobbit.getp1().getNomep());
           TextPVHobbit.setText(Integer.toString(hobbit.getp1().getPV()));
           TextPMHobbit.setText(Integer.toString(hobbit.getp1().getPM()));
           TextForHobbit.setText(Integer.toString(hobbit.getFor()));
           TextIntHobbit.setText(Integer.toString(hobbit.getInt()));
           TextSabHobbit.setText(Integer.toString(hobbit.getSab()));
           TextDexHobbit.setText(Integer.toString(hobbit.getDex()));
           TextConHobbit.setText(Integer.toString(hobbit.getCon()));
           TextCarHobbit.setText(Integer.toString(hobbit.getCar()));
        }
        else{
            JOptionPane.showMessageDialog(null, "Não existe personagem com esse codigo:"+TextCodHobbit.getText(), "Erro de Consulta", 0);
            limpar();
        }
    }
    public void listarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabCadPer.getModel();
        modelo.setRowCount(0);
        int posLin = 0;
        for(Hobbit hob: gerHobb.getBdHobb()){
            modelo.insertRow(posLin, new Object[]{hob.getFor(),hob.getInt(),hob.getSab(),hob.getDex(),hob.getCon(),hob.getCar()});
            posLin++;
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JHobbit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarHobbit;
    private javax.swing.JButton ConsultarHobbit;
    private javax.swing.JButton DeletarHobbit;
    private javax.swing.JButton LimparHobbit;
    private javax.swing.JTextField TextCarHobbit;
    private javax.swing.JTextField TextCodHobbit;
    private javax.swing.JTextField TextConHobbit;
    private javax.swing.JTextField TextDexHobbit;
    private javax.swing.JTextField TextForHobbit;
    private javax.swing.JTextField TextIntHobbit;
    private javax.swing.JTextField TextNomejHobbit;
    private javax.swing.JTextField TextNomepHobbit;
    private javax.swing.JTextField TextPMHobbit;
    private javax.swing.JTextField TextPVHobbit;
    private javax.swing.JTextField TextSabHobbit;
    private javax.swing.JButton VoltarHobbit;
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
