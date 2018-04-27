public class Wplata implements OperacjaBankowa {
    private long kwota;
    private RachunekBankowy rachunekBankowy;

    public Wplata(RachunekBankowy rachunekBankowy, long kwota) {
        this.rachunekBankowy = rachunekBankowy;
        this.kwota = kwota;
    }

    @Override
    public void wykonaj() {
        rachunekBankowy.zwiekszSrodki(kwota);
    }
}
