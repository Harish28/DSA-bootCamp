package DesignPattern;

public class Singleton {
    private Singleton(){}
    private static class SingletonHelper{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
    }
}
