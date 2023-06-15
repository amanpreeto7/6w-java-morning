public class FunctionOverloading {
    final float pi = 3.14f;

    // area is function name
    // square - one
    // rectangle - two
    // circle - one variable float
    public void area(int a) {
        System.out.println("Area of square " + (a * a));
    }

    public void area(int a, int b) {
        System.out.println("Area of rectangle " + (a * b));
    }

    public void area(float r) {
        System.out.println("Area of circle " + ((2 * r) * pi));
    }

    public static void main(String args[]) {
        FunctionOverloading functionOverloading = new FunctionOverloading();
        functionOverloading.area(2);
        functionOverloading.area(12, 23);
        functionOverloading.area(2f);
        ConstructorAssignment constructorAssignment = new ConstructorAssignment();
        Constructors constructor = new Constructors();
    }
}
