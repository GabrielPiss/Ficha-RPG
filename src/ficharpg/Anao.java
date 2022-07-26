package ficharpg;
//Gabriel Henrique Pissaia RA:1830040
public class Anao extends Personagem{
    private int For;
    private int Int;
    private int Sab;
    private int Dex;
    private int Car;
    private int Con;
    private Personagem p1 = new Personagem();
    public Personagem getp1(){
		return p1;
	}
	public void setp1(Personagem p1){
		this.p1 = p1;
	}
    public int getFor() {
        return For;
    }    
    public void setFor(int For) {
        this.For = For;
    }
    public int getInt() {
        return Int;
    }
    public void setInt(int Int) {
        this.Int = Int;
    }
    public int getSab() {
        return Sab;
    }
    public void setSab(int Sab) {
        this.Sab = Sab;
    }
    public int getDex() {
        return Dex;
    }
    public void setDex(int Dex) {
        this.Dex = Dex;
    }
    public int getCar() {
        return Car;
    }
    public void setCar(int Car) {
        this.Car = Car;
    }
    public int getCon() {
        return Con;
    }
    public void setCon(int Con) {
        this.Con = Con;
    }       
}
