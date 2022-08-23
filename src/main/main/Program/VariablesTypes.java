package main.Program;

public class VariablesTypes {
    // Local Variables
    // Declared within the method or a block
    // It is mandatory to initialize
    // Can be accessed only within the method or block where it is declared.

    static {
        System.out.println("static block");
        m1();
    }

    static void m1(){
        System.out.println("m1()");
        int x = 30;
        System.out.println(x);
//        System.out.println(i);
    }

    static int sum(int a, int b){
        System.out.println("sum()");
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        // A variable is a container where we can store the data.
        System.out.println("main()");
        int i = 10;
        System.out.println(i);
        //    System.out.println(x);
        m1();
        int addition = sum(4,7);
        System.out.println(addition);

    }

}


