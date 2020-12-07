package my.zhamri.method;

public class SimpleMethod2 {

    public static void main(String[] args) {
        method_A();
        method_A();
        method_A();
    }

    public static void method_A(){
        System.out.println("one");
        System.out.println("two");
        System.out.println("three");
        sayHello();
    }

    public static void sayHello(){
        System.out.println("Hello World");
    }
}
