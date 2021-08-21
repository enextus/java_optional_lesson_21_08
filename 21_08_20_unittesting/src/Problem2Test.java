import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem2Test {

    Problem2 problem2;

    @BeforeEach
    public void init() {
        problem2 = new Problem2();
    }

    @Test
    public void testMethod_emptyString_emptyString() {
        String a = "";

        assertEquals(a, problem2.method(a));
    }

    @Test
    public void testMethod_String10_modString() {
        String res = problem2.method("ab");

        assertEquals(2, res.length());
    }

    @Test
    public void testMethod_String9_modString() {
        String res = problem2.method("Aa");

        assertEquals("aA", res);
    }

    @Test
    public void testMethod_String8_modString() {
        String res = problem2.method("AB");

        assertEquals("ab", res);
    }

    @Test
    public void testMethod_String7_modString() {
        String res = problem2.method("ab");

        assertEquals("AB", res);
    }

    @Test
    public void testMethod_String6_modString() {
        String res = problem2.method("1");

        assertEquals("1", res);
    }

    @Test
    public void testMethod_String_modString() {
        String res = problem2.method("!");

        assertEquals("!", res);
    }

    @Test
    public void testMethod_WithSpaceAtBeginString_modString() {
        String res = problem2.method(" ab");

        assertEquals(" AB", res);
    }

    @Test
    public void testMethod_String5_modString() {
        String res = problem2.method("ab ");

        assertEquals("AB ", res);
    }

    @Test
    public void testMethod_String4_modString() {
        String res = problem2.method(" ab ");

        assertEquals(" AB ", res);
    }

    @Test
    public void testMethod_String3_modString() {
        String res = problem2.method("a b");

        assertEquals("A B", res);
    }

    @Test
    public void testMethod_String1_modString() {
        String res = problem2.method("abc");

        assertEquals("ABC", res);
    }

    @Test
    public void testMethod_String2_modString() {
        String res = problem2.method("AaB!S§$%rtFgr1245Qa.");

        assertEquals("aAb!s§$%RTfGR1245qA.", res);
    }

}
