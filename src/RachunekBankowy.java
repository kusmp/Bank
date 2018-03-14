import java.util.UUID;

public class RachunekBankowy implements ProduktBankowy {

    private double srodki;
    private  UUID RACHUNEK;
    private boolean debet;
    private double wielkoscDebetu;

    public RachunekBankowy(UUID id) {
        UUID RACHUNEK = id;
    }

    public RachunekBankowy(UUID id, double srodki){
        UUID RACHUNEK = id;
        this.srodki = srodki;
        debet = false;
        wielkoscDebetu = 0;
    }

    public RachunekBankowy(UUID id, double srodki, boolean debet, double wielkoscDebetu){
        UUID RACHUNEK = id;
        this.srodki = srodki;
        this.debet = true;
        this.wielkoscDebetu = wielkoscDebetu;
    }

    public void setDebet(boolean debet){this.debet = debet;}

    public boolean getDebet(){return debet;}

    public UUID getNrRachunku() {
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

        if(this.srodki < srodki){
            System.out.println("Brak srodkow");
        }
        else{

        if(debet==false && (this.srodki - srodki)>0) {
        this.srodki -= srodki;
        }
        else if (debet==true && (this.srodki + wielkoscDebetu) - srodki > 0 ){
            this.srodki -= srodki;
        }
        }
    }

    public final String wyswietlNumerRachunku(){
        return RACHUNEK.toString();
    }

    public double pokazSrodki(){
        return srodki;
    }

}
