package my.zhamri.variable;

public class StaticVariable2 {

    static int a = 15;
    static int x = 100;

    public static void main(String[] args) {
        method_X();
        method_X();
        method_X();
        method_X();
        System.out.println("x = " + x);
    }

    public static void method_X(){
        x = x + a;
    }
}
