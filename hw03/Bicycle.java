// Xintong Ming
// Xim217
// 02/06/2015
// hw 03-01
// bicycle.java

 import java.util.Scanner; // import Scanner
 public class Bicycle {
    			  // main method required for every Java program
   			  public static void main(String[] args) {
   			      Scanner myScanner; // declear imput
   			      myScanner = new Scanner( System.in ); // creating an instance that will take imput from STDIN
   			      
   			      System.out.print("Enter the number of counts: ");
                        double counts = myScanner.nextDouble(); // giving the number of counts on a cyclometer 
   			      System.out.print( "Enter the number of seconds ): "); // ask for imput of number of seconds
   			            double nSeconds = myScanner.nextInt(); // accept user input
   			     
                       
                        double wheelDiameter=27.0,   PI=3.14159, feetPerMile=5280,   inchesPerFoot=12,  secondsPerMinute=60, secondsPerHour=3600;
    	              double distance;
    	              double speed;
    	              distance=counts*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	                distance/=inchesPerFoot*feetPerMile; // Gives distance in miles
                    speed=secondsPerHour*distance/nSeconds;
                    System.out.println("The distance traveled is" +distance+" miles") ;

                    System.out.println("the speed is "+speed+" average miles per hour");
         		 }
         		 }//end of class