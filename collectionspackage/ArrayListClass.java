package collectionspackage;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String args[]) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Test");
        arrayList.add("Qwerty");
        arrayList.add(0, "New value");
        int index = arrayList.indexOf("Test");
        System.out.println("index of Test " + index);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("item at " + i + " " + arrayList.get(i));
        }
        // for each loop
        for (String s : arrayList) {
            System.out.println(s);
        }

    }
}
