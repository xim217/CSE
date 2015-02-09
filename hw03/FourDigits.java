// Xintong Ming
// Xintong Ming
// Xim217
// 02/06/2015
// hw 03-03
// FourDigits.java

 import java.util.Scanner; // import Scanner
 public class FourDigits {
    			  // main method required for every Java program
   			  public static void main(String[] args) {
   			      Scanner myScanner; // declear imput
   			      myScanner = new Scanner( System.in ); // creating an instance that will take imput from STDIN
   			      
   			      System.out.print("Enter a double: ");
                        double x = myScanner.nextDouble(); // accept user input
                        int d1,d2,d3,d4;// define four digits
                      
                        
                        d1=(int)(x*10)%10;
                        d2=(int)(x*100)%10;
                        d3=(int)(x*1000)%10;
                        d4=(int)(x*10000)%10;
                        
                System.out.println("the four digits to the right of the decimal point is " +d1+d2+d3+d4);
   			  }
 }