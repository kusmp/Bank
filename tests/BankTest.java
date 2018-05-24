import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankTest {
    IzbaBankowa izba = new IzbaBankowa();
    Bank bank = new Bank(izba,"Bank Zachodni WBK");
    Bank bank1 = new Bank(izba,"Bank Millenium");

//    @Test
//    void dodawanieRachunek() {
//        assertEquals(0 , Bank.getRachunki().size());
//        bank.dodawanieRachunek();
//        assertEquals(1 , Bank.getRachunki().size());
//    }

//    @Test
//    void usuwanieRachunek() {
//        RachunekBankowy rachunek = bank.dodawanieRachunek();
//        bank.usuwanieRachunek(rachunek.getNrRachunku());
//        assertEquals(null, Bank.getRachunki().size());
//    }
//
//    @Test
//    void getRachunki() {
//        List<RachunekBankowy> testoweRachunki = new ArrayList<RachunekBankowy>();
//        testoweRachunki.add(bank.dodawanieRachunek());
//        testoweRachunki.add(bank.dodawanieRachunek());
//        assertEquals(2, testoweRachunki.size());
//    }
//
//    @Test
//    void getLokaty() {
//        List<Lokata> testoweLokaty = new ArrayList<Lokata>();
//        testoweLokaty.add(bank.zalozenieLokaty(300, 4, 2));
//        testoweLokaty.add(bank.zalozenieLokaty(500, 5, 6));
//        assertEquals(2,testoweLokaty.size() );
//    }

    @Test
    void wplata() {
        RachunekBankowy rachunek = new RachunekBankowy();
        Wplata wplata = new Wplata(rachunek, 300);
        bank.wykonajOperacje(wplata);
        assertEquals(300, rachunek.getSrodki());
    }

    @Test
    void wyplata() {
        RachunekBankowy rachunek = new RachunekBankowy(400);
        Wyplata wyplata = new Wyplata(rachunek, 300);
        bank.wykonajOperacje(wyplata);
        assertEquals(100, rachunek.getSrodki());
    }

    @Test
    void przelew() {
        RachunekBankowy nadawca = new RachunekBankowy(1000);
        RachunekBankowy odbiorca = new RachunekBankowy(500);
        Przelew przelew = new Przelew(nadawca, odbiorca, 300);
        bank.wykonajOperacje(przelew);
        assertEquals(700, nadawca.getSrodki());
        assertEquals(800, odbiorca.getSrodki());
    }

    @Test
    void przelewMiedzybankowy() {
        izba.addBank(bank);
        izba.addBank(bank1);

        RachunekBankowy nadawca =  bank.newRachunek();
        RachunekBankowy odbiorca =  bank1.newRachunek();

        nadawca.zwiekszSrodki(1000);
        odbiorca.zwiekszSrodki(500);

        bank.przelewMiedzybankowy(100, nadawca, odbiorca);

        assertEquals(900, nadawca.getSrodki());
        assertEquals(600, odbiorca.getSrodki());
    }


    @Test
    void zalozenieLokaty() {
    }

    @Test
    void zerwanieLokaty() {
    }

    @Test
    void zaciagniecieKredytu() {
       Kredyt kredyt = bank.newKredyt(200);
       assertEquals(200, kredyt.getSrodki());
    }

    @Test
    void splataRatyKredytu() {
        Kredyt kredyt = bank.newKredyt(200);
        SplataRatyKredytu splata = new SplataRatyKredytu(kredyt, 100);
        bank.wykonajOperacje(splata);
        assertEquals(100, kredyt.getSrodki());
    }

    @Test
    void stworzenieDebetu() {
    }
}