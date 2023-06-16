public class BaseClass {
    private int a;
    final int b = 10;;

    // public int BaseClass(){

    // }

    BaseClass() {
        System.out.println("in Base class constructor");
    }

    BaseClass(int a) {
        this.a = a;
        System.out.println("in base class with parameter");
    }

    public void setValue(int a) {
        this.a = a;
    }

    public void showValue() {
        System.out.println("Value of a = " + a);
    }

    public static void main(String args[]) {
        BaseClass baseClass = new BaseClass();
        baseClass.a = 10;
        System.out.println("in base class variable " + baseClass.a);
    }
}
