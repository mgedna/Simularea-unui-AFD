package proiect1_lfc;
import java.util.*;
public class ListaTranzitii {
    private ArrayList<Tranzitie> lista;
    public ListaTranzitii(){
        this.lista=new ArrayList<Tranzitie>();
    }
    public void adaugaTranzitie(Tranzitie tr){
        this.lista.add(tr);
    }
    Tranzitie gasesteTranzitie(String stare,char simbol) throws Exception
    { for(int i=0;i<this.lista.size();i++)
    {
        Tranzitie tmp=this.lista.get(i);
        if(tmp.spuneStIncep().equals(stare) && tmp.spuneSimbol()==simbol)
            return tmp;
    }
        //return null;
        throw new Exception ("Nu am gasit tranzitia");
    }
    
    public ArrayList<Tranzitie> getLista() {
        return lista;
    }

}
