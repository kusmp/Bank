import java.util.UUID;

public class RachunekBankowy implements RachunekBankowyInterfejs {
    private Historia historia;
    private double srodki;
    private UUID RACHUNEK;
    private double wielkoscDebetu;
    private Operacja operacja;

    public RachunekBankowy() {
        this.RACHUNEK = UUID.randomUUID();
        this.historia = new Historia("Utworzenie Rachunku bankowego");
    }

    public RachunekBankowy(double srodki){
        UUID RACHUNEK =  UUID.randomUUID();
        this.srodki = srodki;
        wielkoscDebetu = 0;
        this.historia = new Historia("Historia Rachunku bankowego");
        this.historia.dodaj("Założenie rachunku");
    }

    public RachunekBankowy(double srodki, boolean debet, double wielkoscDebetu){
        UUID RACHUNEK = UUID.randomUUID();
        this.srodki = srodki;
        this.wielkoscDebetu = wielkoscDebetu;
        this.historia = new Historia("Historia Rachunku bankowego");
        this.historia.dodaj("Założenie rachunku z debetem");
    }

    public void setSrodki(double srodki) {
        this.srodki = srodki;
    }

    public void setRACHUNEK(UUID RACHUNEK) {
        this.RACHUNEK = RACHUNEK;
    }

    public UUID getRACHUNEK() {
        return RACHUNEK;
    }

    public double getSrodki(){
        this.historia.dodaj("Wyświetlenie środków na koncie");
        return srodki;
    }

    //Metody rachunku

    @Override
    public void zwiekszSrodki(double srodki) {
        this.srodki += srodki;
        this.historia.dodaj("Zwiększenie środków");
    }

    @Override
    public void zmniejszSrodki (double srodki) {
        if(this.hasEnoughMoney(srodki)){
            this.srodki-=srodki;
            this.historia.dodaj("Zmiejszenie środków");
        }else{
            Debet debet = new Debet(this);
            debet.zmniejszSrodki(srodki);
        }
    }

    @Override
    public boolean hasEnoughMoney(double srodki) {
        boolean result;
        if(this.getSrodki()<srodki){
            result = false;
        }else{
            result = true;
        }
        return result;
    }

        @Override
        public void accept(RaportVisitor raport)
        {
            raport.visit(this);
        }
}
