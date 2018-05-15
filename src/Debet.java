public class Debet extends RachunekBankowyDekorator {

    private Historia historia;

    public Debet(RachunekBankowy rachunekBankowy) {
        super(rachunekBankowy);
        this.historia = new Historia("Historia debetu");
    }

    @Override
    public void zwiekszSrodki(double srodki) {
        super.zwiekszSrodki(srodki);
    }

    @Override
    public void zmniejszSrodki(double srodki) {
        super.zmniejszSrodki(srodki);
    }

    @Override
    public boolean hasEnoughMoney(double srodki) {
        this.historia.dodaj("Założenie debetu");
        return super.hasEnoughMoney(srodki);
    }
}
