//Gabriel Henrique Pissaia RA:1830040
package ficharpg;
import java.util.ArrayList;
import java.util.List;
public class GerAnao {
    private Anao ana;
	private List<Anao> bdAnao = new ArrayList<Anao>();
        public List<Anao> getBdAnao(){
            return bdAnao;
        }      
	public Anao cadAna(Anao ana){
		if(consAnaCod(ana)== null){
			bdAnao.add(ana);
			return ana;
		}
		else{
			return null;
		}
	}
	public Anao consAnaCod(Anao ana){
		for(int i = 0; i < bdAnao.size(); i++){
			if(ana.getp1().getCodp()== bdAnao.get(i).getp1().getCodp()){
				return bdAnao.get(i);
			}
		}
		return null;
	}
	public Anao removeAnaCod(Anao ana){
            ana = consAnaCod(ana);
            if(ana != null){
                bdAnao.remove(ana);
                return ana;
            }
            else{    
                return null;
            }
	}
}
