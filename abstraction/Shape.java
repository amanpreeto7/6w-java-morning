package abstraction;

abstract class Shape {
    int shapeVariable = 0;
    private int privateShapeVariable = 10;

    public int getPrivateShapeVariable() {
        return privateShapeVariable;
    }

    public void setPrivateShapeVariable(int privateShapeVariable) {
        this.privateShapeVariable = privateShapeVariable;
    }

    Shape() {
        System.out.println("in shape constructor");
    }

    abstract void DrawShape();

    void getLength() {
        System.out.println("in get length");
    }

    final void FinalMethod() {
        System.out.println("in final method");
    }
}
