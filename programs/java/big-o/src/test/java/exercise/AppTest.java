package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class AppTest {
    @Test
    void getIntersectionOfLists1() throws Exception {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = App.getIntersectionOfLists(list1, list2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getIntersectionOfLists2() throws Exception {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        List<Integer> list2 = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = App.getIntersectionOfLists(list1, list2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getIntersectionOfLists3() throws Exception {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = App.getIntersectionOfLists(list1, list2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getIntersectionOfLists4() throws Exception {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 11, 24));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(-2, 4, 4));
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = App.getIntersectionOfLists(list1, list2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getIntersectionOfLists5() throws Exception {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 11, 24));
        Collection<Integer> num2 = Arrays.asList(10, 13, 14, 18, 24, 30);
        List<Integer> list2 = new ArrayList<>(num2);
        List<Integer> expected = new ArrayList<>(Arrays.asList(10, 24));
        List<Integer> result = App.getIntersectionOfLists(list1, list2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getIntersectionOfLists6() throws Exception {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 5, 10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(10, 12, 19, 21));
        List<Integer> expected = new ArrayList<>(Arrays.asList(10));
        List<Integer> result = App.getIntersectionOfLists(list1, list2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getIntersectionOfLists7() throws Exception {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 12, 19, 21));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 5, 10));
        List<Integer> expected = new ArrayList<>(Arrays.asList(10));
        List<Integer> result = App.getIntersectionOfLists(list1, list2);
        assertThat(result).isEqualTo(expected);
    }
}
