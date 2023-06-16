public class Rectangle extends Shape {
    public int height, width;

    Rectangle(int a, int b) {
        this.height = a;
        this.width = b;
    }

    public void show() {
        System.out.println("in show rectangle " + height * width);
    }
}
