package main.Program;

public class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
    }
    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:"+z);
    }
}

class My_Calculation extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:" + z);
    }

    public static void main(String[] args) {
        int a = 20, b = 10;
        My_Calculation obj = new My_Calculation();
        obj.addition(a, b);
        obj.Subtraction(a, b);
        obj.multiplication(a, b);
    }
}
