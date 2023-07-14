package exceptionhandling;

public class ImplementThrows {

    public void throwMethod() throws UserDefinedException {
        throw new UserDefinedException();
    }

    public static void main(String arfs[]) {
        ImplementThrows implementThrows = new ImplementThrows();
        try {
            implementThrows.throwMethod();
        } catch (UserDefinedException e) {
            e.printStackTrace();
        }

    }

}
