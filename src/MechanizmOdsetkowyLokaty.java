public class MechanizmOdsetkowyLokaty implements Odsetki {
    public double wyliczanieOdsetek(double saldo){
        double procent = 8;
        int okres = 18;
        double naliczoneOdsetki = (okres*((saldo*procent)/365));
        return Math.round(naliczoneOdsetki);
    }
}
