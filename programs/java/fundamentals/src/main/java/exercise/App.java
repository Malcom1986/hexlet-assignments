package exercise;

class App {
    public static void numbers() {
        // BEGIN
        Number result = (8 / 2) + (100 % 3);
        System.out.println(result);
        // END
    }

    public static void strings() {
        String language = "Java";
        // BEGIN
        String sentence = language + " works on JVM";
        System.out.println(sentence);
        // END
    }

    public static void converting() {
        Number soldiersCount = 300;
        String name = "spartans";
        // BEGIN
        System.out.println(soldiersCount + " " + name);
        // END
    }
}
