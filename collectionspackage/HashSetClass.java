package collectionspackage;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String args[]) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Test");
        hashSet.add("Testing");
        hashSet.add("O7");
        hashSet.add("Services");
        hashSet.add("O7");
        hashSet.add("Solutions");

        for (String s : hashSet) {
            System.out.println("s = " + s);
        }

    }
}
