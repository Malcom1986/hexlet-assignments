package exercise;

class App {
    public static boolean isBigOdd(int number) {
        // BEGIN
        boolean isBigOddVariable = number % 2 != 0 && number > 1000;
        // END
        return isBigOddVariable;
    }

    public static void sayEvenOrNot(int number) {
        // BEGIN
        boolean isEven = number % 2 == 0;
        String answer = isEven ? "yes" : "no";
        System.out.println(answer);
        // END
    }

    public static void printPartOfHour(int minutes) {
        // BEGIN
        if (minutes >= 0 && minutes < 15) {
            System.out.println("First");
        } else if (minutes >= 15 && minutes <= 30) {
            System.out.println("Second");
        } else if (minutes >= 31 && minutes <= 45) {
            System.out.println("Third");
        } else {
            System.out.println("Fourth");
        }
        // END
    }
}
