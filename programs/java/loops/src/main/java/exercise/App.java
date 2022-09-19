package exercise;

class App {
    // BEGIN
    public static String getAbbreviation(String phrase) {
        if (phrase.isEmpty()) {
            return "";
        }
        String abbreviation = String.valueOf(phrase.charAt(0));
        for (int i = 0; i < phrase.length() - 1; i++) {
            final char currentChar = phrase.charAt(i);
            final char nextChar = phrase.charAt(i + 1);

            final boolean currentCharIsSpace = currentChar == ' ';
            final boolean nextCharIsNotSpace = nextChar != ' ';

            if (currentCharIsSpace && nextCharIsNotSpace) {
                abbreviation += nextChar;
            }
        }
        return abbreviation.trim().toUpperCase();
    }
    // END
}
