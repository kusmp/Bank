import java.util.UUID;

public class RachunekBankowy implements ProduktBankowy {
    private Historia historia;
    private double srodki;
    private  UUID RACHUNEK;

    public RachunekBankowy() {
        this.RACHUNEK = UUID.randomUUID();
        this.historia = new Historia("Historia Rachunku bankowego");
    }

    public RachunekBankowy(UUID id) {
        UUID RACHUNEK = id;
    }

    public RachunekBankowy(UUID id, double srodki){
        UUID RACHUNEK = id;
        this.srodki = srodki;
        this.historia = new Historia("Historia Rachunku bankowego");
    }

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
        this.historia.dodaj("Zwiększenie środków");
    }

    public void zmniejszSrodki (double srodki) {
        this.srodki -= srodki;
        this.historia.dodaj("Zmiejszenie środków");
    }

    public final String wyswietlNumerRachunku(){
        this.historia.dodaj("Wyświetlenie numeru rachunku");
        return RACHUNEK.toString();
    }

    public double pokazSrodki(){
        this.historia.dodaj("Wyświetlenie środków na koncie");
        return srodki;
    }

//    public static void main(String[] args) {
//        RachunekBankowy rach = new RachunekBankowy();
//        rach.historia.dodaj("dasdsadas");
//        rach.historia.getHistoria();
//    }
}
