import java.util.Scanner;

public class season {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the month : ");
        int month=sc.nextInt();
        String season;
        if(month ==12 || month==1||month==2){
            season="winter";
        }else if(month>=3 && month<=5){
            season="Spring";
        }else if(month>=6 && month<=8){
            season="Summer";
        }else if(month>=9 && month<=11){
            season="Autum";
        }else{
            season="invaild";
        }
        System.out.println("The season is : "+season);
    }
}
