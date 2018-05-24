public class SplataRatyKredytu implements OperacjaBankowa {

    private Kredyt kredyt;
    private double kwota;

    public SplataRatyKredytu(Kredyt kredyt, double kwota) {
        this.kredyt = kredyt;
        this.kwota = kwota;
    }


    @Override
    public void wykonaj() {
        this.kredyt.zmniejszSrodki(kwota);
    }
}
