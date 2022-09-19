package exercise;

class Converter {
    // BEGIN
    public static int convert(int value, String unit) {
        switch (unit) {
            case "b":
                return value * 1024;
            case "Kb":
                return value / 1024;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        int value = convert(10, "b");
        String message = String.format("10 Kb = %d b", value);
        System.out.println(message);
    }
    // END
}
