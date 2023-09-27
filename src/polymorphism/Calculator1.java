package polymorphism;
//method overloading program
class Calculator {
    //  add two integers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    //  add three integers (method overloading)
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    //  add two doubles (method overloading)
    public double add(double num1, double num2) {
        return num1 + num2;
    }
}

public class Calculator1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //   overloaded methods
        int sum1 = calculator.add(5, 10);
        int sum2 = calculator.add(15, 20, 25);
        double sum3 = calculator.add(2.5, 3.5);

        //  results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two doubles: " + sum3);
    }



	}


