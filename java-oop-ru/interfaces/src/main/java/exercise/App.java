package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {

    // new
    public static List<String> buildAppartmentsList(List<Home> appartments, int count) {
        return appartments.stream()
            .sorted(Home::compareTo)
            .limit(count)
            .map(Home::toString)
            .toList();
    }
    // old
    public static List<String> buildAppartmentsList2(List<Home> appartments, int count) {
        int normalizedCount = Math.min(count, appartments.size());
        appartments.sort(Home::compareTo);
        List<Home> sublist = appartments.subList(0, normalizedCount);
        return sublist.stream()
            .map(appartment -> appartment.toString())
            .collect(Collectors.toList());
    }
}
// END
