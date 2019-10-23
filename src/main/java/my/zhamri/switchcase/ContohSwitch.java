package my.zhamri.switchcase;

public class ContohSwitch {

    public static void main(String[] args) {

        int x = 3;
        switch (x) {
            case 1:
                System.out.println("x adalah 1");
                break;

            case 3:
                System.out.println("x adalah 3");
                break;

            case 5:
                System.out.println("x adalah 5");
                break;

            default:
                System.out.println("x bukan no. ganjil dari 1 hingga 5");

        }
    }
}
