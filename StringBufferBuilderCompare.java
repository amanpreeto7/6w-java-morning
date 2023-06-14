public class StringBufferBuilderCompare {
    public static void main(String args[]) {
        // String, StringBuffer, StringBuilder
        String a = "Test";
        String b = new String("qwerty");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("b");

        StringBuffer sb2 = new StringBuffer(12);

        StringBuffer stringBuffer = new StringBuffer("Testing");
        System.out.println(stringBuffer.toString().toUpperCase());
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            stringBuffer.append("Test");
        }
        System.out.println("String buffer time " + (System.currentTimeMillis() - startTime));

        StringBuilder stringBuilder = new StringBuilder("Testing");
        long builderStartTime = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            stringBuilder.append("Test");
        }
        System.out.println("String builder time " + (System.currentTimeMillis() - builderStartTime));

    }
}
