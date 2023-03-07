public class Main {
    public static void main(String[] args) {
        int[] unsortedNumbers = new int[]{2,1};
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