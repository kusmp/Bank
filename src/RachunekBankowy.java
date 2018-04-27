import java.util.UUID;

public class RachunekBankowy implements ProduktBankowy {
    private Historia historia;
    private double srodki;
    private UUID RACHUNEK;
    private boolean debet;
    private double wielkoscDebetu;
    private Operacja operacja;

    public RachunekBankowy() {
        this.RACHUNEK = UUID.randomUUID();
        this.historia = new Historia("Utworzenie Rachunku bankowego");
    }

    public RachunekBankowy(UUID id) {
        UUID RACHUNEK = id;
    }

    public RachunekBankowy(UUID id, double srodki){
        UUID RACHUNEK = id;
        this.srodki = srodki;
        debet = false;
        wielkoscDebetu = 0;
        this.historia = new Historia("Historia Rachunku bankowego");
        this.historia.dodaj("Założenie rachunku");
    }

    public RachunekBankowy(UUID id, double srodki, boolean debet, double wielkoscDebetu){
        UUID RACHUNEK = id;
        this.srodki = srodki;
        this.debet = true;
        this.wielkoscDebetu = wielkoscDebetu;
        this.historia = new Historia("Historia Rachunku bankowego");
        this.historia.dodaj("Założenie rachunku z debetem");
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
        this.historia.dodaj("Zwiększenie środków");
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

//    -------------------------------------------
//    Implementacja operacji bankowych



}
