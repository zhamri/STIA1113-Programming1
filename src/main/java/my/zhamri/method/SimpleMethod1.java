package my.zhamri.method;

public class SimpleMethod1 {

    public static void main(String[] args) {

        System.out.println("one");
        method_A();
        System.out.println("three");
        System.out.println("four");
        System.out.println("five");
        method_B();
        System.out.println("seven");
    }

    public static void method_A(){
        System.out.println("two");
    }

    public static void method_B(){
        System.out.println("six");
    }
}
