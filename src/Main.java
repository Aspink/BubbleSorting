public class Main {
    public static void main(String[] args) {
        int[] unsortedNumbers = new int[]{1, 2, 5, 3, 1, 7, 9, 1, 12, 83, 1, 5, 3, 2};
        printTable(unsortedNumbers);

    }
    public static void printTable(int[] table) {
        System.out.print("{");
        for(int number : table) {
            System.out.print(number + ", ");
        }
        System.out.println("\b}");
    }
}