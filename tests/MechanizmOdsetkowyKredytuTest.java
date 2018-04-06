import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MechanizmOdsetkowyKredytuTest {
    MechanizmOdsetkowyKredytu mechOdsetkowy = new MechanizmOdsetkowyKredytu();

    @Test
    void wyliczanieOdsetek() {
        double odsetki = mechOdsetkowy.wyliczanieOdsetek(3000);
        assertEquals(317, odsetki);
    }
}