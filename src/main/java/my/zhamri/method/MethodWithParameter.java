package my.zhamri.method;

public class MethodWithParameter {

    public static void main(String[] args) {
        String myName = "zhamri";
        int myAge = 25;
        sayHello(myName);

        displayInfo(myName, myAge);

        String name1 = "Cristiano";
        String name2 = "Ronaldo";
        displayFullName(name1, name2);
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void displayFullName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}