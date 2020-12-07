package my.zhamri.userInput;

import java.util.Scanner;

/*
This example shows how to input a string and numbers from the keyboard.
 */
public class MyUserInput {

    public static void main(String[] args) {

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Input a string. For example your name.
        System.out.print("Please input your name: ");
        String name = input.nextLine();

        // Input a number. For example your age.
        System.out.print("Please input your age: ");
        int age = input.nextInt();

        // Input a decimal number. For example your salary.
        System.out.print("Please input your salary: ");
        double salary = input.nextDouble();

        // Display all your inputs.
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }
}
