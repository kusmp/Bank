public class RachunekBankowy implements ProduktBankowy {

    private String rachunek;
    private double srodki;
    private String nazwa;

    public RachunekBankowy(String rachunek){
        this.rachunek = rachunek;
    }

    public RachunekBankowy(String rachunek, double srodki){
        this.rachunek = rachunek;
        this.srodki = srodki;
    }


    public final String wyswietlNumerRachunku(){
        return rachunek;
    }

    public double pokazSrodki(){
        return srodki;
    }

}
