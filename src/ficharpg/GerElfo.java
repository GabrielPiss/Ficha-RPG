//Gabriel Henrique Pissaia RA:1830040
package ficharpg;
import java.util.List;
import java.util.ArrayList;
public class GerElfo {    
    private Elfo elf;
	private List<Elfo> bdElfo = new ArrayList<Elfo>();
        public List<Elfo> getBdElfo(){
            return bdElfo;
        }
	public Elfo cadElf(Elfo elf){
		if(consElfCod(elf)== null){
			bdElfo.add(elf);
			return elf;
		}
		else{
			return null;
		}
	}
	public Elfo consElfCod(Elfo elf){
		for(int i = 0; i < bdElfo.size(); i++){
			if(elf.getp1().getCodp()== bdElfo.get(i).getp1().getCodp()){
				return bdElfo.get(i);
			}
		}
		return null;
	}
	public Elfo removeElfCod(Elfo elf){
            elf = consElfCod(elf);
            if(elf != null){
                bdElfo.remove(elf);
                return elf;
            }
            else{    
                return null;
            }
	}
}
