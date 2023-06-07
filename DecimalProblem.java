import java.util.Scanner;

public class DecimalProblem {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the float value ");
        float a = scanner.nextFloat();
        int b = (int) a;
        System.out.println("Integer value " + b);
        float c = a - b;
        System.out.println("decimal number " + c);
    }
}
