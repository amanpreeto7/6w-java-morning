public class WrapperClass {
    public static void main(String args[]) {

        Integer a = Integer.valueOf(1); // autoboxing
        int datatypeInt = a.intValue(); // unboxing

        int i = 10;
        double dDatatype = 12.4;

        Double d = Double.valueOf(i);
        Double maxDouble = d.max(12, 45);
        Double stringDouble = Double.valueOf("123");

        System.out.println("in double wrapper " + d + "max double " + maxDouble);
    }
}
