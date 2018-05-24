import java.util.UUID;

public class RachunekBankowy implements RachunekBankowyInterfejs {
    private Historia historia;
    private double srodki;
    private UUID RACHUNEK;

    public RachunekBankowy() {
        this.RACHUNEK = UUID.randomUUID();
        this.historia = new Historia("Utworzenie Rachunku bankowego");
    }

    public RachunekBankowy(double srodki) {
        this.RACHUNEK = UUID.randomUUID();
        this.srodki = srodki;
        this.historia = new Historia("Historia Rachunku bankowego");
        this.historia.dodaj("Założenie rachunku");
    }

    public void setSrodki(double srodki) {
        this.srodki = srodki;
        this.historia.dodaj("Dodanie środków w wysokości: " + srodki);
    }

    public UUID getRACHUNEK() {
        this.historia.dodaj("Wyświetlenie numeru rachunku");
        return RACHUNEK;
    }

    public double getSrodki() {
        this.historia.dodaj("Wyświetlenie środków na koncie");
        return srodki;
    }

    @Override
    public void zwiekszSrodki(double srodki) {
        this.srodki += srodki;
        this.historia.dodaj("Zwiększenie środków");
    }

    @Override
    public void zmniejszSrodki(double srodki) {
        if (this.hasEnoughMoney(srodki)) {
            this.srodki -= srodki;
            this.historia.dodaj("Zmiejszenie środków");
        } else {
            this.historia.dodaj("Brak wystarczających środków na koncie");
            Debet debet = new Debet(this);
            debet.zmniejszSrodki(srodki);
        }
    }

    @Override
    public boolean hasEnoughMoney(double srodki) {
        boolean result;
        if (this.getSrodki() < srodki) {
            this.historia.dodaj("Sprawdzenie stanu konta: Niewystarczająco środków");
            result = false;
        } else {
            this.historia.dodaj("Sprawdzenie stanu konta: Wystarczająco środków");
            result = true;
        }
        return result;
    }

    @Override
    public void accept(RaportVisitor raport) {
        this.historia.dodaj("Wygenerowanie raportu");
        raport.visit(this);
    }
}
