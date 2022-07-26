//Gabriel Henrique Pissaia RA:1830040
package ficharpg;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
public class JAnao extends javax.swing.JFrame {   
    private GerAnao gerAnao = new GerAnao();
    private Anao anao = new Anao();
    Random rolagem = new Random();
    private static JAnao JAnaounico;  
    private JAnao() {
        initComponents();
    }   
    public static JAnao getJana(){
        if (JAnaounico == null){
            JAnaounico = new JAnao(); 
        }
        return JAnaounico;    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VoltarAnao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LimparAnao = new javax.swing.JButton();
        CadastrarAnao = new javax.swing.JButton();
        TextCodAnao = new javax.swing.JTextField();
        TextNomejAnao = new javax.swing.JTextField();
        TextNomepAnao = new javax.swing.JTextField();
        TextPVAnao = new javax.swing.JTextField();
        TextPMAnao = new javax.swing.JTextField();
        TextForAnao = new javax.swing.JTextField();
        TextIntAnao = new javax.swing.JTextField();
        TextSabAnao = new javax.swing.JTextField();
        TextDexAnao = new javax.swing.JTextField();
        TextConAnao = new javax.swing.JTextField();
        TextCarAnao = new javax.swing.JTextField();
        ConsultarAnao = new javax.swing.JButton();
        DeletarAnao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCadPer = new javax.swing.JTable();
        jToggleButtonRolfoana = new javax.swing.JToggleButton();
        jToggleButtonRolintana = new javax.swing.JToggleButton();
        jToggleButtonRolsabana = new javax.swing.JToggleButton();
        jToggleButtonRolsdesana = new javax.swing.JToggleButton();
        jToggleButtonRolconana = new javax.swing.JToggleButton();
        jToggleButtonRolcarana = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Anão");

        VoltarAnao.setText("Voltar");
        VoltarAnao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarAnaoActionPerformed(evt);
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

        LimparAnao.setText("Limpar");
        LimparAnao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparAnaoActionPerformed(evt);
            }
        });

        CadastrarAnao.setText("Cadastrar");
        CadastrarAnao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarAnaoActionPerformed(evt);
            }
        });

        TextForAnao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextForAnaoActionPerformed(evt);
            }
        });

        ConsultarAnao.setText("Consultar");
        ConsultarAnao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarAnaoActionPerformed(evt);
            }
        });

        DeletarAnao.setText("Sua Jornada Acabou");
        DeletarAnao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarAnaoActionPerformed(evt);
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

        jToggleButtonRolfoana.setText("Rol");
        jToggleButtonRolfoana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRolfoanaActionPerformed(evt);
            }
        });

        jToggleButtonRolintana.setText("Rol");
        jToggleButtonRolintana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRolintanaActionPerformed(evt);
            }
        });

        jToggleButtonRolsabana.setText("Rol");
        jToggleButtonRolsabana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRolsabanaActionPerformed(evt);
            }
        });

        jToggleButtonRolsdesana.setText("Rol");
        jToggleButtonRolsdesana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRolsdesanaActionPerformed(evt);
            }
        });

        jToggleButtonRolconana.setText("Rol");
        jToggleButtonRolconana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRolconanaActionPerformed(evt);
            }
        });

        jToggleButtonRolcarana.setText("Rol");
        jToggleButtonRolcarana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRolcaranaActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextCodAnao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextNomejAnao)
                                .addComponent(TextNomepAnao, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TextPVAnao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextPMAnao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextForAnao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextIntAnao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextSabAnao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextDexAnao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextCarAnao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextConAnao, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToggleButtonRolfoana, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(jToggleButtonRolintana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButtonRolsabana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButtonRolsdesana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButtonRolconana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButtonRolcarana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ConsultarAnao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DeletarAnao)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CadastrarAnao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LimparAnao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(VoltarAnao)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TextCodAnao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextNomejAnao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextNomepAnao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextPVAnao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TextPMAnao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TextForAnao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonRolfoana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TextIntAnao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonRolintana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TextSabAnao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonRolsabana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TextDexAnao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonRolsdesana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TextConAnao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonRolconana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TextCarAnao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonRolcarana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VoltarAnao)
                            .addComponent(LimparAnao)
                            .addComponent(CadastrarAnao)
                            .addComponent(ConsultarAnao))
                        .addGap(3, 3, 3)
                        .addComponent(DeletarAnao))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarAnaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarAnaoActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarAnaoActionPerformed

    private void TextForAnaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextForAnaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextForAnaoActionPerformed

    private void LimparAnaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparAnaoActionPerformed
        limpar();
    }//GEN-LAST:event_LimparAnaoActionPerformed

    private void CadastrarAnaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarAnaoActionPerformed
        cadastrar();
        listarTabela();
        limpar();
    }//GEN-LAST:event_CadastrarAnaoActionPerformed

    private void ConsultarAnaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarAnaoActionPerformed
        consultar();
    }//GEN-LAST:event_ConsultarAnaoActionPerformed

    private void DeletarAnaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarAnaoActionPerformed
        excluir();
        listarTabela();
    }//GEN-LAST:event_DeletarAnaoActionPerformed

    private void jToggleButtonRolfoanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRolfoanaActionPerformed
        Random Dado = new Random();
        Randomico Rand = new Randomico();
        int numDado = Dado.nextInt(20) + 1;
        Rand.setAtri(Integer.parseInt(TextForAnao.getText()));
        //int resultmulti = Dado + Rand.Multiplicador(Rand.getAtri());
        //JOptionPane.showMessageDialog(null, "Resultado do Multiplicador" + Rand.Multiplicador(dadomulti), "Rolagem", 0);
        
    }//GEN-LAST:event_jToggleButtonRolfoanaActionPerformed

    private void jToggleButtonRolintanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRolintanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonRolintanaActionPerformed

    private void jToggleButtonRolsabanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRolsabanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonRolsabanaActionPerformed

    private void jToggleButtonRolsdesanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRolsdesanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonRolsdesanaActionPerformed

    private void jToggleButtonRolconanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRolconanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonRolconanaActionPerformed

    private void jToggleButtonRolcaranaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRolcaranaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonRolcaranaActionPerformed

    public void limpar(){
        TextCodAnao.setText("");
        TextNomejAnao.setText("");
        TextNomepAnao.setText("");
        TextPVAnao.setText("");
        TextPMAnao.setText("");
        TextForAnao.setText("");
        TextIntAnao.setText("");
        TextSabAnao.setText("");
        TextDexAnao.setText("");
        TextConAnao.setText("");
        TextCarAnao.setText("");
        TextCodAnao.requestFocus();
    }
    public void cadastrar(){
        anao = new Anao();
        try{
        anao.getp1().setCodp(Integer.parseInt(TextCodAnao.getText()));
        anao.getp1().setNomej(TextNomejAnao.getText());
        anao.getp1().setNomep(TextNomepAnao.getText());
        anao.getp1().setPV(Integer.parseInt(TextPVAnao.getText()));
        anao.getp1().setPM(Integer.parseInt(TextPMAnao.getText()));
        anao.setFor(Integer.parseInt(TextForAnao.getText()));
        anao.setInt(Integer.parseInt(TextIntAnao.getText()));
        anao.setSab(Integer.parseInt(TextSabAnao.getText()));
        anao.setDex(Integer.parseInt(TextDexAnao.getText()));
        anao.setCon(Integer.parseInt(TextConAnao.getText()));
        anao.setCar(Integer.parseInt(TextCarAnao.getText()));
        anao = gerAnao.cadAna(anao);
        if(anao != null){
            JOptionPane.showMessageDialog(null, "Personagem cadastrado com sucesso!", "Cadastro Personagem", 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ja existe um personagem com esse codigo:"+TextCodAnao.getText(), "Erro de Cadastro", 0);
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Sem contar seu nome e nome de seu personagem, devem ser postos numeros nas demais caixas de texto!", "Erro de cadastro",0);
        }   limpar();
    }
    public void excluir(){
        anao = new Anao();
        anao.getp1().setCodp(Integer.parseInt(TextCodAnao.getText()));
        anao = gerAnao.removeAnaCod(anao);
        if(anao != null){
           JOptionPane.showMessageDialog(null, "Nobre Anao, o que lhe faltava em tamanho, compensava em bravura, e seu grito de guerra ecoara para sempre", "Adeus Aventureiro", 0);
           limpar();
        }
        else{
           JOptionPane.showMessageDialog(null, "Não existe personagem com esse codigo:"+TextCodAnao.getText(), "Erro de Consulta", 0);
           limpar();
        }
    }
    public void consultar(){
        anao = new Anao();
        anao.getp1().setCodp(Integer.parseInt(TextCodAnao.getText()));
        anao = gerAnao.consAnaCod(anao);
        if(anao != null){
           TextCodAnao.setText(Integer.toString(anao.getp1().getCodp()));
           TextNomejAnao.setText(anao.getp1().getNomej());
           TextNomepAnao.setText(anao.getp1().getNomep());
           TextPVAnao.setText(Integer.toString(anao.getp1().getPV()));
           TextPMAnao.setText(Integer.toString(anao.getp1().getPM()));
           TextForAnao.setText(Integer.toString(anao.getFor()));
           TextIntAnao.setText(Integer.toString(anao.getInt()));
           TextSabAnao.setText(Integer.toString(anao.getSab()));
           TextDexAnao.setText(Integer.toString(anao.getDex()));
           TextConAnao.setText(Integer.toString(anao.getCon()));
           TextCarAnao.setText(Integer.toString(anao.getCar()));
        }
        else{
            JOptionPane.showMessageDialog(null, "Não existe personagem com esse codigo:"+TextCodAnao.getText(), "Erro de Consulta", 0);
            limpar();
        }
    }
    public void listarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabCadPer.getModel();
        modelo.setRowCount(0);
        int posLin = 0;
        for(Anao ana: gerAnao.getBdAnao()){
            modelo.insertRow(posLin, new Object[]{ana.getFor(),ana.getInt(),ana.getSab(),ana.getDex(),ana.getCon(),ana.getCar()});
            posLin++;
        }
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JAnao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAnao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAnao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAnao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAnao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarAnao;
    private javax.swing.JButton ConsultarAnao;
    private javax.swing.JButton DeletarAnao;
    private javax.swing.JButton LimparAnao;
    private javax.swing.JTextField TextCarAnao;
    private javax.swing.JTextField TextCodAnao;
    private javax.swing.JTextField TextConAnao;
    private javax.swing.JTextField TextDexAnao;
    private javax.swing.JTextField TextForAnao;
    private javax.swing.JTextField TextIntAnao;
    private javax.swing.JTextField TextNomejAnao;
    private javax.swing.JTextField TextNomepAnao;
    private javax.swing.JTextField TextPMAnao;
    private javax.swing.JTextField TextPVAnao;
    private javax.swing.JTextField TextSabAnao;
    private javax.swing.JButton VoltarAnao;
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
    private javax.swing.JToggleButton jToggleButtonRolcarana;
    private javax.swing.JToggleButton jToggleButtonRolconana;
    private javax.swing.JToggleButton jToggleButtonRolfoana;
    private javax.swing.JToggleButton jToggleButtonRolintana;
    private javax.swing.JToggleButton jToggleButtonRolsabana;
    private javax.swing.JToggleButton jToggleButtonRolsdesana;
    private javax.swing.JTable tabCadPer;
    // End of variables declaration//GEN-END:variables
}
