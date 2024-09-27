import java.util.Scanner;

public class calcolatrice {
    Scanner inputTerminale = new Scanner(System.in);
    private double a, b;
    
    calcolatrice(double a,double b){
        this.a = a;
        this.b = b;
    }
    calcolatrice(){
    }

    //getter
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    //setter
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }

    //metodi calcolatrici
    public double addizione(){
        return a+b;
    }
    public double sottrazione(){
        return a-b;
    }
    public double moltiplicazione(){
        return a*b;
    }
    public double divisione(){
        if(b == 0){
            System.out.println("impossibile dividere per 0");
            return 0;
        }
        return a/b;
    }

    public void menu(){
        System.out.println("Benvenuto nella calcolatrice op");
        while(true){
            System.out.println("Cosa vuoi fare? inserisci il numero per decidere");
            System.out.println("-----------------" + "\n[1] Addizione" + "\n[2] Sottrazione" + "\n[3] Moltiplicazione" + "\n[4] Divisione" + "\n[0] uscire" + "\n-----------------");
            int risposta = inputTerminale.nextInt();
            if(risposta == 0) break;
            else if(risposta > 4 || risposta < 0){
                System.out.println("valore non valido");
                continue;
            }
            System.out.print("Inserisci a--> ");
            a = inputTerminale.nextDouble();
            System.out.print("Inserisci b--> ");
            b = inputTerminale.nextDouble();
            switch(risposta){
                case 1:
                    System.out.println(addizione());
                    break;
                case 2:
                    System.out.println(sottrazione());
                    break;
                case 3:
                    System.out.println(moltiplicazione());
                    break;
                case 4:
                    System.out.println(divisione());
                    break;
            }
        }
    }

}
