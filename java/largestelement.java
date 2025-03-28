public class largestelement {
    public static int findlargest(int [] arr){
        int largest =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }return largest;
    }
    public static void main(String[] args) {
        int[] arr={34,32,56,37};
        System.out.println("The largest element :"+findlargest(arr));
    }
}
