//Gabriel Henrique Pissaia RA:1830040
package ficharpg;
import java.util.List;
import java.util.ArrayList;
public class GerHuma {
    private Humano hum;
	private List<Humano> bdHuma = new ArrayList<Humano>();
        public List<Humano> getBdHuma(){
            return bdHuma;
        }
	public Humano cadHum(Humano hum){
		if(consHumCod(hum)== null){
			bdHuma.add(hum);
			return hum;
		}
		else{
			return null;
		}
	}
	public Humano consHumCod(Humano hum){
		for(int i = 0; i < bdHuma.size(); i++){
			if(hum.getp1().getCodp()== bdHuma.get(i).getp1().getCodp()){
				return bdHuma.get(i);
			}
		}
		return null;
	}
	public Humano removeHumCod(Humano hum){
            hum = consHumCod(hum);
            if(hum != null){
                bdHuma.remove(hum);
                return hum;
            }
            else{    
                return null;
            }
        }
}
    
