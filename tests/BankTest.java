import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankTest {
    Bank bank = new Bank("Bank Zachodni WBK");

    @Test
    void dodawanieRachunek() {
        bank.dodawanieRachunek();
        assertEquals(1 , Bank.getRachunki().size());
    }

    @Test
    void usuwanieRachunek() {
        RachunekBankowy rachunek = bank.dodawanieRachunek();
        bank.usuwanieRachunek(rachunek.getNrRachunku());
        assertEquals(null, Bank.getRachunki().size());
    }

    @Test
    void getRachunki() {
        List<RachunekBankowy> testoweRachunki = new ArrayList<RachunekBankowy>();
        testoweRachunki.add(bank.dodawanieRachunek());
        testoweRachunki.add(bank.dodawanieRachunek());
        assertEquals(2, testoweRachunki.size());
    }

    @Test
    void getLokaty() {
    }

    @Test
    void wplata() {
    }

    @Test
    void wyplata() {
    }

    @Test
    void przelew() {
    }

    @Test
    void zalozenieLokaty() {
    }

    @Test
    void zerwanieLokaty() {
    }

    @Test
    void zaciagniecieKredytu() {
    }

    @Test
    void splataRatyKredytu() {
    }

    @Test
    void stworzenieDebetu() {
    }
}