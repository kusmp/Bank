import java.util.UUID;

public interface OperacjeBankowe {
    public Kredyt zaciagniecieKredytu(UUID id, double srodki);
    public void splataRatyKredytu(UUID id, double kwotaKredtu);
    public void stworzenieDebetu(UUID id, double srodki, boolean debet, double wielkoscDebetu);
    public void wykonanieRaport();
}
