// xintong Ming
// lab08-factorials.java
// 03/20/2015
import java.util.Scanner;
public class Factorials {
     public static void main(String[] args) {
        Scanner Scan;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        while (!scan.hasNextInt()){
            System.out.println("Not an integer");
            scan.next();
        }
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += factorial(i);
        }
        System.out.println(sum);
     }
     public static int factorial(int input) {
         int mul =1;
         for (int j=1; j<=input;j++){
             mul*=j;
         }
         return mul;
     }
}