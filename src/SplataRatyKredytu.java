public class SplataRatyKredytu implements OperacjaBankowa {

    private Kredyt kredyt;
    private double kwota;

    public SplataRatyKredytu(Kredyt kredyt, double kwota) {
        this.kredyt = kredyt;
    }


    @Override
    public void wykonaj() {
        if(this.kredyt.getLiczbaRat()>0){
            this.kredyt.zmniejszSrodki(kwota);
            this.kredyt.setLiczbaRat(this.kredyt.getLiczbaRat()-1);
        }
    }
}
