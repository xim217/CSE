// Xintong Ming
// hw05
// program 1-- integers
import java.util.Scanner;
 public class GetIntegers{
     public static void main(String[] args){
        Scanner scann = new Scanner(System.in);
        System.out.println("Please enter five none negative integers : ");
        int i= 0; // using i as count. want 5 integers
        for (scann.hasNextInt(); i<6; i++){
            int a = scann.nextInt();// accept input
             if (a>=0){
              int b = scann.nextInt();// accept input
               if (b>=0){
                int c = scann.nextInt();// accept input
                 if (c>=0){
                  int d = scann.nextInt();// accept input
                   if (d>=0){
                    int e = scann.nextInt();// accept input
                     if (e>=0){
                        int sum= a+b+c+d+e;
                        System.out.println("The sum is " +sum);
                     }
                     else {System.out.println("Please enter positive number, star over again");
                     }
                   }
                   else {System.out.println("Please enter positive number, star over again");
                     }
                 }
                 else {System.out.println("Please enter positive number, star over again");
                     }
               }
               else {System.out.println("Please enter positive number, star over again");
                     }
             }
            else {
                System.out.println("Please enter positive number, star over again");
            }
        }
        String a=scann.next();
        System.out.println("Invalid input");
     }
 }