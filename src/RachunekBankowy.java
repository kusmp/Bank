import java.util.UUID;

public class RachunekBankowy implements ProduktBankowy {

    private double srodki;
    private String nazwa;
    private  UUID RACHUNEK;

    public RachunekBankowy(UUID id) {
        UUID RACHUNEK = id;
    }

    public RachunekBankowy(String rachunekOdbiorcy, double srodki){
        for ( RachunekBankowy rachunek : Bank.getRachunki())
            if(rachunek.nazwa.equals(rachunekOdbiorcy))
        this.srodki = srodki;
    }

    public UUID getRACHUNEK() {
        return RACHUNEK;
    }

    public void setSrodki(double srodki) {
        this.srodki = srodki;
    }

    public void setRACHUNEK(UUID RACHUNEK) {
        this.RACHUNEK = RACHUNEK;
    }

    //Metody rachunku
    public void zwiekszSrodki(double srodki) {
        this.srodki += srodki;
    }

    public void zmniejszSrodki (double srodki) {
        this.srodki -= srodki;
    }

    public final String wyswietlNumerRachunku(){
        return RACHUNEK.toString();
    }

    public double pokazSrodki(){
        return srodki;
    }

}
