public class numberpattern {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Print the number on the same line
                System.out.print(num + " ");
                num++;
            }
            // Move to the next line after printing all numbers in the row
            System.out.println();
        }
    }
}