package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void testReverse() {
        int[] numbers1 = {};
        int[] result1 = App.reverse(numbers1);
        assertThat(result1).isEmpty();

        int[] numbers2 = {1, 7, 23, 15, 0, 5, 8};
        int[] expected2 = {8, 5, 0, 15, 23, 7, 1};
        int[] result2 = App.reverse(numbers2);
        assertThat(result2).containsExactly(expected2);
    }

    @Test
    void testMult() {

        int[] numbers1 = {2, 4, 1};
        int result1 = App.mult(numbers1);
        assertThat(result1).isEqualTo(8);

        int[] numbers2 = {2, 4, 1, 0};
        int result2 = App.mult(numbers2);
        assertThat(result2).isEqualTo(0);

        int[] numbers3 = {2, 3, 5, -10};
        int result3 = App.mult(numbers3);
        assertThat(result3).isEqualTo(-300);
    }

    // BEGIN
    @Test
    public void testFlattenMatrix() {

        int[][] matrix1 = new int[0][0];
        int[] actual1 = App.flattenMatrix(matrix1);
        assertThat(actual1).isEmpty();

        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        int[] actual2 = App.flattenMatrix(matrix2);
        int[] expected2 = {1, 2, 3, 4, 5, 6};
        assertThat(actual2).isEqualTo(expected2);

        int[][] matrix3 = {{1, 2}, {4, 5}, {8, 9}, {11, 12}};
        int[] actual3 = App.flattenMatrix(matrix3);
        int[] expected3 = {1, 2, 4, 5, 8, 9, 11, 12};
        assertThat(actual3).isEqualTo(expected3);
    }
    // END
}
