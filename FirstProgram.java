import java.util.Random;
import java.util.Scanner;

import firstpackage.NewProgram;

import java.math.*;

public class FirstProgram {

    public static void main(String args[]) {

        NewProgram newProgram = new NewProgram();
        // newProgram.member = 10;
        // int a;
        // float b;
        // double c;
        // char d;
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter integer value");
        // a = scanner.nextInt();
        // System.out.println("Entered value of a = " + a);

        // System.out.println("Enter float value");
        // b = scanner.nextFloat();
        // System.out.println("Entered float value is " + b);

        // System.out.println("Enter double value ");
        // c = scanner.nextDouble();
        // System.out.println("Entered double value is " + c);

        // System.out.println("Enter char value ");
        // // d = scanner.next();

        // Shape shape = new Shape();
        // shape.protectedMember = 12;
        Random random = new Random();
        System.out.println("random number " + random.nextInt(23));
    }

}
