package testpackage;

import loopsandcondition.Loops;

class test {
    public static void main(String args[]) {
        System.out.println("in test class");
        Loops loops = new Loops();
        loops.printEvenNumbers();
        loops.a = 10;
        loops.setB(10);
        System.out.println("get b " + loops.getC());
    }
}