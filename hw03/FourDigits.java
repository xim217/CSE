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
                        double x1,x2,x3;// define three veriables for later use
                        x1 = ((int) x)*10000; // delete all the decimal points
                        x2 = (int)(x *10000); // only have the four digits right to the decimal point
                        x3 = x2-x1; // get the four digits
                        int x4;
                        x4 = (int)x3;// made the answer an integer
                System.out.println("the four digits to the right of the decimal point is " +x4);
   			  }
 }