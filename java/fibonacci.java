public class fibonacci {
    public static int fibonaci(int n){
        if(n<=1){
            return n;
        }
        return fibonaci(n-1)+fibonaci(n-2);
    }
    public static void main(String[] args) {
        int num=10;
        int sum=0;
        System.out.println("finb"+num+ ":");
        for(int i=0;i<num;i++){
            System.out.println(fibonaci(i)+" ");
            sum +=i;
        }
        System.out.println("the sum "+sum);
    }
}
