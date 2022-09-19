package exercise;

import java.util.List;
import java.util.ArrayList;

// BEGIN
class App {
    public static List getIntersectionOfLists(
        List<Integer> list1,
        List<Integer> list2) {

        int length1 = list1.size();
        int length2 = list2.size();

        int i1 = 0;
        int i2 = 0;

        List<Integer> result = new ArrayList<>();

        while (i1 < length1 && i2 < length2) {
            int current1 = list1.get(i1);
            int current2 = list2.get(i2);

            if (current1 == current2) {
                result.add(current1);
                i1 += 1;
                i2 += 1;
            } else if (current1 > current2) {
                i2 += 1;
            } else {
                i1 += 1;
            }
        }
        return result;
    }
}
//END
