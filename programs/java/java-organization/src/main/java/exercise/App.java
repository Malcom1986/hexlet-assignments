// BEGIN
package exercise;

class App {

    public static int getCollWithMaxSumm(int[][] matrix) {
        int rowsCount = matrix.length;
        if (rowsCount == 0) {
            return 0;
        }
        int colsCount = matrix[0].length;
        int max = 0;
        int collIndex = 0;

        for (int i = 0; i < colsCount; i++) {
            int sum = 0;
            for (int j = 0; j < rowsCount; j++) {
                sum += matrix[j][i];
            }
            if (sum > max) {
                max = sum;
                collIndex = i;
            }
        }
        return collIndex;
    }
}
// END
