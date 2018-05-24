import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RachunekBankowyTest {

    @Test
    void zwiekszSrodki() {
        RachunekBankowy rachunek = new RachunekBankowy();
        rachunek.zwiekszSrodki(500);
        assertEquals(500,rachunek.getSrodki());
    }
    @Test
    void zmniejszSrodki() {
        RachunekBankowy rachunek = new RachunekBankowy();
        rachunek.setSrodki(600);
        rachunek.zmniejszSrodki(300);
        assertEquals(300,rachunek.getSrodki());
    }
    @Test
    void zmniejszSrodkiDebet() {
        RachunekBankowy rachunek = new RachunekBankowy();
        rachunek.setSrodki(600);
        rachunek.zmniejszSrodki(1000);
        assertEquals(600,rachunek.getSrodki());
    }
    @Test
    void pokazSrodki() {
        RachunekBankowy rachunek = new RachunekBankowy();
        assertEquals(0,rachunek.getSrodki());
    }

    @Test
    void testDebetDobrze(){
        RachunekBankowy rachunek = new RachunekBankowy();
        rachunek.setSrodki(1000);
        RachunekBankowyDekorator dekorator = new RachunekBankowyDekorator(rachunek, 500);
        dekorator.zmniejszSrodki(1400);
        assertEquals(400, dekorator.getDebet());
        assertEquals(true, dekorator.isDebetExist());

    }


    @Test
    void testDebet(){
        RachunekBankowy rachunek = new RachunekBankowy();
        rachunek.setSrodki(1000);
        RachunekBankowyDekorator dekorator = new RachunekBankowyDekorator(rachunek, 500);
        dekorator.zmniejszSrodki(2000);
        assertEquals(0, dekorator.getDebet());
        assertEquals(false, dekorator.isDebetExist());
    }

    @Test
    void testDebetBezWykorzystania(){
        RachunekBankowy rachunek = new RachunekBankowy();
        rachunek.setSrodki(1000);
        RachunekBankowyDekorator dekorator = new RachunekBankowyDekorator(rachunek, 500);
        dekorator.zmniejszSrodki(500);
        assertEquals(0, dekorator.getDebet());
        assertEquals(false, dekorator.isDebetExist());
    }
}
