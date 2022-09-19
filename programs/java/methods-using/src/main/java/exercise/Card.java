package exercise;

class Card {
    public static void printHiddenCard(String cardNumber, int starsCount) {
        // BEGIN
        String visibleDigits = cardNumber.substring(12);
        int newLength = 4 + starsCount;
        String result = String
            .format("%" + newLength + "s", visibleDigits)
            .replace(' ', '*');
        System.out.println(result);
        // END
    }
}
