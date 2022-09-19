package exercise;

class App {
    // BEGIN
    public static String getTypeOfTriangle(int a, int b, int c) {

        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Треугольник не существует";
        }
        if (a != b && a != c && b != c) {
            return "Разносторонний";
        }
        if (a == b && b == c) {
            return "Равносторонний";
        }

        return "Равнобедренный";
    }

    public static int getFinalGrade(int exam, int project) {

        if (exam > 90 || project > 10) {
            return 100;
        }
        if (exam > 75 && project >= 5) {
            return 90;
        }
        if (exam > 50 && project >= 2) {
            return 75;
        }
        return 0;
    }
    // END
}
