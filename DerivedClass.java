public class DerivedClass extends BaseClass {
    DerivedClass() {
        System.out.println("In constructor of derived");
    }

    DerivedClass(int a) {
        super(a);
        System.out.print("in derived constructor with parameter");
        // super(a);
    }

    public static void main(String args[]) {
        DerivedClass derivedClass = new DerivedClass(1);
        // derivedClass.a = 10;
        // System.out.println("b = " + derivedClass.b);

        //// derivedClass.setValue(10);
        // derivedClass.showValue();
    }

}
