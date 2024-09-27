public class Motocicletta {
    
    private String marca;
    private String modello;
    private int cilindrata;

    public Motocicletta(String ma, String mo, int cilindrata){
        marca = ma;
        modello = mo;
        this.cilindrata = cilindrata;
    }

    //getter
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }
    public int getCilindrata() {
        return cilindrata;
    }

    //setter
    public void setModello(String modello) {
        this.modello = modello;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCilindrata(int cilindrata) {
        if(cilindrata > 0) this.cilindrata = cilindrata;
        else cilindrata = 0;
    }

    void printInfo(){
        System.out.println(this.getMarca());
        System.out.println(this.getModello());
        System.out.println(this.getCilindrata());
    }

    public String toString(){
        return "-------------" + "\n" + "Marca: " + this.getMarca() + "\n" + "Modello: " + this.getModello() + "\n" + "Cilindrata: " + this.getCilindrata() + "\n-------------";
    }
    
    //main
    public static void main(String[] args) throws Exception {
        Motocicletta ducati = new Motocicletta("Ducati","Panigale" ,1500);
        Motocicletta aprilia = new Motocicletta("Aprilia","RS" ,1100);
    
        ducati.setCilindrata(2000);
        
        //metodo 1: Stampa diretta
        /*System.out.println(ducati.getMarca());
        System.out.println(ducati.getModello());
        System.out.println(ducati.getCilindrata());*/

        //Metodo 2: funzione stampante op
        /*ducati.printInfo();
        aprilia.printInfo(); */

        //Metodo 3: metodo toString, metodo per stampare predefinito
        System.out.println(ducati);
        System.out.println(aprilia);
    }
}
