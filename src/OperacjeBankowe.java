import java.util.UUID;

public interface OperacjeBankowe {

    public void wplata(double kwota, UUID id);
    public void wyplata(double kwota, UUID id);
    public void przelew(UUID idOdbiorcy, UUID idNadawcy, double kwota);
    public void zmianaMechanizmuOdsetkowego();
    public Lokata zalozenieLokaty(double srodki, int czas, double procent);
    public void zerwanieLokaty(UUID id);
    public void zaciagniecieKredytu();
    public void splataRatyKredytu();
    public double stworzenieDebetu(double kwota);
    public void wykonanieRaport();
}
