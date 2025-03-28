public class smallestelement {
    public static int smallest (int[]arr){
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }return smallest;
    }
    public static void main(String[] args) {
        int [] arr={34,66,77,88};
        System.out.println("The smallest element is :"+smallest(arr));
    }
}
