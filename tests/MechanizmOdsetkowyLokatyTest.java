import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MechanizmOdsetkowyLokatyTest {
    MechanizmOdsetkowyLokaty mechOdsetkowy = new MechanizmOdsetkowyLokaty();

    @Test
    void wyliczanieOdsetek() {
        double odsetki = mechOdsetkowy.wyliczanieOdsetek(3000);
        assertEquals(1184 ,odsetki);
    }
}