package exercise;

class App {
    // BEGIN
    public static int[] sort(int[] numbers) {

        int stepsCount = numbers.length - 1;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < stepsCount; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }
            }
            stepsCount -= 1;
        } while (swapped);

        return numbers;
    }
    // END
}
