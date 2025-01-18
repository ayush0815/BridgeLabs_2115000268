import java.util.Scanner;

class VolOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder in cm: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder in cm: ");
        double height = sc.nextDouble();

        double volume = Math.PI * radius * radius * height;
        System.out.println("The volume of the cylinder in cm^2 is: " + volume);
    }
}
