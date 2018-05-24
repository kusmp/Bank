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
        StworzenieRaportu stworzenieRaportu = new StworzenieRaportu(bank, 500);
        bank.wykonajOperacje(stworzenieRaportu);
        assertEquals(1, stworzenieRaportu.produktyDoRaportu.size() );
    }
    @Test
    void newRaportwithCredit() {
        RachunekBankowy rachunek = bank.newRachunek();
        Kredyt kredyt = bank.newKredyt(600);
        rachunek.setSrodki(1000);
        StworzenieRaportu stworzenieRaportu = new StworzenieRaportu(bank, 500);
        bank.wykonajOperacje(stworzenieRaportu);
        assertEquals(2, stworzenieRaportu.produktyDoRaportu.size() );
    }
}
