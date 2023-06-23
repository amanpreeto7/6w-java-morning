package SingletonPattern;

public class Singletonclass {
    private static Singletonclass singletonclass = null;

    private Singletonclass() {
    }

    public static Singletonclass getInstance() {
        if (singletonclass == null) {
            singletonclass = new Singletonclass();
        }
        return singletonclass;
    }
}
