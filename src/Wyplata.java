public class Wyplata implements OperacjaBankowa {
    private long kwota;
    private RachunekBankowy rachunekBankowy;

    public Wyplata(RachunekBankowy rachunekBankowy, long kwota) {
        this.kwota = kwota;
        this.rachunekBankowy = rachunekBankowy;
    }

    @Override
    public void wykonaj() {
        rachunekBankowy.zmniejszSrodki(kwota);
    }
}
