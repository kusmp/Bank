public class MechanizmOdsetkowyKredytu implements Odsetki {
    @Override
    public double wyliczanieOdsetek(double saldo) {
        double procent = 10;
        int okres = 10;
        double wspolczynnikProcentowy = 1+(((double)1/10)*(procent/100));
        double licznik = (saldo*Math.pow(wspolczynnikProcentowy, okres)*(wspolczynnikProcentowy-1));
        double mianownik = Math.pow(wspolczynnikProcentowy, okres)-1;
        double odsetki = licznik/mianownik;
        return Math.round(odsetki);
    }
}
