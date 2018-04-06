public class MechanizmOdsetkowyKapitalizacja implements Odsetki {
    @Override
    public double wyliczanieOdsetek(double saldo) {
        double procent = 0.05;
        int okres = 12;
        double kapPocz = saldo;
        double kapKon = kapPocz*Math.pow((1+procent), okres);
        return Math.round(kapKon);
    }
}
