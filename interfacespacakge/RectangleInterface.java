package interfacespacakge;

public class RectangleInterface implements ShapeInterface {

    @Override
    public void drawShape() {
        System.out.println("in draw shape interface method");
    }

    public static void main(String args[]) {
        RectangleInterface rectangleInterface = new RectangleInterface();
        rectangleInterface.drawShape();
        int a = RectangleInterface.shapeInterfaceVariable;
    }

    @Override
    public void getSize() {
    }

    @Override
    public int returnLength() {

        return 1;
    }

}
