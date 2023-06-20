package loopsandcondition;

public class IfStatement {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 6;
        if (a > b) // a and b - operand, < operator
        {
            System.out.println("A is less than b");
            a += 10;
            System.out.println("New Value of a " + a);
        }

        // else if
        if (a > b) {
            System.out.println("A is less than b");
            System.out.println("Second line of if ");
        } else {
            System.out.println("A is greater than B");
        }

        // else if ladder
        if (a < b && a < c) {
            System.out.println("A is less than b in else if");
        } else if (a < c) {
            System.out.println("A is less than c in else if");
        } else if (b < c) {
            System.out.println("B is less than c in else if");
        } else {
            System.out.println("in else if");
        }

        // nested if
        if (a < b) {
            if (a < c) {
                System.out.println("A is less than b and c");
            } else {
                System.out.println("A is less than b but greater or equal to c");
            }
        }

        switch (a) {
            case 1:
                System.out.println("in case 1");
            case 2:
                System.out.println("in case 2");
            case 10:
                System.out.println("in case 10");
                break;

            default:
                System.out.println("in default");
        }

    }
}
