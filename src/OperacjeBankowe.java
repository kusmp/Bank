import java.util.UUID;

public interface OperacjeBankowe {

    public void wplata(double kwota, UUID id);
    public void wyplata(double kwota, UUID id);
    public void przelew(UUID idOdbiorcy, UUID idNadawcy, double kwota);
    public void zmianaMechanizmuOdsetkowego();
    public void zalozenieLokaty(double srodki, int czas, double procent);
    public void zerwanieLokaty(UUID id);
    public void zaciagniecieKredytu(UUID id, double srodki);
    public void splataRatyKredytu(UUID id, double kwotaKredtu);
    public void stworzenieDebetu(UUID id, double srodki, boolean debet, double wielkoscDebetu);
    public void wykonanieRaport();
}
