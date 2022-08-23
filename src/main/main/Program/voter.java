package main.Program;

public class voter {
    public static void main(String[] args) {
        int age = 2;
        System.out.println("enter your age");
        if (age >= 18) {
            System.out.println("eligible to vote");
        } else {
            System.out.println("not eligible to vote");
        }
    }
}