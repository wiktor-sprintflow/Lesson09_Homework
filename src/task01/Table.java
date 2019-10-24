package task01;
import java.util.Random;

class Table {

    static int[] createRandomTable(int size, int upperLimit) {
        Random rand = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(upperLimit);
        }
        return numbers;
    }

    static void showArrayBothSides(int[] table) {
        for (int i = 0, j = 2 * table.length; i < 2 * table.length; i++, j--) {
            if (i < table.length) {
                System.out.print(table[i] + " ");
            } else {
                System.out.print(table[j - 1] + " ");
            }
        }
    }
}