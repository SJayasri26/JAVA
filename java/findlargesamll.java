public class findlargesamll {
    // find the largest and smallest number
    public static void main(String[] args) {
        int[] num={2,4,6,8};
        int smallest=num[0];
        int largest=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]<smallest){
                smallest=num[i];
            }
            if(num[i]>largest){
                largest=num[i];
            }
        }
        System.out.println(" the smallest element : "+smallest);
        System.out.println(" the largest elemrnt : " +largest);
    }
}
