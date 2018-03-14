import java.util.UUID;

public class Lokata extends RachunekBankowy implements Odsetki {
    private int czas; //podawane w miesiacach
    private double procent;

    public  Lokata (UUID id, double srodki, int czas, double procent) {
        super(id, srodki);
        this.czas = czas;
        this.procent = procent;
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

    public void wyliczanieOdsetek( double procent, int okres){
        double naliczoneOdsetki = (okres*((super.pokazSrodki()*procent)/365));
        double saldoKocowe = super.pokazSrodki() + naliczoneOdsetki;
        super.setSrodki(saldoKocowe);
    }
}
