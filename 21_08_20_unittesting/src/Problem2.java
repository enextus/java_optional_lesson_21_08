public class Problem2 {

    /**
     * The method takes a string and returns a modified string, with the letters changing their case.
     *
     * @param str
     * @return
     */
    public String method(String str) {

        char[] arrayCharsOfTheString = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {

            char symbol = str.charAt(i);

            if (Character.isUpperCase(symbol)) {
                arrayCharsOfTheString[i] = Character.toLowerCase(symbol);
                continue;
            }

            if (Character.isLowerCase(symbol)) {
                arrayCharsOfTheString[i] = Character.toUpperCase(symbol);
                continue;
            }

            arrayCharsOfTheString[i] = symbol;
        }

        return String.valueOf(arrayCharsOfTheString);
    }

}
