package my.zhamri.printf;

public class Example_printf {

    public static void main(String[] args) {

        System.out.println("abcdefghijklmnopqrstuvwxyz");

        String myFormat = "%-7s%-13s%6.2f\n";

        String x1 = "Item1", x2 = "Item2", x3 = "Item3";
        String desc1 = "Milo", desc2 = "Kopi 3 in 1", desc3 = "Teh";
        double price1 = 30.99, price2 = 50.75, price3 = 112.20;

        System.out.printf(myFormat, x1, desc1, price1);
        System.out.printf(myFormat, x2, desc2, price2);
        System.out.printf(myFormat, x3, desc3, price3);
    }
}

//Contoh output:
//
//abcdefghijklmnopqrstuvwxyz
//Item1  Milo          30.99
//Item2  Kopi 3 in 1   50.75
//Item3  Teh          112.20