import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double g = x/2;
        double babylonian = Double.MAX_VALUE;
        double q = g;

        while (Math.abs(babylonian) >= 0.01) {
            double y = x/g;
            g = (g + y) / 2;
            babylonian = ((g-q)/q);
            q = g;
        }
        return g;
    }   


    // Calculates the factorial of a number
    public static double factorial(int x) {
        int factorial = 1, i;
        for (i=2; i<=x; i++){
            factorial *= i;
        }
        return factorial;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static final double decimals = 1.0E-10;
    public static double calculateE() {
        long one = 1;
        double E = 2.0;
        int g = 2;
        double eone;
        do {
            one *= g++;
            eone = E;
            E += 1.0/ one;
        } while (Math.abs (E - eone) >= decimals);
        return E;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("any double here");
        Double square = scan.nextDouble();
        System.out.print("any integer here");
        int a = scan.nextInt();
        System.out.println(babylonian(square));
        System.out.println(factorial(a));
        System.out.println(calculateE());
        scan.close();
    }
}
