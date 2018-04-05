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

//    @Test
//    void naliczanieKredytu() {
//        Bank bank = new Bank("Bank Zachodni WBK");
//        RachunekBankowy rachunek = bank.dodawanieRachunek();
//        Kredyt kredyt = bank.zaciagniecieKredytu(rachunek.getNrRachunku(), 3000);
//        double kwota = kredyt.naliczanieKredytu(6.0, 2, 500.00);
//        assertEquals(251.876559, kwota);
//
//
//    }
}