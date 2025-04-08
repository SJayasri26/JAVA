public class perfectnum {
    public static void main(String[] args) {
        int n=72,sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum +=i;
            }
        }
        System.out.println(n==sum);
        System.out.println(" " +sum);
    }
}