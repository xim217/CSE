import java.util.Scanner;
import java.lang.Math;
public class ArraysSearch {
    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);
        int size=50;
        int [] Array1=new int [size];
        for (int i=0; i<Array1.length; i++){
            Array1[i]=(int)(Math.random()*101);
        }
        
        int smallest1=Array1[0];
        int largest1=Array1[0];
        for (int i=0; i<Array1.length; i++){
           if (Array1[i]<smallest1) {
               smallest1=Array1[i];
           }
           else if(Array1[i]>largest1){
                   largest1=Array1[i];
           }
        }
        
        System.out.println("in Array 1, the smallest and largest are ( "+smallest1+" , "+largest1+" )");
    
        int [] Array2=new int [size];
      
        for(int i=0;i<Array2.length;i++){
              if(i==0){
                  Array2[i]=(int)(Math.random()*101);
              }
              else{
                  Array2[i]=(int)(Math.random()*101)+Array2[i-1];
              }
        }
        int smallest2=Array2[0];
        int largest2=Array2[0];
        for (int i=0; i<Array2.length;i++){
            if (Array2[i]<smallest2) {
               smallest1=Array1[i];
           }
           else if(Array1[i]>largest2){
                   largest1=Array2[i];
           }
        }
        System.out.println("in Array 2, the smallest and largest are ( "+smallest2+" , "+largest2+" )");
        System.out.print("Enter an int: ");
        
        while (!scan.hasNextInt()||scan.nextInt()<=0){
            System.out.println("Please enter a positive integer ");
            scan.next();
        }
        System.out.print("enter again, to confirm the integer:");
        int x=scan.nextInt();
        int first=0;
        int last=49;
        int middle=(first+last)/2;
        while (first<=last){
            if (x>Array2[middle]){
                first=middle+1;
            }
            else if (x==Array2[middle]){
                System.out.print(x+"was found in the list in position "+middle+" in Array 2.");
                break;
            }
            else {
                last=middle-1;
            }
            middle=(first+last)/2;
        }
        if (first>=last){
            System.out.println(x+" was not in the list");
            System.out.println("the number above the key or closest to the key was "+Array2[middle]);
        }
    }
}