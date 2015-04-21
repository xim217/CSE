import java.util.Scanner;
import java.lang.Math;
public class CSE2Linear{
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        int [] Array=new int [15];
        System.out.println("Enter 15 ints for final grades:");
        int input=0;
        int last=0;
        for(int i=0;i<15;i++){
            if (scan.hasNextInt()){
            input=scan.nextInt();
                if (input<0||input>100) {
                System.out.print("not in range (0 to 100) ");
                i--;
                }
                else if (input<=last){
                System.out.println("not the right order ");
                i--;
                }
                else {
                Array[i]=input;
                }
                last=input;
            }
            else {
                System.out.println("Not integer");
            }
            
        }
        String out1="the grades, sorted, are ";
    	out1+=listArray(Array);
        System.out.println(out1);
        System.out.println("Enter a grade to search for: ");
        int x=scan.nextInt();  
        binary(Array,x);
        // scramble
        int []Array2=scramble(Array);
        System.out.print("The scrambled grades: ");
        for(int j=0;j<Array2.length;j++){
            System.out.print(Array2[j]+" ");
        }
        System.out.println("");
        System.out.println("Enter a grade to search for: ");
        int y=scan.nextInt();
        int m=linear(Array, y);
        System.out.println(y+" was found in the list with "+m+" iterations");
    }

public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
 public void binary(int[] Array, int x){
    
     int first=0;
     int last=14;
     int middle=(first+last)/2;
     while (first<=last){
         if (x>Array[middle]){
             first=middle+1;
         }
         else if (x==Array[middle]){
             System.out.println(x+"was found in the list with "+middle+ " iterations");
             break;
         }
         else {
             last=middle-1;
         }
         middle=(first+last)/2;
     }
     if (first>=last){
         System.out.println(x+" was not in the list");
     }
     return 1;
 } 
 
 public static int linear(int[] Array, int y){
    int i=0;
    for (i=0;i<Array.length;i++){
        if(Array[i]==y){
            break;
        }
    }
    return i;
 }
 
 public static int[] scramble(int[] Array){
     for (int i=0; i<Array.length; i++) {
	//find a random member to swap with
	int target = (int) (Array.length * Math.random() );


	//swap the values
	int temp = Array[target];
	Array[target] = Array[i];
	Array[i] = temp;
}
return Array;

 }
}// end of class