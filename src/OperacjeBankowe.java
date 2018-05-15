import java.util.UUID;

public interface OperacjeBankowe {

    public void wplata(double kwota, UUID id);
    public void wyplata(double kwota, UUID id);
    public void przelew(UUID idOdbiorcy, UUID idNadawcy, double kwota);


    public Kredyt zaciagniecieKredytu(UUID id, double srodki);
    public void splataRatyKredytu(UUID id, double kwotaKredtu);
    public void stworzenieDebetu(UUID id, double srodki, boolean debet, double wielkoscDebetu);
    public void wykonanieRaport();
}
