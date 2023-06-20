package loopsandcondition;

public class Loops {
    public int a;
    private int b;
    protected int c;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void printEvenNumbers() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number is " + i);
            }
        }
    }

    public static void main(String args[]) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
