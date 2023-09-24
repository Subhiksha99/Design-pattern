package org.example;

public class Singleton {
    private static Singleton singletonObj=new Singleton();

    private Singleton(){}

    public static Singleton getSingletonObj(){
        return singletonObj;
    }

}

class Test{
    public static void main(String[] args) {
        Singleton s1=Singleton.getSingletonObj();
        System.out.println(s1);
        System.out.println(s1.hashCode());
        Singleton s2=Singleton.getSingletonObj();
        System.out.println(s2);
        System.out.println(s2.hashCode());
    }
}
