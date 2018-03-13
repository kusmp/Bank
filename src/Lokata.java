public class Lokata extends RachunekBankowy implements ProduktBankowy {
    private String rachunek;
    private double srodki;
    private int czas; //podawane w miesiacach
    private double procent;

    public  Lokata (String rachunek, double srodki, int czas, double procent) {
        super(rachunek, srodki);
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
}
