package main.Program;

public class Palindrome {
    public static void main(String[] args) {
        int num = 433, r, temp, sum = 0;
        temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum)
            System.out.println("It is an palindrome number");
        else
            System.out.println("It is not an palindrome number");
    }
}
