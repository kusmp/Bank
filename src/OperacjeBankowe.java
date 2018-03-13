import java.util.UUID;

public interface OperacjeBankowe {

    public void wplata(double kwota, UUID id);
    public void wyplata(double kwota, UUID id);
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
