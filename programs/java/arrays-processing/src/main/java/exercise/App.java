package exercise;

class App {
    // BEGIN
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int getIndexOfMaxNegative(int[] numbers) {
        int length = numbers.length;
        int index = -1;

        for (int i = 0; i < length; i++) {
            int current = numbers[i];
            if (current < 0) {
                if (index == -1 || current > numbers[index]) {
                    index = i;
                }
            }
        }

        return index;
    }

    public static int[] getElementsLessAverage(int[] numbers) {

        int length = numbers.length;

        if (length == 0) {
            return new int[0];
        }

        int average = sum(numbers) / length;

        int elementsCount = 0;
        for (int number : numbers) {
            if (number <= average) {
                elementsCount++;
            }
        }

        int[] result = new int[elementsCount];
        int index = 0;
        for (int number : numbers) {
            if (number <= average) {
                result[index] = number;
                index++;
            }
        }

        return result;
    }

    public static int getSumBeforeMinAndMax(int[] numbers) {
        int length = numbers.length;
        int minElementIndex = 0;
        int maxElementIndex = 0;

        for (int i = 0; i < length; i++) {
            if (numbers[i] < numbers[minElementIndex]) {
                minElementIndex = i;
            } else if (numbers[i] > numbers[maxElementIndex]) {
                maxElementIndex = i;
            }
        }

        if (minElementIndex > maxElementIndex) {
            int temp = minElementIndex;
            minElementIndex = maxElementIndex;
            maxElementIndex = temp;
        }

        int sum = 0;

        for (int i = minElementIndex + 1; i < maxElementIndex; i++) {
            sum += numbers[i];
        }

        return sum;
    }
    // END
}
