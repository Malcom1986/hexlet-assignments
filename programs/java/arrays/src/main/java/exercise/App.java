package exercise;

class App {
    // BEGIN
    public static int[] reverse(int[] numbers) {

        int length = numbers.length;

        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = numbers[length - i - 1];
        }
        return result;
    }

    public static int mult(int[] numbers) {
        int result = 1;

        for (int number : numbers) {
            result *= number;
        }

        return result;
    }

    public static int[] flattenMatrix(int[][] matrix) {

        if (matrix.length == 0) {
            return new int[0];
        }

        int elementsCount = matrix.length * matrix[0].length;
        int[] result = new int[elementsCount];
        int index = 0;

        for (int[] row: matrix) {
            for (int element: row) {
                result[index] = element;
                index++;
            }
        }

        return result;
    }
    // END
}
