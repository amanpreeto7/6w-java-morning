package firstpackage;

public class PackageProgram {
    protected int protectedMember = 10;

    public static void main(String args[]) {
        System.out.println("in package main");
        NewProgram newProgram = new NewProgram();
        newProgram.member = 10;

    }

}
