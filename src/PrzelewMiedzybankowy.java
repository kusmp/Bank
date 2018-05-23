public class PrzelewMiedzybankowy implements OperacjaBankowa {
    private double kwota;
    private RachunekBankowy nadawca;
    private RachunekBankowy odbiorca;
    private Bank sender;
    private Bank receiver;

    public PrzelewMiedzybankowy(RachunekBankowy nadawca, RachunekBankowy odbiorca, double kwota, Bank sender, Bank receiver) {
        this.kwota = kwota;
        this.nadawca = nadawca;
        this.odbiorca = odbiorca;
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public void wykonaj() {
        nadawca.zmniejszSrodki(kwota);
        odbiorca.zwiekszSrodki(kwota);
    }
}

