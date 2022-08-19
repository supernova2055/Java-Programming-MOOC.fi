
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Give a year:");
//        
//        int year = Integer.valueOf(scan.nextLine());
//        
//        if(year % 4 == 0 ){
//            System.out.println("The year is a leap year.");
//        }else if(year % 400 == 0){
//            System.out.println("The year is a leap year.");}
//        else if(year % 100 == 0){
//            System.out.println("The year is not a leap year.");
//                       
//        }else{
//            System.out.println("The year is not a leap year.");
//        
//        }



        // my own solution borrowed from here: 
        // https://www.alphabetacoder.com/2021/12/flowchart-to-check-if-a-year-is-a-leap-year-or-not.html
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());

        if (year % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
        
        
        
        // model solution from TMC
        
//        System.out.print("Give a year: ");
//        int year1 = Integer.valueOf(scan.nextLine());
//        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
//            System.out.println("The year is a leap year.");
//        } else {
//            System.out.println("The year is not a leap year.");
//        }
        
        
        
        
        
        
        
        
        
        
        // Solution that worked with Sauravs help

//        System.out.println("Give a year:");
//
//        int year = Integer.valueOf(scan.nextLine());
//
//        if (year % 4 != 0) {
//            System.out.println("The year is not a leap year.");
//        } else if (year % 400 == 0) {
//            System.out.println("The year is a leap year.");
//        } else if (year % 100 == 0) {
//            System.out.println("The year is not a leap year.");
//
//        } else {
//            System.out.println("The year is a leap year.");
//
//        }
        // Solution I was working on in the beginning
//        System.out.print("Give a Year: ");
//        
//        int year = Integer.valueOf(scan.nextLine());
//        
//        if (( year % 100 == 0  && year % 400 == 0)) {
//            System.out.println("The year is a leap year.");
//        }else if (year % 4 == 0) {
//            System.out.println("The year is a leap year.");
//        }else{
//            System.out.println("The year is not a leap year.");
//        }
    }
}
