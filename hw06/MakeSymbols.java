// Xintong Ming
// hw05
// program 3-- MakeSymbols
import java.lang.Math;
 public class MakeSymbols{
     public static void main(String[] args){
         int x=(int)((Math.random()*100)+1); // get a random number between 1 to 100
         int count= 0; // declear count to count the time of opeartion in the loop
         System.out.println("The random number between 1 to 100 generated is "+x);
         while (count<=(x-1)){
             if ((x+2)%2==0){
                 System.out.print("*");
             }
             else if ((x+1)%2==0){
                 System.out.print("&");
             }
             count++;
         }
         System.out.println("");
     }
 }