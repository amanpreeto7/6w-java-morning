package abstraction;

public class Rectangle extends Shape {
    @Override
    void DrawShape() {
        System.out.println("Drawing rectangle shape");
    }

    Rectangle() {
        super();
    }

    void getLength() {
        super.getLength();
    }

    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle();
        rectangle.DrawShape();
        rectangle.getLength();
        rectangle.shapeVariable = 10;
        rectangle.setPrivateShapeVariable(10);
    }
}
