package different;

class Singleton {

    private static Singleton obj;

    public Singleton() {}

    public static Singleton getInstance(){
        if(obj == null)
            obj = new Singleton();
        return obj;
    }
}
