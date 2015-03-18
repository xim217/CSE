    // Xintong Ming
    // hw07  numberwaver.java
    // 03/10/2015
    
    import java.util.Scanner;
    public class NumberWaves{
        public static void main (String[] args){
            Scanner scan;
            scan= new Scanner(System.in);
            System.out.println("Enter a number between 1 to 30:");
            while (!scan.hasNextInt()){
                System.out.println("Not an integer");
                scan.next();
            }
            
       //using for loop to do this assignment  
       
          System.out.println("For Loop : ");
                int x=scan.nextInt();
                if (x>=1&&x<=30){    
                for(int k=0;k<=x;k++){//count how many blocks are there and start from 1 times k (for ex:2 and then 22)
                        if ((k+2)%2==0){// even block goes from low to high
                            for (int i=1;i<=k;i++) {//count how many lines 
                            for(int j=0;j<i;j++){
                            System.out.print(k);
                            }
                            System.out.println();
                            }
                        }
                        else  {// goes from high to low
                            for (int i=k;i>0;i--) {//count how many lines and start from the i times k (like 7 times 7)
                            for (int j=i;j>0;j--){
                            System.out.print(k);
                        }
                        System.out.println();
                        }
                        }
                }
                }
                else {
                    System.out.println("invalid input");
                    scan.nextInt();
                }
     // end of for loop           
                
                
   // using while loop              
           System.out.println("While Loop : ");
     //           int x=scan.nextInt();
                
                if (x>=1&&x<=30){    
                int k=0;
                while (k<=x){//count how many blocks are there and start from 1 times k (for ex:2 and then 22)
                        if ((k+2)%2==0){// even block goes from low to high
                        int i=1;
                            while (i<=k) {//count how many lines 
                            int j=0;
                                while (j<i){
                                System.out.print(k);
                                j++;
                                }
                            System.out.println();
                            i++;
                            }
                        }
                        else  {// odd goes from high to low
                        int i=k;
                            while (i>0) {//count how many lines and start from the i times k (like 7 times 7)
                            int j=i;
                                while (j>0){
                                System.out.print(k);
                                j--;
                                }
                            System.out.println();
                            i--;
                            }
                        }
                        k++;
                }
                }
                else {
                    System.out.println("invalid input");
                    scan.nextInt();
                }
    // end of using while loop
    
    // using do while loop
     System.out.println("Do-While Loop : ");
     //           int x=scan.nextInt();
                if (x>=1&&x<=30){    
                int k=0;    
                do {//count how many blocks are there and start from 1 times k (for ex:2 and then 22)
                        if ((k+2)%2==0){// even block goes from low to high
                        int i=1;
                           do{
                           // while (i<=k) {//count how many lines 
                            int j=0;
                                do{System.out.print(k);
                                j++;
                                }while (j<i);
                                
                            System.out.println();
                            i++;
                            }while (i<=k);//count how many lines 
                        }
                        else  {// odd goes from high to low
                        int i=k;
                            do {   //count how many lines and start from the i times k (like 7 times 7)
                            int j=i;
                                do{
                                System.out.print(k);
                                j--;
                                } while (j>0);
                            System.out.println();
                            i--;
                            }while (i>0);
                        }
                        k++;
                } while (k<=x);
                }
                else {
                    System.out.println("invalid input");
                    scan.nextInt();
                }
        // end of do-while loop        
        }
    }