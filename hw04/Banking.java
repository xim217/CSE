// Xintong Ming
// CSE002
// hw04--2
// Banking.java

import java.util.Scanner;
import java.lang.Math;
    public class Banking {
     public static void main(String[] args) {
         int money=(int)((Math.random()*4000)+1000); // get a random number between 1000 to 5000
         System.out.println("You have "+money+" dollars in your account" ); // print out the money in the account
         Scanner scanner;
         scanner = new Scanner( System.in );
         System.out.println("Do you want 1 Viewing balance; 2 Withdraw; 3 Deposit;");
         System.out.println("Choose from those three options: 1; 2; 3");
         int options = scanner.nextInt();// accept input
         switch (options){ // switch statement
             case 1: // case one viewing balance
             System.out.println("you have "+money+" dollars in your account");
             break;
             case 2: // Withdraw
             System.out.print("How much do you want to withdraw ?");
             int withdraw = scanner.nextInt();
             if (withdraw>0){
                 System.out.println("you have "+(money-withdraw)+" dollars left in your account. ");
             }
             else {
                 System.out.print("you entered an invalid number");
             }
             break;
             case 3:// deposite
             System.out.print("How much do you want to deposit ?");
             int deposit=scanner.nextInt();
             if (deposit>0){
                 System.out.println("you have " +(money+deposit)+" dollars left in your account");
             }
             else{
                 System.out.print("you entered an invalid number");
             }
             break;
         }
     }    
}     