package task4;

class ArrayComparator {
    static boolean compare(int[] table1, int[] table2) {
        if (validateTables(table1, table2)) {
            if (!hasSameLength(table1, table2)) {
                return false;
            } else {
                return compareTableValues(table1, table2);
            }
        } else {
            return false;
        }
    }

    private static boolean validateTables(int[] table1, int[] table2) {
        if (table1 == null || table2 == null || table1.length == 0 || table2.length == 0) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean hasSameLength(int[] table1, int[] table2) {
        return (table1.length == table2.length);
    }

    private static boolean compareTableValues(int[] table1, int[] table2) {
        for (int i = 0; i < table1.length; i++) {
            if (table1[i] != table2[i]) {
                return false;
            }
        }
        return true;
    }
}