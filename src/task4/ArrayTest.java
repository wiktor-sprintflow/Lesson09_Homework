package task4;

public class ArrayTest {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4, 5};
        int[] tab2 = {1, 2, 3, 4, 5};
        int[] tab3 = new int[5];
        int[] tab4 = null;
        int[] tab5 = {1, 2, 3, 4, 5, 6};
        int[] tab6 = {1, 2, 5, 5, 5};

        System.out.println("Tabele tab1 i tab2 są identyczne: " + ArrayComparator.compare(tab1, tab2));
        System.out.println();
        System.out.println("Tabele tab1 i tab3 są identyczne: " + ArrayComparator.compare(tab1, tab3));
        System.out.println();
        System.out.println("Tabele tab1 i tab4 są identyczne: " + ArrayComparator.compare(tab1, tab4));
        System.out.println();
        System.out.println("Tabele tab1 i tab5 są identyczne: " + ArrayComparator.compare(tab1, tab5));
        System.out.println();
        System.out.println("Tabele tab1 i tab6 są identyczne: " + ArrayComparator.compare(tab1, tab6));
    }
}
