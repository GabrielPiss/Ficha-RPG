
package ficharpg;

public class Randomico {
    
    private int Atri;
     
    public int getAtri() {
        return Atri;
    }

    public void setAtri(int Atri) {
        this.Atri = Atri;
    }
    
    public int Multiplicador(int Atri){
        int dadomulti = 0;
        if (Atri > 1 && Atri < 3){    
            dadomulti = -3;
        }
        if (Atri > 3 && Atri < 5){
            dadomulti = -2;
        }
        if (Atri > 5 && Atri < 7){
            dadomulti = -1;
        }
        if (Atri > 9 && Atri < 11){
            dadomulti = 0;
        }
        if (Atri > 11 && Atri < 13){
            dadomulti = 1;
        }
        if (Atri > 13 && Atri < 15){
            dadomulti = 2;
        }
        if (Atri > 15 && Atri < 17){
            dadomulti = 3;
        }
        if (Atri > 17 && Atri < 19){
            dadomulti = 4;
        }
        if (Atri > 20){
            dadomulti = 5;
        }
        return dadomulti;  
    }
}
