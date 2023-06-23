package collectionspackage;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeCollection {
    String firstName, lastName;

    public static void main(String args[]) {
        ArrayList<EmployeeCollection> empList = new ArrayList<>();
        EmployeeCollection employeeCollection = new EmployeeCollection();
        empList.add(employeeCollection);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Return value " + empList.get(0).firstName);
        for (int i = 0; i < 2; i++) {
            empList.add(new EmployeeCollection());
            System.out.println("Enter the first name");
            empList.get(i).firstName = scanner.next();
            System.out.println("Enter the last name");
            empList.get(i).lastName = scanner.next();
        }

        for (EmployeeCollection eArray : empList) {
            System.out.println("name " + eArray.firstName + " " + eArray.lastName);
        }
    }
}
