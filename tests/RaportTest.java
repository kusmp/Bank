import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaportTest {
    @Test
    void newRaport() {
        Bank bank = new Bank("WBK");
        RachunekBankowy rachunek = bank.dodawanieRachunek();
        RachunekBankowy rachunek2 = bank.dodawanieRachunek();
        rachunek.setSrodki(1000);
        rachunek2.setSrodki(400);
        List<RachunekBankowy> liczba = bank.getProduktyDoRaportu(500);
        assertEquals(2, liczba.size());
    }
}
