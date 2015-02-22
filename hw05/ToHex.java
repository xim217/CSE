import java.util.Scanner;
 public class ToHex {
     public static void main (String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Please enter three numbers representing RGB values : ");
        int R = 0;// accept first input as R
        int G = 0;// accept second input as G
        int B = 0;// accept third input as B
       
        String hex="";
       //check all R G B are between 255 and 0 
       if (scan.hasNextInt()){
           R=scan.nextInt();
           if (scan.hasNextInt()) {
               G=scan.nextInt();
               if (scan.hasNextInt()){
                   B=scan.nextInt();
        if (255>=R&&R>=0 && 255>=G&&G>=0 && 255>=B&&B>=0) {
            
        int r1 = R/16;//declear the first digit of the hex
        int r2= R%16;//decleaer the second digit of the hex
        int g1 = G/16;
        int g2= G%16;
        int b1 = B/16;
        int b2= B%16;
            //get the hex when the division is less than 1
            if (R<10&&R!=0){
                hex+="0"+R;
            } 
            else if (R==0) {
                hex+="0"+R;
            }
             if (G<10&&G!=0){
                hex+="0"+G;
            } 
            else if (G==0) {
                hex+="0"+G;
            }
             if (B<10&&B!=0){
                hex+="0"+R;
            } 
            else if (B==0) {
                hex+="0"+B;
            }
            //Get hex of R G B when they are greater than 10, cast int to string by using hex instead of integer r1 r2 g1 g2 b1 b2
         if (R>=10&&G>=10&&B>=10){
             if (r1<10){
                 hex+=r1;
             }
             else {
             switch(r1)
            {
                
                case 10 :hex+="A";break;
                case 11 :hex+="B";break;
                case 12 :hex+="C";break;
                case 13 :hex+="D";break;
                case 14 :hex+="E";break;
                case 15 :hex+="F";break;
            }
             }
             if (r2<10){
                 hex+=r2;
             }
             else {
            switch(r2)
            {
                 case 10 :hex+="A";break;
                case 11 :hex+="B";break;
                case 12 :hex+="C";break;
                case 13 :hex+="D";break;
                case 14 :hex+="E";break;
                case 15 :hex+="F";break;
            }
             }
             if (g1<10){
                 hex+=g1;
             }
             else {
            switch(g1)
            {
                
                 case 10 :hex+="A";break;
                case 11 :hex+="B";break;
                case 12 :hex+="C";break;
                case 13 :hex+="D";break;
                case 14 :hex+="E";break;
                case 15 :hex+="F";break;
            }
             }
             if (g2<10){
                 hex+=g2;
             }
             else {
           switch(g2)
            {
                
                 case 10 :hex+="A";break;
                case 11 :hex+="B";break;
                case 12 :hex+="C";break;
                case 13 :hex+="D";break;
                case 14 :hex+="E";break;
                case 15 :hex+="F";break;
            }
             }
             if (b1<10){
                 hex+=b1;
             }
             else {
            switch(b1)
            {
              
                 case 10 :hex+="A";break;
                case 11 :hex+="B";break;
                case 12 :hex+="C";break;
                case 13 :hex+="D";break;
                case 14 :hex+="E";break;
                case 15 :hex+="F";break;
            }
             }
             if (b2<10){
                 hex+=b2;
             }
             else {
            switch(b2)
            {
               
                 case 10 :hex+="A";break;
                case 11 :hex+="B";break;
                case 12 :hex+="C";break;
                case 13 :hex+="D";break;
                case 14 :hex+="E";break;
                case 15 :hex+="F";break;
            }
             }
                
                 
        }
        System.out.println("The decimal numbers R:"+R+", G: "+G+", B:"+B+", is represented in hexadecimal as: "+hex);
        }
        else  {
         System.out.println("invalid input for R");
        }
               }
        else  {
         System.out.println("invalid input for G");
               }
           }
               else  {
         System.out.println("invalid input for B");
           }
       }
          else  {
         System.out.println("invalid input");
           }
     }
 }