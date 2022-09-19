package exercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

class App {
    // BEGIN
    public static String buildList(String[] items) {
        int length  = items.length;

        if (length == 0) {
            return "";
        }

        StringBuilder names = new StringBuilder();

        for (String item: items) {
            names
                .append("  ")
                .append("<li>")
                .append(item)
                .append("</li>\n");
        }
        names.insert(0, "<ul>\n").append("</ul>");

        return names.toString();
    }

    public static String getUsersByYear(String[][] users, int year) {

        String[] names = new String[users.length];

        int index = 0;
        for (String[] user: users) {
            String birthday = user[1];
            LocalDate date = LocalDate.parse(birthday);
            String name = user[0];

            if (date.getYear() == year) {
                names[index] = name;
                index++;
            }
        }

        return buildList(Arrays.copyOfRange(names, 0, index));
    }
    // END

    // Это дополнительная задача, которая выполняется по желанию.
    public static String getYoungestUser(String[][] users, String date) throws Exception {
        // BEGIN
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        LocalDate controlDate = LocalDate.parse(date, formatter);

        String youngestUserName = "";
        LocalDate youngestUserBirthDate = LocalDate.MIN;

        for (String[] user: users) {
            LocalDate userBirthDate = LocalDate.parse(user[1]);
            String userName = user[0];

            if (userBirthDate.isBefore(controlDate) && userBirthDate.isAfter(youngestUserBirthDate)) {
                youngestUserName = userName;
                youngestUserBirthDate = userBirthDate;
            }
        }
        return youngestUserName;
        // END
    }
}
