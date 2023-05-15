package proiect1_lfc;
import java.io.*;
import java.util.*;
public class Automat {
    private String st_initiala="q0";
    private String st_initiala1="q0";
    private String st_finale_str;
    private ListaTranzitii lt=new ListaTranzitii();
    private ArrayList<String> st_finale=new ArrayList<String>();
    Automat(String nume_fisier) throws Exception{
        BufferedReader buf=new BufferedReader(new FileReader(nume_fisier));
        this.st_initiala=buf.readLine();
        this.st_initiala1=this.st_initiala;
        st_finale_str=buf.readLine();
        String tbl[]=st_finale_str.split(" ");
        for(int i=0;i<tbl.length;i++)
            st_finale.add(tbl[i]);
        while(true)
        {
            String tmp=buf.readLine();
            if(tmp==null)
                break;
            else{
                String tmpt[]=tmp.split(" ");
                Tranzitie tr=new Tranzitie(tmpt[0],tmpt[1].charAt(0),tmpt[2]);
                lt.adaugaTranzitie(tr);
            }
        }}
    public boolean analizeazaCuvant(String word)throws Exception{
        for(int i=0;i<word.length();++i)
        {
            Tranzitie tr=lt.gasesteTranzitie(st_initiala,word.charAt(i));
            if(tr!=null)
            {
                st_initiala=tr.spuneStSf();
            }else
                return false;
        }
        if(st_finale.contains(st_initiala))
            return true;
        return false;
    }
    public void afisareTranzitii(String word) throws Exception {
        System.out.print(st_initiala1+" ");
        for(int i=0;i<word.length();++i)
        {
            Tranzitie tr=lt.gasesteTranzitie(st_initiala1,word.charAt(i));
            if(tr!=null)
            {
                st_initiala1=tr.spuneStSf();
                System.out.print(st_initiala1+" ");
            }else
                break;
        }
    }
    public boolean contineStare(String word) throws Exception{
       for(int i=0;i<word.length();++i)
        {
            Tranzitie tr=lt.gasesteTranzitie(st_initiala1,word.charAt(i));
            if(tr!=null)
            {
                st_initiala1=tr.spuneStSf();
                if(st_initiala1.equals("q2"))
                    return true;
            }else
                break;
        } 
       return false;
    }
    public void print(){
        ArrayList<Tranzitie> list=lt.getLista();
        System.out.println("Stare initiala:"+st_initiala);
        System.out.println("Stari finale:"+st_finale_str);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).spuneStIncep()+" "+list.get(i).spuneSimbol()+ " " + list.get(i).spuneStSf());
        }

    }
}

