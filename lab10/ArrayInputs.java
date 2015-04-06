import java.util.Scanner;
import java.lang.Math;
public class ArrayInputs{
 public static void main(String[] args){
     Scanner scan=new Scanner(System.in);
         System.out.println("Please enter the size of the array: ");
     int sizeArray=scan.nextInt();
    int [] input=new int [sizeArray];
    System.out.println("Pleaese enter"+sizeArray+" positive integers: ");
    System.out.println("The array is: ");
    for (int i=0;i<sizeArray;i++){
       input[i]=positiveInt(scan.nextInt());
    }
     for (int i=0;i<input.length;i++){
         System.out.print(input[i]);
     }
}



public static int positiveInt(int x){
    if (x<=0){
            System.out.println("Not an integer");
        }
        return x;
}
}