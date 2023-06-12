import java.util.Scanner;

class Array {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array");
        size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value at " + (i + 1) + " position");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Value stored at " + (i + 1) + " = " + array[i]);
        }
    }
}