//Gabriel Henrique Pissaia RA:1830040
package ficharpg;
import java.util.ArrayList;
import java.util.List;
public class GerHobbit {
    private Hobbit hob;
	private List<Hobbit> bdHobb = new ArrayList<Hobbit>();
        public List<Hobbit> getBdHobb(){
            return bdHobb;
        }    
	public Hobbit cadHob(Hobbit hob){
		if(consHobCod(hob)== null){
			bdHobb.add(hob);
			return hob;
		}
		else{
			return null;
		}
	}
	public Hobbit consHobCod(Hobbit hob){
		for(int i = 0; i < bdHobb.size(); i++){
			if(hob.getp1().getCodp()== bdHobb.get(i).getp1().getCodp()){
				return bdHobb.get(i);
			}
		}
		return null;
	}
	public Hobbit removeHobCod(Hobbit hob){
            hob = consHobCod(hob);
            if(hob != null){
                bdHobb.remove(hob);
                return hob;
            }
            else{    
                return null;
            }
	}
}
