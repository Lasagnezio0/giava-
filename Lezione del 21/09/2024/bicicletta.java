import java.util.Scanner;

//se non metto niente davanti ad un metodo, allora avrò un modificatore di visibilità
//default, poossono usarli chi è nello stesso package(la stessa cartella) 
public class bicicletta {
    
    int diametroRuota;
    String coloreBici;
    float peso;

    public bicicletta(int dim, String c, float p){
        diametroRuota = dim;
        coloreBici = c;
        peso = p;
    }

    public void presentati(){
        System.out.println("Sono bicicletta di colore" + coloreBici  + "che il diametro di: " + diametroRuota + "e che pesa" + peso +"kg");
    }


    //I metodi statici possono stare anche fuori dalla classe;
    public static void main(String[] args) {
        bicicletta bici1 = new bicicletta(6,"rosso",30.2);
        bicicletta bici2 = new bicicletta(8,"gialla",60.9);
        bici1.presentati();
        bici2.presentati();

        //TEMPO DI FARE L'UPGRADE
        motorino moto1 = new motorino(125,"Motorrad","BMW");
        moto1.presentati();
    }

}
