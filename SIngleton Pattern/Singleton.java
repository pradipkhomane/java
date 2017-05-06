class Singleton {

    // static object to access in static  method
    private static Singleton object = null;

    // Private constructor exist only for defeating instantiation
    private Singleton() {

    }

    public static Singleton getSingleInstance() {

        if (object == null)
            object = new Singleton();

        return object;

    }
}
