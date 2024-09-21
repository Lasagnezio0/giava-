/*public class motorino {
    private int cilindrata;
    motorino(int c){
        cilindrata = c; 
    }

    public int getCilindrata(){
        return cilindrata;
    }
}*/

public class motorino {
    private int cilindrata;
    private String modello;
    private String marca;


    motorino(int c, String mo, String ma){
        cilindrata = c;
        modello = mo;
        marca = ma; 
    }

    public int getCilindrata(){
        return cilindrata;
    }
    public String getMarca(){
        return marca;
    }
    public String getmModello(){
        return modello;
    }

    protected void presentati(){
        System.out.println("ciao sono una moto " + modello + " di " + marca + " con cilindrata " + cilindrata);
    }
}
//lìinformation hiding è una caratteristica dei linguaggi di programmazione
//object oriented, la quale da la possibilità di modificare la visibilità
//di metodi ed attributi di classi;