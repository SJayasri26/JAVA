public class findsmalllargest {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=-2;
        int smallest=Math.min(a,Math.min(b,c));
        int largest=Math.max(a,Math.max(b,c));
        System.out.println("the smallest elemrnt is : "+smallest);
        System.out.println("the largest elemrnt is : "+largest);
    }
}
