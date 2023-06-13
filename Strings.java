public class Strings {
    public static void main(String args[]) {
        String first = "O7";
        String second = "Services";
        String newString = new String("QWERTY");
        char[] charArray = { 'a', 's', 'd', 'f' };
        String third = first.concat(second);
        System.out.println(first.concat(second));

        String toUpper = first.toUpperCase();
        System.out.println(toUpper);

        String toLowerCase = first.toLowerCase();
        System.out.println(toLowerCase);

        char character = first.charAt(1);
        System.out.println(character);

        // StringBuffer and StrignBuilder
        StringBuffer sb = new StringBuffer();
        sb.append("O7");
        System.out.println(sb.toString());
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer("O7 Services");
        System.out.println(sb1.toString());
        System.out.println(sb1.capacity());

        StringBuffer sb2 = new StringBuffer(10);
        System.out.println(sb2.toString());
        System.out.println(sb2.capacity());

    }
}
