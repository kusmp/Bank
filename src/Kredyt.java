public class Kredyt implements ProduktBankowy {


    private int czas; //podawane w miesiacach
    private double procent;
    private String rachunek;
    private double srodki;

    public Kredyt(){

    }

    public String wyswietlNumerRachunku(){
        return rachunek;
    }

}
