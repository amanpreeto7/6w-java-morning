package exceptionhandling;

public class PredefinedExceptions {
    public static void main(String args[]) {
        int a = 10;
        try {
            System.out.println("Divide by 0 " + a / 0);
            int[] b = new int[4];
            b[5] = 10;
        } catch (ArithmeticException ex) {
            System.out.println("in exception " + ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("In array exception");
        } finally {
            System.out.println("in finally block");
        }
        System.out.println("After exception");

    }
}
