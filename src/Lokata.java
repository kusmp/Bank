public class Lokata extends RachunekBankowy  {
    private int czas; //podawane w miesiacach
    private double procent;
    private Historia historia;

    public  Lokata (double srodki, int czas, double procent) {
        super(srodki);
        this.czas = czas;
        this.procent = procent;
        this.historia = new Historia("Historia lokaty");
    }

    public int getCzas() {
        this.historia.dodaj("Pobranie czasu trwania lokaty");
        return czas;
    }

    public void setCzas(int czas) {
        this.czas = czas;
        this.historia.dodaj("Ustawienie czasu lokaty");
    }

    public double getProcent() {
        this.historia.dodaj("Pobranie oprocentowania lokaty");
        return procent;
    }

    public void setProcent(double procent) {
        this.historia.dodaj("Ustalenie oprocentowania lokaty");
        this.procent = procent;
    }

    @Override
    public void accept(RaportVisitor raport)
    {
        raport.visit(this);
    }

//    -------------------------------------------
//    Implementacja interface

//    public double wyliczanieOdsetek( double procent, int okres){
//        double naliczoneOdsetki = (okres*((super.pokazSrodki()*procent)/365));
//        double saldoKocowe = super.pokazSrodki() + naliczoneOdsetki;
//        super.setSrodki(saldoKocowe);
//        return saldoKocowe;
//    }
}
