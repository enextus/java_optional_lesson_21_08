public class Problem2 {

    /**
     * The method takes a string and returns a modified string, with the letters changing their case.
     *
     * @param str
     * @return
     */
    public String method(String str) {

        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {

            char symbol = str.charAt(i);

            if (Character.isUpperCase(symbol)) {
                ch[i] = Character.toLowerCase(symbol);
                continue;
            }

            if (Character.isLowerCase(symbol)) {
                ch[i] = Character.toUpperCase(symbol);
                continue;
            }

            ch[i] = symbol;
        }

        return String.valueOf(ch);
    }

}
