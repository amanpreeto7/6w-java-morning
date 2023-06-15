public class ConstructorAssignment {
    private String name;

    ConstructorAssignment() {
        name = "Unknown";
        System.out.println("In default Constructor of Constructor Assignment");
    }

    ConstructorAssignment(String name) {
        this.name = name;
    }

    public static void main(String args[]) {
        ConstructorAssignment constructorAssignment = new ConstructorAssignment();
        ConstructorAssignment constructorAssignment2 = new ConstructorAssignment("Aman");

        System.out.println("Name in first " + constructorAssignment.name);
        System.out.println("Name in second " + constructorAssignment2.name);
    }
}
