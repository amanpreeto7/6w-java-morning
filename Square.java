import java.util.Scanner;

public class Square extends Rectangle {
    int width;

    Square(int a) {
        super(a, a);
        System.out.println("Square constructor ");
    }

    @Override
    public void show() {
        System.out.println("in child show");
        super.show();
    }

    public void setParentWidth() {
        super.width = width;
    }

    public static void main(String args[]) {
        Square square = new Square(2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width ");
        square.width = sc.nextInt();
        square.setParentWidth();
        square.show();

    }
}
