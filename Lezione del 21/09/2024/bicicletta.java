import java.util.Scanner;

//se non metto niente davanti ad un metodo, allora avrò un modificatore di visibilità
//default, poossono usarli chi è nello stesso package(la stessa cartella) 
public class bicicletta {
    
    int diametroRuota = 20;

    bicicletta(int dim){
        diametroRuota = dim;
    }

    public void presentati(){
        System.out.println("Sono bicicletta che il diametro di: " + diametroRuota);
    }


    //I metodi statici possono stare anche fuori dalla classe;
    public static void main(String[] args) {
        bicicletta bici1 = new bicicletta(6);
        bicicletta bici2 = new bicicletta(8);
        bici1.presentati();
        bici2.presentati();

        //TEMPO DI FARE L'UPGRADE
        motorino moto1 = new motorino(125,"Motorrad","BMW");
        moto1.presentati();
    }

}
