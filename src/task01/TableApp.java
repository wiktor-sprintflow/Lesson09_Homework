package task01;

public class TableApp {
    public static void main(String[] args) {
        int[] table = Table.createRandomTable(10,100);
        Table.showArrayBothSides(table);
    }
}