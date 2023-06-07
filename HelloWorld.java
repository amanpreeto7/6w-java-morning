import java.util.Scanner; // package

class HelloWorld {
    public static void main(String args[]) {
        System.out.print("in main method changed");
        float a = 20.46f;
        int b = (int) a;

        double c = a + b;
        int e = (int) a + b;
        int d = (int) (b + a);
        System.out.println("Value of b = " + b); // concatination

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer value ");
        int f; // declare
        f = scanner.nextInt(); // initialization
        float g = scanner.nextFloat();
        double h = scanner.nextDouble();
        System.out.println("Entered value is " + f);
        // this is comment
    }
}