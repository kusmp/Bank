import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MechanizmOdsetkowyKapitalizacjaTest {
    MechanizmOdsetkowyKapitalizacja mechOdsetkowy = new MechanizmOdsetkowyKapitalizacja();

    @Test
    void wyliczanieOdsetek() {
        double odsetki = mechOdsetkowy.wyliczanieOdsetek(3000);
        assertEquals(5388, odsetki);
    }
}