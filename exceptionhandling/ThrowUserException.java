package exceptionhandling;

public class ThrowUserException {
    public static void main(String args[]) {
        try {
            throw new UserDefinedException("Testing");
        } catch (UserDefinedException userDefinedException) {
            System.out.println("in exception " + userDefinedException.getMessage());
        }
    }
}
