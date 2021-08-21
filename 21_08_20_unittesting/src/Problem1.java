public class Problem1 {

    /**
     * The method receive a string and returns the reversed string as result.
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
