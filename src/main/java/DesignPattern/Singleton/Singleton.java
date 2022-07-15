package DesignPattern.Singleton;

import java.io.*;

public class Singleton implements Serializable {
    private int i = 10;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private Singleton(){}
    protected Object readResolve() {
        return SingletonHelper.INSTANCE;
    }
    private static class SingletonHelper{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("test.txt"));
        out.writeObject(singleton);
        out.close();
        singleton.setI(20);

        ObjectInput in = new ObjectInputStream(new FileInputStream("test.txt"));
        Singleton ins = (Singleton) in.readObject();
        in.close();
        System.out.println(singleton.getI());
        System.out.println(ins.getI());
        in.close();
//        System.out.println(Singleton.getInstance());
    }
}
