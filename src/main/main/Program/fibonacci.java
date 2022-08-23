package main.Program;

public class fibonacci {
    public static void main(String[] args) {
        int first_number = 0, second_number = 1, count = 10;
        int next_number = 0;
        System.out.println("febonacci series is" + count);
        for (int i = 0; i < count; i++) {
            next_number = first_number + second_number;
            System.out.println("next number is" + next_number);
            first_number = second_number;
            second_number = next_number;
        }
    }
}


