package task2;

class Number {
    private static int sumAllDigits(int number) {
        int numberOfDigits = getNumberOfDigits(number);
        int digitsSum = 0;

        for (int i = 0; i < numberOfDigits; i++) {
            digitsSum += number % 10;
            number /= 10;
        }
        return digitsSum;
    }

    private static int getNumberOfDigits(int number) {
        int i = 0;
        do {
            number /= 10;
            i++;
        } while (number != 0);
        return i;
    }

    static String showSumOfAllDigits(int number) {
        return ("Suma cyfr w liczbie " + number + " wynosi: " + sumAllDigits(number));
    }
}
