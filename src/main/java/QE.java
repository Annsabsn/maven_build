import java.util.Scanner;

class QE {
    public static void main(String[] args) {
        double root1, root2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.println("Enter the value of c: ");
        double c = input.nextDouble();

        double det = b * b - 4 * a * c;

        if (det > 0) {
            root1 = (-b + Math.sqrt(det)) / (2 * a); // fix: Root1 → root1
            root2 = (-b - Math.sqrt(det)) / (2 * a); // fix: Root2 → root2
            System.out.println("Roots are real and Distinct");
            System.out.format("Root1 = %.2f and Root2 = %.2f", root1, root2);
        } else if (det == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println("Roots are real and Equal");
            System.out.format("Root1 = Root2 = %.2f", root1);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-det) / (2 * a);
            System.out.println("Roots are Complex"); // fix: wrong message
            System.out.format("Root1 = %.2f+%.2fi%n", real, imaginary); // fix: println → format
            System.out.format("Root2 = %.2f-%.2fi%n", real, imaginary); // fix: println → format
        }
    }
}