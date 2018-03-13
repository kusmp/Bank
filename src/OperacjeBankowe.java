import java.util.UUID;

public interface OperacjeBankowe {

    public void wplata(double kwota, UUID id);
    public void wyplata(double kwota, UUID id);
    public void przelew(UUID idOdbiorcy, UUID idNadawcy, double kwota);
    public void zmianaMechanizmuOdsetkowego();
    public void zalozenieLokaty();
    public void zerwanieLokaty();
    public void zaciagniecieKredytu();
    public void splataRatyKredytu();
    public double stworzenieDebetu(double kwota);
    public void wykonanieRaport();
}
