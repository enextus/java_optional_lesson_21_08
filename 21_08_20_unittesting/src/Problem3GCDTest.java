import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem3GCDTest {

    Problem3GCD gcdSolver;

    @BeforeEach
    public void init() {
        gcdSolver = new Problem3GCD();
    }

    @Test
    public void testGcd_nEquals15_20_5() {
        assertEquals(5, gcdSolver.gcdSolver(15, 20));
    }

    @Test
    public void testGcd_nEquals20_15_5() {
        assertEquals(5, gcdSolver.gcdSolver(20, 15));
    }

    @Test
    public void test_nEquals1071_462_21() {
        assertEquals(21, gcdSolver.gcdSolver(1071, 462));
    }

    @Test
    public void test_nEquals462_1071_21() {
        assertEquals(21, gcdSolver.gcdSolver(462, 1071));
    }

    @Test
    public void test_nEquals100045_1071_21() {
        assertEquals(17, gcdSolver.gcdSolver(100045, 1071));
    }

}