// lab06
// Xintong Ming
// SmileGenerator.java
import java.lang.Math;
public class SmileGenerator {
    public static void main(String[] args) {
       /*  int count0=0;
         int count1=(int)((Math.random())*100); // get a random number
         int count2=0;
        while (count0 < count1){
            
	        System.out.println(":)");
	        count0++;
	        count2++;
        // if (count0%30==0){
          //      System.out.println("");
                
                while (count0%count2==0){
                    System.out.println("");
                }
            }*/
     int count1=(int)((Math.random())*100); 
      for (int i=1; i<=count1; i++){
       for (int j=0; j<=i; j++){
            System.out.print(":)");
       }
        System.out.println();
      }
            
            
    }
}