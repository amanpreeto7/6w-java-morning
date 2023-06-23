package SingletonPattern;

public class CallingSingletonClass {
    static Singletonclass singletonclass;
    static Singletonclass singletonclass2;

    public static void main(String args[]) {
        // Singletonclass singletonclass = new Singletonclass();
        singletonclass = Singletonclass.getInstance();
        singletonclass2 = Singletonclass.getInstance();
        System.out.println("in instance " + singletonclass.hashCode());
        System.out.println("in instance 2nd " + singletonclass2.hashCode());

        CallingSingletonClass callingSingletonClass = new CallingSingletonClass();
        System.out.println("calling class hashcode " + callingSingletonClass.hashCode());

        CallingSingletonClass callingSingletonClass2 = new CallingSingletonClass();
        System.out.println("calling class2 hashcode " + callingSingletonClass2.hashCode());

    }
}
