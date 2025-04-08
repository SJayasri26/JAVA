import java.util.Scanner;

public class seasonfind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month : ");
        String month=sc.nextLine();
        String season;
        switch (month) {
            case "dec":
            case "jan":
            case "feb":
             season="Winter";  
                break;
            case "mar":
            case "Apr":
            case "may":
             season="Spring";
                break;
            case "jun":
            case "jul":
            case "aug":
             season="Summer";
              break;
            case "sep":
            case "oct":
            case "nov":
             season="Fall";
              break;
            default:
             season="invaild";
                      
        }
        System.out.println("the season is : "+season);
    }
}
