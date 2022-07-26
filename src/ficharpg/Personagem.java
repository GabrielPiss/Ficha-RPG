package ficharpg;
//Gabriel Henrique Pissaia RA:1830040
public class Personagem {
    private String nomej = "";
    private String nomep = "";
    private int PV;
    private int PM;
    private int Codp;
    public int getCodp() {
        return Codp;
    }
    public void setCodp(int Codp) {
        this.Codp = Codp;
    }   
    public int getPV() {
        return PV;
    }
    public void setPV(int PV) {
        this.PV = PV;
    }
    public int getPM() {
        return PM;
    }
    public void setPM(int PM) {
        this.PM = PM;
    }   
    public String getNomej() {
        return nomej;
    }
    public void setNomej(String nomej) {
        this.nomej = nomej;
    }
    public String getNomep() {
        return nomep;
    }
    public void setNomep(String nomep) {
        this.nomep = nomep;
    }
}