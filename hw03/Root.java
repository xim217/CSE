// Xintong Ming
// Xintong Ming
// Xim217
// 02/06/2015
// hw 03-02
// Root.java

 import java.util.Scanner; // import Scanner
 public class Root {
    			  // main method required for every Java program
   			  public static void main(String[] args) {
   			      Scanner myScanner; // declear imput
   			      myScanner = new Scanner( System.in ); // creating an instance that will take imput from STDIN
   			      
   			      System.out.print("Enter a double (anuny mber): ");
                        double x = myScanner.nextDouble(); // accept user input
   			     double guess = x/3;
   			     double guess1, guess2, guess3,guess4,guess5,cube;// define all veriable
   			     guess1 = (2*guess*guess*guess+x)/(3*guess*guess);
   			     guess2 = (2*guess1*guess1*guess1+x)/(3*guess1*guess1);
   			     guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
   			     guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
   			     guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);// improve the estimation for four times
   			     cube = guess5*guess5*guess5;
   			     System.out.print(" Coub root is " +guess4+" and the value of this crude guess when cubed is "+cube+" ");
   			  }
 }