package creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton sing1 = new Singleton();
        sing1 = Singleton.uniqueInstance;
        Singleton sing2 = new Singleton();
        Singleton sing = Singleton.getInstance();
        sing.getDescription();

        System.out.println(sing.getClass());
        System.out.println(sing1 == sing2);
        System.out.println(sing1 == sing);
    }
}
