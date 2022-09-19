package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void testGetTypeOfTriangle1() {
        String result = App.getTypeOfTriangle(1, 2, 7);
        assertThat(result).isEqualTo("Треугольник не существует");
    }

    @Test
    void testGetTypeOfTriangle2() {
        String result = App.getTypeOfTriangle(5, 6, 7);
        assertThat(result).isEqualTo("Разносторонний");
    }

    @Test
    void testGetTypeOfTriangle3() {
        String result = App.getTypeOfTriangle(5, 6, 5);
        assertThat(result).isEqualTo("Равнобедренный");
    }

    @Test
    void testGetTypeOfTriangle4() {
        String result = App.getTypeOfTriangle(5, 5, 5);
        assertThat(result).isEqualTo("Равносторонний");
    }

    @Test
    void testGetTypeOfTriangle5() {
        String result = App.getTypeOfTriangle(1, -2, 7);
        assertThat(result).isEqualTo("Треугольник не существует");
    }

    // BEGIN
    @Test
    void testGetFinalGrade() {
        assertThat(App.getFinalGrade(100, 12)).isEqualTo(100);
        assertThat(App.getFinalGrade(99, 0)).isEqualTo(100);
        assertThat(App.getFinalGrade(10, 15)).isEqualTo(100);
        assertThat(App.getFinalGrade(85, 5)).isEqualTo(90);
        assertThat(App.getFinalGrade(85, 4)).isEqualTo(75);
        assertThat(App.getFinalGrade(75, 5)).isEqualTo(75);
        assertThat(App.getFinalGrade(55, 3)).isEqualTo(75);
        assertThat(App.getFinalGrade(55, 2)).isEqualTo(75);
        assertThat(App.getFinalGrade(55, 0)).isEqualTo(0);
        assertThat(App.getFinalGrade(20, 2)).isEqualTo(0);
    }
    // END
}
