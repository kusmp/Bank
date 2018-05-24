import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaportTest {
    IzbaBankowa izba = new IzbaBankowa();
    Bank bank = new Bank(izba, "Bank Zachodni WBK");

    @Test
    void newRaport() {
        RachunekBankowy rachunek = bank.newRachunek();
        RachunekBankowy rachunek2 = bank.newRachunek();
        rachunek.setSrodki(1000);
        rachunek2.setSrodki(400);
        List<RachunekBankowy> liczba = bank.getProduktyDoRaportu(500);
        assertEquals(2, liczba.size());
    }
}
