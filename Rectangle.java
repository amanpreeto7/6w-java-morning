public class Rectangle extends Shape {
    public int height, width;

    Rectangle(int a, int b) {
        this.height = a;
        this.width = b;
    }

    public void show() {
        System.out.println("in show rectangle " + height * width);
    }

    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle(1, 2);
        rectangle.publicMember = 23;
        rectangle.setPrivateMember(34);
        rectangle.protectedMember = 345;
    }
}
