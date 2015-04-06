import java.lang.Math;
   import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.println("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.println("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
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
  


    
    public static int[] randomInput(){
      int num[]=new int[10];
       for(int i=0;i<10;i++){
         num[i]=(int)((Math.random()*10));
       }
       return num;
    }
    
    public static int[] delete(int[]list,int pos){
        int newArray1[]=new int[list.length-1];
        
        for (int j=0;j<newArray1.length;j++){
          if(j>=pos){
            newArray1[j]=list[j+1];
            
          }
          else{
          newArray1[j]=list[j];
          }
            
          }
        
        return newArray1;
    }
    
    public static int[] remove(int[]list,int target){
        int c=0;
        int c2=0;
        for(int i=0;i<list.length;i++){
          if(list[i]==target){
            c++;
          }
        }// find how many target numbers are there
        int newArray2[]=new int [list.length-c];
        for (int k=0;k<list.length;k++){
          if (list[k]==target){
            continue;
          }
          else {
            newArray2[c2]=list[k];
            c2++;
          }
          
        }// create a new list and skip the target value
        return newArray2;
    }
}// END of class