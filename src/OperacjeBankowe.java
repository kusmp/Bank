public interface OperacjeBankowe {

    public void wplata(double kwota);
    public void wyplata(double kwota);
    public void przelew(String rachunek, double kwota);
    public void naliczenieOdsetek();
    public void zmianaMechanizmuOdsetkowego();
    public Lokata zalozenieLokaty();
    public Lokata zerwanieLokaty();
    public Kredyt zaciagniecieKredytu();
    public Kredyt splataRatyKredytu();
    public double stworzenieDebetu(double kwota);
    public void wykonanieRaport();
}
