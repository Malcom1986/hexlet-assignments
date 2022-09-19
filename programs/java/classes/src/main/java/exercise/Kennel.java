package exercise;

import java.util.Arrays;


// BEGIN
class Kennel {

    private static String[][] allPuppies;

    public static void resetKennel() {
        allPuppies = new String[0][0];
    }

    public static void addPuppy(String[] puppy) {
        int currentCount = allPuppies.length;
        allPuppies = Arrays.copyOf(allPuppies, currentCount + 1);
        allPuppies[currentCount] = puppy;
    }

    public static void addSomePuppies(String[][] puppies) {
        int newPuppiesCount = puppies.length;
        int currentCount = allPuppies.length;
        allPuppies = Arrays.copyOf(allPuppies, currentCount + newPuppiesCount);
        int index = currentCount;
        for (String[] puppy: puppies) {
            allPuppies[index] = puppy;
            index++;
        }
    }

    public static int getPuppyCount() {
        return allPuppies.length;
    }

    public static boolean isContainPuppy(String name) {
        for (String[] puppy: allPuppies) {
            String currentName = puppy[0];
            if (currentName.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static String[][] getAllPuppies() {
        return allPuppies;
    }

    public static String[] getNamesByBreed(String breed) {
        int currentCount = allPuppies.length;
        String[] names = new String[currentCount];
        int index = 0;

        for (String[] puppy: allPuppies) {
            String currentBreed = puppy[1];
            if (currentBreed.equals(breed)) {
                String name = puppy[0];
                names[index] = name;
                index++;
            }
        }
        return Arrays.copyOfRange(names, 0, index);
    }

    public static boolean removePuppy(String name) {
        if (!isContainPuppy(name)) {
            return false;
        }
        int currentCount = allPuppies.length;
        String[][] newPuppies = new String[currentCount - 1][2];
        int index = 0;
        for (String[] puppy: allPuppies) {
            String currentName = puppy[0];
            if (!currentName.equals(name)) {
                newPuppies[index] = puppy;
                index++;
            }
        }
        allPuppies = newPuppies;
        return true;
    }
}
// END
