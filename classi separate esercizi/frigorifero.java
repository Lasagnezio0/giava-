import java.util.Scanner;

public class frigorifero{
    
    //attributi del grande frigorifero
    private boolean ha_freezer;
    private boolean ha_cibo;
    private String classeEnergetica;
    private int temperaturaInterna;

    //getter
    public  String getClasseEnergetica(){
        return classeEnergetica;
    }
    public int getTemperaturaInterna(){
        return temperaturaInterna;
    }

    //costruttore
    frigorifero(boolean freeze, boolean cibo, String classEn, int temp){
        ha_freezer = freeze;
        ha_cibo = cibo;
        classeEnergetica = classEn;
        temperaturaInterna = temp;
    }

    //metodi della classe frigorifero
    public void fame(){
        if(ha_cibo) System.out.println("puoi mangiare qualcosa, il frigo non è vuoto");
        else System.out.println("Il frigo è vuoto, niente cibo per te");
    }

    public void presentati(){
        if(ha_freezer && ha_cibo) System.out.println("ciao sono un frigo  di classe energetica " + classeEnergetica + " con temperatura interna di "+ temperaturaInterna +  " con freezer e pieno di cibo");
        else if(ha_freezer && !ha_cibo) System.out.println("ciao sono un frigo di classe energetica " + classeEnergetica + " con temperatura interna di "+ temperaturaInterna + " con freezer ma vuoto");
        else if(!ha_freezer && ha_cibo) System.out.println("ciao sono un frigo di classe energetica " + classeEnergetica + " con temperatura interna di "+ temperaturaInterna + " senza freezer ma pieno di cibo!");
        else if(!ha_freezer && !ha_cibo) System.out.println("ciao sono un frigo di classe energetica " + classeEnergetica + " con temperatura interna di "+ temperaturaInterna + " senza freezer e pure vuoto!");
    }

    public static void main(String[] args) {
        frigorifero frigo1 = new frigorifero(true, true, "A", 4);
        frigorifero frigo2 = new frigorifero(true, false, "F", 6);
        frigorifero frigo3 = new frigorifero(false, false, "C++", 5);

        frigo1.presentati();
        frigo2.presentati();
        frigo3.presentati();
    }

}

