public class Lokata extends RachunekBankowy  {
    private int czas; //podawane w miesiacach
    private double procent;
    private Historia historia;

    public  Lokata (double srodki, int czas, double procent) {
        super(srodki);
        this.czas = czas;
        this.procent = procent;
        this.historia = new Historia("Historia lokaty Damiana");
    }

    public int getCzas() {
        return czas;
    }

    public void setCzas(int czas) {
        this.czas = czas;
    }

    public double getProcent() {
        return procent;
    }

    public void setProcent(double procent) {
        this.procent = procent;
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
