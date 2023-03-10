import java.util.ArrayList;
import java.util.List;

public class SorterTester {
    private static final List<int[]> testSets = new ArrayList<>();

    public static void main(String[] args) {
        testSets.add(new int[]{});
        testSets.add(new int[]{1,2,5,3,1,7,9,1,12,83,1,5,3,2});
        testSets.add(new int[]{1,1,1,1,1,1,1,2,1,1,1});
        testSets.add(new int[]{2,2,2,2});
        testSets.add(new int[]{1,2});
        testSets.add(new int[]{2,1});

        for(int i = 0; i < testSets.size(); i++) {
            testSorter(testSets.get(i));
        }
        printTable(unsortedNumbers);
        printTable(Sorter.bubbleSorting(unsortedNumbers));

    }
    public static void printTable(int[] table) {
        System.out.print("{");
        for(int number : table) {
            System.out.print(number + ", ");
        }
        if(table.length < 1) {
            System.out.print("  ");
        }
        System.out.println("\b\b}");
    }
}