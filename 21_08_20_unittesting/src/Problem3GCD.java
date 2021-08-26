public class Problem3GCD {

    /**
     * GcdSolver
     * The method accepts only positive int numbers.
     * GCD(m,n) (the greatest common divisor)
     *
     * @param a int number
     * @param b int number
     * @return GCD of a and b
     */
    public int gcdSolver(int a, int b) {
        return b == 0 ? a : gcdSolver(b, a % b);
    }

}
