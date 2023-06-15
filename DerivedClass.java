public class DerivedClass extends BaseClass {

    public static void main(String args[]) {
        DerivedClass derivedClass = new DerivedClass();
        // derivedClass.a = 10;
        System.out.println("b = " + derivedClass.b);

        derivedClass.setValue(10);
        derivedClass.showValue();
    }

}
