public class missingnumber {
    public static void main(String[] args) {
    int [] arr={1,2,3,5};
    int n=5;
    System.out.println("Missing Number :" +findnum(arr,n));
    }
    public static int findnum(int[]arr,int n){
        int expectedsum=n*(n+1)/2;
        int actualsum=0;
        for(int num:arr){
            actualsum+=num;
        }
        return expectedsum-actualsum;
    }
}
