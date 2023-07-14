package exceptionhandling;

public class UserDefinedException extends Exception {
    UserDefinedException() {
        // super();
    }

    UserDefinedException(String message) {
        System.out.println("in exception method");
        // super(message);
    }
}
