// Xintong Ming
// HW13--04/28/2015
import java.util.Scanner;
public class FourDwin{
    
    public static void main (String []args){
        
        Scanner scan= new Scanner(System.in);
        int input=0;
        System.out.println("Enter an integer X:");
        System.out.println("Enter an integer Y where Y > X:");
        int x=0;
        x=checkInt(x);
        int y=0;
        y=checkInt(y);
        if (x>y){
            System.out.println("Invalid input. Please endter an integer for Y > X:");
            while (x>y){
                y=checkInt(y);
            }
        }
        else{
            input=x+(int)((y-x)*(Math.random()));
        }
        double [][][][] A= new double [3][input][input][input];
        for (int i=0;i<A.length;i++){
            for (int j=0;j<A[0].length;j++){
                for (int k=0;k<A[0][0].length;k++){
                    for (int m=0;m<A[0][0][0].length;m++){
                        double z=(31*Math.random());
                         z=Math.floor(z*10)/10;
                        A[i][j][k][m]=z;
                    }
                }
            }
        }
        printArray(A);
        A=sort3DArray(A);
        A=sort4DArray(A);
        printArray(A);
        statArray(A);
        
    }
    
    public static int checkInt(int x){
    Scanner scan= new Scanner(System.in);
    int input=0;
    for (int i=0;i<1;i++){
    if (scan.hasNextInt()){
            input=scan.nextInt();
                if (input<0) {
                System.out.print(" enter positive number ");
                i--;
                }
                else {
                x=input;
                }
            }
            else {
                System.out.println("Not integer");
            }
    }
    return x;
}
    
    public static void statArray(double[][][][] A){
        int members=0;
        double sum=0;
        double mean=A[0][0][0][0];
        for (int i=0;i<A.length;i++){
            for (int j=0;j<A[0].length;j++){
                for (int k=0;k<A[0][0].length;k++){
                    for (int m=0;m<A[0][0][0].length;m++){
                        sum+=A[i][j][k][m];
                        members++;
                    }
                }
            }
        }
        mean=(sum/members);
        System.out.println("Members: "+members);
        System.out.println("Sum: "+sum);
        System.out.println("Mean: "+mean);
    }
    
    public static double[][][][] sort4DArray(double[][][][] A){
        int index=0;
        int first=0;
        double[][] temp;
        for (int i=0;i<A.length;i++){// scan all 3D array in the 4D array
            for (int j=0;j<A[0].length;j++){// 3D array is sorted by sort3DArray. Only need to compare the first element of each 3D array
            // insertion sort
                for (int k=0;k<A[0].length-1;k++){
                    for (int m=1; m<k;m++){
                        if (A[k][m][0][0]<A[k][first][0][0]){
                            first=m;
                        }
                        //swap
                        temp=A[k][first];
                        A[k][first]=A[k][m];
                        A[k][m]=temp;
                    }
                }
                
            }
        }
        return A;
    }
    
    public static double[][][][] sort3DArray(double[][][][] A){
        double min=0;
        int index=0;
        for (int i=0;i<A.length;i++){
            for (int j=0;j<A[0].length;j++){
                for (int k=0;k<A[0][0].length;k++){
                    for (int m=0;m<A[0][0][0].length;m++){// scan all elements of array
                    // find smallest
                       for (int c=m;c<A[0][0][0].length;c++){
                           if (A[i][j][k][c]<=min){
                               min=A[i][j][k][c];
                               index=c;
                           }
                       }
                    //swap value
                    double temp=A[i][j][k][m];
                    A[i][j][k][m]=A[i][j][k][index];
                    A[i][j][k][index]=temp;
                    }
                }
            }
        }
        return A;
    }
    
    public static void printArray(double[][][][] A){
        System.out.println("##############new print############");
        System.out.println("{");
        for (int i=0;i<A.length;i++){
            System.out.println("        {");
            for (int j=0;j<A[0].length;j++){
                System.out.print("{");
                for (int k=0;k<A[0][0].length;k++){
                    System.out.print("{");
                    for (int m=0;m<A[0][0][0].length;m++){
                        if (m==(A[0][0][0].length-1)){
                            System.out.print(A[i][j][k][m]);
                        }
                        else{
                        System.out.print(A[i][j][k][m]+",");
                        }
                    }
                    System.out.print("}");
                }
                System.out.print("},");
            }
            System.out.println("        }");
        }
        System.out.println("}");
    }
    
}