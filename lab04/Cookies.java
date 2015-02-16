// Xintong Ming
// CSE002
// lab04--Cookies.java

import java.util.Scanner;
public class Cookies {
     public static void main(String[] args) {
   	    Scanner myScanner; // declear imput
        myScanner = new Scanner( System.in );
        System.out.print("Enter the number of people: ");
        if(myScanner.hasNextInt()) {
            
            int people =  myScanner.nextInt(); // accept user input
            if(people>0){
            System.out.print("Enter the number of cookies: ");
            if(myScanner.hasNextInt()){ 
                int cookiesh =  myScanner.nextInt();// accept user input (cookies have)   
                if(cookiesh>0){
                    System.out.print("How many do you want each to get? : ");
                    int cpp = myScanner.nextInt();
                    if(cpp>0){
                        int cookiesn = cpp* people;
                        int difference = cookiesn-cookiesh;
                        if(cookiesh>=cookiesn){
                            int factor = cookiesh%people;
                            if(factor==0){
                                System.out.println("You have enough cookies, and you are able to divide evenly");
                            }
                            else{
                                System.out.println("You have enough, but won't be able to divide evenly");
                            }
                        }
                        else{
                            System.out.println("You don't have enough cookies, you need "+difference+" more cookies");
                        }
                    }
                    else{
                        System.out.println("You entered a negative #");
                    }
                }
                else{
                    System.out.println("You entered a negative #");
                }
            }
            else{
                System.out.print("You enetered a negative #");
            }
            }
            else{
                System.out.println("You did not enter an int");
                return;    //leaves the program, i.e.
                                //the program terminates
                }
            }
         else{
              System.out.println("You did not enter an int");
              return;    //leaves the program, i.e.
                         //the program terminates
                }
        
    }
}