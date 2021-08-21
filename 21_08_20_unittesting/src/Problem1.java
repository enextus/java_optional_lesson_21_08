public class Problem1 {

    /**
     * The method should receive a string, reverse it return result
     *
     * @param str
     * @return
     */
    public String solve(String str) {
        StringBuilder sb = new StringBuilder(str);

        sb.reverse();
        return sb.toString();
    }

}
