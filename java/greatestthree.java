public class greatestthree {
    public static void main(String[] args) {
        int n1 =78;
        int n2 =23;
        int n3=58;
        int greatest;
        if(n1>=n2 && n1>n3){
            greatest=n1;
        }else if(n1>=n2 && n2<=n3){
            greatest=n2;
        }else{
            greatest=n3;
        }
        System.out.println("the greatest number is : "+greatest);
    }
}
