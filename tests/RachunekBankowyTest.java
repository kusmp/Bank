import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RachunekBankowyTest {

    @Test
    void zwiekszSrodki() {
        RachunekBankowy rachunek = new RachunekBankowy();
        rachunek.zwiekszSrodki(500);
        assertEquals(500,rachunek.pokazSrodki());
    }
    @Test
    void zmniejszSrodki() {
        RachunekBankowy rachunek = new RachunekBankowy();
        rachunek.setSrodki(600);
        rachunek.zmniejszSrodki(300);
        assertEquals(300,rachunek.pokazSrodki());
    }
    @Test
    void zmniejszSrodkiDebet() {
        RachunekBankowy rachunek = new RachunekBankowy();
        rachunek.setSrodki(600);
        rachunek.zmniejszSrodki(1000);
        assertEquals(600,rachunek.pokazSrodki());
    }
    @Test
    void pokazSrodki() {
        RachunekBankowy rachunek = new RachunekBankowy();
        assertEquals(0,rachunek.pokazSrodki());
    }
}