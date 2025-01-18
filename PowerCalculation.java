import java.util.Scanner;

class PowerCalculation {
    public static int calculatePower(int base, int exponent) {
        return (exponent == 0) ? 1 : base * calculatePower(base, exponent - 1); // Base case: exponent = 0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        int result = calculatePower(base, exponent);
        System.out.println("Result: " + result);
    }
}
