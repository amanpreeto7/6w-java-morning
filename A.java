public class A {
    int a;
    int b;

    public A manipulateA(A a) {
        a.a = 10;
        a.b = 20;
        return a;

    }

    public static void main(String args[]) {
        if (args.length != 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("value = " + args[i]);
            }
        }
        A a = new A();
        A manipulateA = a.manipulateA(a);
        A[] aArray = new A[4];
    }

}
