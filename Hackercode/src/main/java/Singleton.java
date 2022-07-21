

    public class Singleton {
    public String str;
    private static Singleton singleton = new Singleton();

    private Singleton(){};

    public static Singleton getSingleInstance()
    {
        return singleton;
    }
}
