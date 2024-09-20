//nome file e classe uguali

import java.util.Scanner;

public class HelloWorld {
    //IL PROGRAMMA INIZIA SEMPRE DAL METODO MAIN
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        /*
        System.out.print("Hello, World!");
        System.out.println();
        */

        int a = 0, b = 2;
        int c = a + b;
        System.out.println(c);

        /*for(int i = 0; i < 10; i++){
            for(int j = 0; j < 8;j++){
                if(j > 0 && j < 3){
                    for(int k = 0; k < 10; k++){
                        while(k < 2) System.out.print(" * ");
                        do{
                            System.out.print("   ");
                        }while(k < 8 );
                        System.out.print(" * ");
                    }
                }
                System.out.print(" * ");
            }
            System.out.println();
        }*/

        //lo scanner è per leggere dal terminale
        Scanner inputTerminale = new Scanner(System.in);
        //salvo nella variabnile int input = inputTerminale.nextInt();
        
        int altezza = 0, lunghezza = 0;
        System.out.println("Benvenuto nel programma di creazione rettangoli assurdo:");

        //inserimento lunghezza
        while(true){
            System.out.print("Inserisci la lunghezza del rettangolo --> ");
            lunghezza = inputTerminale.nextInt();
            System.out.println();
            if(lunghezza < 4 ) System.out.println("Lunghezza non valida, inserire un numero maggiore di 4");
            else break;
        }
        
        //inserimento altezza
        while(true){
            System.out.print("Inserisci la altezza del rettangolo -->");
            altezza = inputTerminale.nextInt();
            System.out.println();
            if(altezza < 4 ) System.out.println("Altezza non valida, inserire un numero maggiore di 4");
            else break;
        }

        System.out.println("Ecco il tuo bellissimo rettangolo:");
        System.out.println();

        //COPYRIGHT DONDI 10.19
        for (int i = 0; i < altezza; i++) {
            
            //prima ed ultima riga
            if(i == 0 || i == altezza - 1) for(int j = 0; j < lunghezza;j++) System.out.print("*");
            
            //righe in mezzo
            else for(int j = 0; j < lunghezza;j++){
                if(j < 2 || j >= lunghezza - 2) System.out.print("*");
                else System.out.print(" ");
            }
            //a capo sium
            System.out.println();
        }
        inputTerminale.close();
    }
}
