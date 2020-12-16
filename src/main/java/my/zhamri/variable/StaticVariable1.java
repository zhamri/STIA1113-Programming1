package my.zhamri.variable;

public class StaticVariable1 {

    static int a = 10;
    static int x = 15;

    public static void main(String[] args) {
        method_A();
        method_X();
    }

    public static void method_A(){
        System.out.println("a = " + a);
        int b = a + x;
        System.out.println("b = " + b);
    }

    public static void method_X(){
        System.out.println("x = " + x);
        int y = x + a;
        System.out.println("y = " + y);
    }
}
