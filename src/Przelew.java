public class Przelew implements OperacjaBankowa {
    private double kwota;
    private RachunekBankowy nadawca;
    private RachunekBankowy odbiorca;
    private Historia historia = new Historia("Historia przelewu");

    public Przelew(RachunekBankowy nadawca, RachunekBankowy odbiorca, double kwota) {
        this.kwota = kwota;
        this.nadawca = nadawca;
        this.odbiorca = odbiorca;
    }

    @Override
    public void wykonaj() {
        nadawca.zmniejszSrodki(kwota);
        odbiorca.zwiekszSrodki(kwota);
        this.historia.dodaj("Wykonanie przelewu");
    }
}
