public class Wyplata implements OperacjaBankowa {
    private long kwota;
    private RachunekBankowy rachunekBankowy;
    private Historia historia;

    public Wyplata(RachunekBankowy rachunekBankowy, long kwota) {
        this.kwota = kwota;
        this.rachunekBankowy = rachunekBankowy;
    }

    @Override
    public void wykonaj() {
        this.historia.dodaj("Wypłata z rachunku");
        rachunekBankowy.zmniejszSrodki(kwota);
    }
}
