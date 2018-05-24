import java.util.UUID;

public interface OperacjeBankowe {
    public void splataRatyKredytu(UUID id, double kwotaKredtu);
    public void stworzenieDebetu(UUID id, double srodki, boolean debet, double wielkoscDebetu);
    public void wykonanieRaport();
}
