import java.util.Scanner;

public class primeornot {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }
}
