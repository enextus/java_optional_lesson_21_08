public class Problem2 {

    /**
     * The method takes a string and returns a modified string, with the letters changing their case.
     *
     * @param str
     * @return modified str
     */
    public String method(String str) {

        int strLength = str.length();
        char[] charsArr = new char[strLength];

        for (int i = 0; i < strLength; i++) {

            char charSymbol = str.charAt(i);

            if (Character.isUpperCase(charSymbol)) {
                charsArr[i] = Character.toLowerCase(charSymbol);
                continue;
            }

            if (Character.isLowerCase(charSymbol)) {
                charsArr[i] = Character.toUpperCase(charSymbol);
                continue;
            }

            charsArr[i] = charSymbol;
        }

        return String.valueOf(charsArr);
    }

}
