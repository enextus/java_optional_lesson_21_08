import de.telran.Auto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AutoTest {

    Auto auto;

    @BeforeEach
    public void init() {
        auto = new Auto("1", "2");
    }


    @Test
    public void test_one() {
        assertEquals("1", auto.getName());
    }
}