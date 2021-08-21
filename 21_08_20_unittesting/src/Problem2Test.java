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
    public void testSolve_String_lengthOfString() {
        String res = problem2.method("ab");

        assertEquals(2, res.length());
    }

    @Test
    public void testSolve_twoStringUpperAndLower_oneString() {
        String res = problem2.method("Aa");

        assertEquals("aA", res);
    }

    @Test
    public void testSolve_twoStringUpper_oneString() {
        String res = problem2.method("AB");

        assertEquals("ab", res);
    }

    @Test
    public void testSolve_String_reversedString() {
        String res = problem2.method("ab");

        assertEquals("AB", res);
    }

    @Test
    public void testSolve_String_reversed2String() {
        String res = problem2.method("1");

        assertEquals("1", res);
    }

    @Test
    public void testSolve_String_reversed3String() {
        String res = problem2.method("!");

        assertEquals("!", res);
    }

    @Test
    public void testSolve_String_reverseWithSpaceAtBeginString() {
        String res = problem2.method(" ab");

        assertEquals(" AB", res);
    }

    @Test
    public void testSolve_String_reverseWithSpaceAtEndString() {
        String res = problem2.method("ab ");

        assertEquals("AB ", res);
    }

    @Test
    public void testSolve_String_reverseWithSpaceAtBeginAndEndString() {
        String res = problem2.method(" ab ");

        assertEquals(" AB ", res);
    }

    @Test
    public void testSolve_String_reverseWithSpaceAtMiddleString() {
        String res = problem2.method("a b");

        assertEquals("A B", res);
    }

    @Test
    public void testSolve_StringWithThreeChar_reverseString() {
        String res = problem2.method("abc");

        assertEquals("ABC", res);
    }

    @Test
    public void testSolve_StringWithThreeChar_reverse4String() {
        String res = problem2.method("AaB!S§$%rtFgr1245Qa.");

        assertEquals("aAb!s§$%RTfGR1245qA.", res);
    }

}
