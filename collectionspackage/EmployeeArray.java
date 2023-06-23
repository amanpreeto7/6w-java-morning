package collectionspackage;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArray {
    String firstName, lastName;
    double salary, bonus;

    EmployeeArray(String firstName) {
        this.firstName = firstName;
    }

    EmployeeArray() {

    }

    public static void main(String args[]) {

        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        Scanner sc = new Scanner(System.in);
        // EmployeeArray[] employeeArrays = new EmployeeArray[5];

        // for (int i = 0; i < 5; i++) {
        // employeeArrays[i] = new EmployeeArray();
        // System.out.println("Enter the name of employee ");
        // employeeArrays[i].firstName = sc.nextLine();

        // System.out.println("Enter the last name of employee ");
        // employeeArrays[i].lastName = sc.next();
        // }

        // for (EmployeeArray employeeArray : employeeArrays) {

        // }

        ArrayList<EmployeeArray> employeeArrayList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            EmployeeArray employeeArray = new EmployeeArray();
            System.out.println("Enter the name of employee ");
            employeeArray.firstName = sc.nextLine();
            System.out.println("Enter the last name of employee ");
            employeeArray.lastName = sc.nextLine();
            employeeArrayList.add(employeeArray);
        }
        for (EmployeeArray employeeArray : employeeArrayList) {
            System.out.println("Employee full name " + employeeArray.firstName + employeeArray.lastName);
        }

        EmployeeArray setObject = new EmployeeArray();
        setObject.firstName = "Arshvir";
        // employeeArrayList.set(0,new EmployeeArray());
        employeeArrayList.set(0, setObject);
        employeeArrayList.set(0, new EmployeeArray("Arshvir"));
    }
}
