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

    @Test
    public void test_two() {
        assertEquals("2", auto.getIdNumber());
    }

    @Test
    public void test_three() {
        assertEquals("12", auto.concat(auto.getName(), auto.getIdNumber()));
    }
}