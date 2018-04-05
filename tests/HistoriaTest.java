import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class HistoriaTest {
    Historia histora = new Historia("Historia bank");

    @Test
    void dodaj() {
        List<Operacja> testList = new ArrayList<Operacja>();
        testList.add(histora.dodaj("Przelew"));
        testList.add(histora.dodaj("Wypłata"));
        testList.add(histora.dodaj("Wpłata"));
        assertEquals(3, testList.size());
    }
}