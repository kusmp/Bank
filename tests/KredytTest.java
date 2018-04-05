import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KredytTest {


    @Test
    void zasilKontoKredytem() {
        Bank bank = new Bank("Bank Zachodni WBK");
        RachunekBankowy rachunek = bank.dodawanieRachunek();
        Kredyt kredyt = bank.zaciagniecieKredytu(rachunek.getNrRachunku(), 3000);
        assertEquals(3000, kredyt.pokazSrodki());
    }

    @Test
    void naliczanieKredytu() {
    }
}