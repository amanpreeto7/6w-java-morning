public class Constructors {
    int a;
    int b;

    Constructors() {
        System.out.println("in default Constructor");
    }

    Constructors(int aValue) {
        // instance = local
        a = aValue;
        System.out.println("in parameterised constructor " + a);
    }

    Constructors(float b) {
        a = (int) b;
    }

    Constructors(int a, int b) {
        // c++ syntax
        // this->a = a;
        this.a = a;
    }

    public static void main(String args[]) {
        Constructors constructors = new Constructors();
        Constructors constructors2 = new Constructors(23);
        Constructors constructors3 = new Constructors(23.0f);
        // constructors2.aValue;

    }
}
