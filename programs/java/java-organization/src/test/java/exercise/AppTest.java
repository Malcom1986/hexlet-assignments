package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void testGetCollWithMaxSumm1() throws Exception {
        int[][] matrix = {};
        int result = App.getCollWithMaxSumm(matrix);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void testGetCollWithMaxSumm2() throws Exception {
        int[][] matrix = {
            {3, 6, 5},
            {1, 4, 4},
            {2, 7, 5},
            {9, 2, 1}
        };
        int result = App.getCollWithMaxSumm(matrix);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void testGetCollWithMaxSumm3() throws Exception {
        int[][] matrix = {
            {3, 4, 5, 2},
            {1, 4, 4, 1},
            {2, 3, 5, 3},
            {9, 2, 1, 7}
        };
        int result = App.getCollWithMaxSumm(matrix);
        assertThat(result).isEqualTo(0);
    }
}
