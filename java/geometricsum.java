import java.util.Scanner;

public class geometricsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the first term, common ratio, and number of terms
        System.out.print("Enter the first term (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter the common ratio (r): ");
        double r = sc.nextDouble();
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        double sum;
        if (r != 1) {
            // Formula for sum when the common ratio is not 1
            sum = a * (1 - Math.pow(r, n)) / (1 - r);
        } else {
            // Formula for sum when the common ratio is 1
            sum = n * a;
        }

        System.out.println("The sum of the GP is: " + sum);
    }
}