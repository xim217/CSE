// Xintong Mng
// lab07 zigzag.java
// 03/06/2015
import java.util.Scanner;
public class zigzag{
    public static void main(String[] args){
        Scanner scan;
        scan=new Scanner(System.in);
        System.out.println("Enter an integer between 3 to 33");
  //      String a =scan.next();
        while (!scan.hasNextInt()){
            System.out.println("Not an integer");
            scan.next();
            
        }
        
        int nStars= scan.nextInt();
        if (nStars<=33&&nStars>=3){
        for (int i=0;i<nStars;i++) {    
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        }
        else {
            System.out.print("Not in the range");
        }
    }
}