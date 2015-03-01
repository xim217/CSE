// Xintong Ming
// hw05
// program 2-- factorial
import java.util.Scanner;
 public class RunFactorial{
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer that is between 9 and 16 ");
        int factorial= 1; // declear factorial for later use
        if (scan.hasNextInt()){
            int x=scan.nextInt();
            if (x>=9&&x<=16){
                for (int i=0; i<x;){
                    i++;// count until i=x;
                    factorial=factorial*i;// 5!=4!*5; 4!=3!*4
                }
                System.out.println("input accepted");
                System.out.println(x+"! ="+ factorial);// print out
            }
            else {
                System.out.println("invalid input");
            }
        }
     }
 }