public class Debet extends RachunekBankowyDekorator {
    private Historia historia;

    public Debet(RachunekBankowy rachunekBankowy, double maxDebet) {
        super(rachunekBankowy, maxDebet);
        this.historia = new Historia("Historia debetu");
    }

    @Override
    public void zwiekszSrodki(double srodki) {
        super.zwiekszSrodki(srodki);
        this.historia.dodaj("Powiększenie debetu");
    }

    @Override
    public void zmniejszSrodki(double srodki) {
        super.zmniejszSrodki(srodki);
        this.historia.dodaj("Zmniejszenie debetu");
    }

    @Override
    public boolean hasEnoughMoney(double srodki) {
        this.historia.dodaj("Sprawdzenie stanu debetu");
        return super.hasEnoughMoney(srodki);
    }
}
