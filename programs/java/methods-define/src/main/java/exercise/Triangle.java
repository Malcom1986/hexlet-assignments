package exercise;

class Triangle {
    // BEGIN
    public static double getSquare(int side1, int side2, int angle) {
        double angleInRadians = angle * Math.PI / 180;
        double sin = Math.sin(angleInRadians);
        return (side1 * side2 * sin) / 2;
    }

    public static void main(String[] args) {
        double square = getSquare(4, 5, 45);
        System.out.println(square);
    }
    // END
}
