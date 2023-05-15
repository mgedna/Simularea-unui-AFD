package proiect1_lfc;
public class TestDFA {
    public static void main(String[] args) throws Exception{
        Automat M=new Automat("automat.txt");
        String w1="aa";
        String w2="abbc";
        String w3="";
        String w4="baaac";
        M.print();
        try{
            if(M.analizeazaCuvant(w1))
            {System.out.println("Cuvantul "+w1+" este acceptat de automatul finit");
            M.afisareTranzitii(w1);
            System.out.println();
            if(M.contineStare(w1))
                System.out.println("Da, trece prin q2");
            else System.out.println("Nu, nu trece prin q2");}
            else
                System.out.println("Cuvantul "+w1+" nu este acceptat de automatul finit");
           }
        catch(Exception ex){
             System.out.println("Cuvantul "+w1+" nu este acceptat de automatul finit");
        }
        try{
            if(M.analizeazaCuvant(w2)){
                System.out.println("Cuvantul "+w2+" este acceptat de automatul finit");
                M.afisareTranzitii(w2);
            System.out.println();}
            else
                System.out.println("Cuvantul "+w2+" nu este acceptat de automatul finit");
           }
        catch(Exception ex){
             System.out.println("Cuvantul "+w2+" nu este acceptat de automatul finit");
        }
                try{
            if(M.analizeazaCuvant(w3))
                System.out.println("Sirul vid este acceptat de automatul finit");
                //M.afisareTranzitii(w3);
            //System.out.println();}
            else
                System.out.println("Sirul vid nu este acceptat de automatul finit");
           }
        catch(Exception ex){
             System.out.println("Sirul vid nu este acceptat de automatul finit");
        }
        try{
            if(M.analizeazaCuvant(w4)){
                System.out.println("Cuvantul "+w4+" este acceptat de automatul finit");
                M.afisareTranzitii(w4);
                System.out.println();
            }
            else
                System.out.println("Cuvantul "+w4+" nu este acceptat de automatul finit");
           }
        catch(Exception ex){
             System.out.println("Cuvantul "+w4+" nu este acceptat de automatul finit");
        }
    }
}
