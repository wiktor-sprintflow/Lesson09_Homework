package task4;

class ArrayComparator {
    static boolean compare(int[] table1, int[] table2) {
        if (validateTables(table1, table2)) {
            if (table1.length != table2.length) {
                return false;
            } else {
                for (int i = 0; i < table1.length; i++) {
                    if (table1[i] != table2[i]) {
                        return false;
                    }
                }
                return true;
            }
        } else {
            System.out.println("Nieprawidłowe dane wejściowe.");
            return false;
        }
    }

    private static boolean validateTables(int[] table1, int[] table2) {
        if (table1 == null || table2 == null) {
            System.out.println("Przynajmniej jedna tablica jest nullem.");
            return false;
        } else if (!isInitiated(table1) || !isInitiated(table2)) {
            System.out.println("Przynajmniej jedna tablica jest pusta.");
            return false;
        } else {
            return true;
        }
    }

    private static boolean isInitiated(int[] table) {
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            sum += table[i];
        }
        return sum == 0 ? false : true;
    }
}
