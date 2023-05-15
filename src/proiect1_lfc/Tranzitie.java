package proiect1_lfc;
public class Tranzitie {
    private String st_inceput,st_sfarsit;
    private char simbol;
    public Tranzitie(String st_inceput,char simbol,String st_sfarsit) throws Exception{
        if(st_inceput!=null && st_inceput.matches("q([1-90-9])*|0"))
            this.st_inceput=st_inceput;
        else throw new Exception("Format date invalid");
        this.simbol=simbol;
        if(st_sfarsit!=null && st_sfarsit.matches("q([1-90-9])*|0"))
            this.st_sfarsit=st_sfarsit;
        else throw new Exception("Format date invalid");

    }
    public String spuneStIncep(){
        return this.st_inceput;
    }
    public char spuneSimbol(){
        return this.simbol;
    }    
    public String spuneStSf(){
        return this.st_sfarsit;
    }
}
