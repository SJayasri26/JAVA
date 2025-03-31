public class primesum {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int s =50;
        int e= 60;
        int sum=0;
        System.out.println(s+ " prime numbers between "+e +" :");
        for(int i=s;i<=e;i++){
            if(isPrime(i)){
                System.out.println(i);
                sum +=i;
            }
        }
        System.out.println("sum of prime numbers " +s+ "and "+e+ " is " +sum);
    }
}
