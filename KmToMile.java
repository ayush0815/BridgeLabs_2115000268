import java.util.Scanner;

class KmToMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();

        double miles = km * 0.621371;
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        sc.close();
    }
}
