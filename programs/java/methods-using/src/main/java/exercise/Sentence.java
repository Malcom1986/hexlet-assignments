package exercise;

class Sentence {
    public static void printSentence(String sentence) {
        // BEGIN
        String result = sentence.endsWith("!")
            ? sentence.toUpperCase()
            : sentence.toLowerCase();

        System.out.println(result);
        // END
    }
}
