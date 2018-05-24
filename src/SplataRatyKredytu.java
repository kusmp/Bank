public class SplataRatyKredytu implements OperacjaBankowa {

    private Kredyt kredyt;
    private double kwota;
    private Historia historia = new Historia("Historia spłaty raty kredytu");

    public SplataRatyKredytu(Kredyt kredyt, double kwota) {
        this.kredyt = kredyt;
        this.kwota = kwota;
    }


    @Override
    public void wykonaj() {
        this.kredyt.zmniejszSrodki(kwota);
        this.historia.dodaj("Spłata raty kredyru");
    }
}
