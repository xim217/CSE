// Xintong Ming
// hw12
// 04/21/2015
import java.util.Scanner;
public class Multiply{
public static void main (String []args){
    System.out.println("Enter width and height for first matrix:");
    int aR=0;
    int aC=0;
    aR=checkInt(aR);
    aC=checkInt(aC);
    System.out.println("Generating a matrix with width" +aR+" and height "+aC+" :");
    int [][] array1=randomMatrix( aR,  aC);
    System.out.println("first matrix generated(range -10 to 10)");
    printMatrix(array1);
    System.out.println("Enter width and height for second matrix:");
    int bR=0;
    int bC=0;
    bR=checkInt(bR);
    bC=checkInt(bC);
    System.out.println("Generating a matrix with width" +bR+" and height "+bC+" :");
    int [][] array2=randomMatrix( bR,  bC);
    System.out.println("second matrix generated(range -10 to 10)");
    printMatrix(array2);
    if((aC==bR)){
        System.out.println("=================Multiplying matrix : =======================");
        int [][] MultiArray=matrixMultiply(array1,array2);
        printMatrix(MultiArray);
    }
    else{
        System.out.println(" Please enter correct dimension of array to multiply ");
        System.out.println(" Colume of first matrix should be equal to row of second matrix ");
    }
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

public static int[][] randomMatrix(int r, int c){
    int [][] array= new int[c][r];
    //int [][] array2= int[c][r];
    for (int i=0;i<c;i++){
        for (int j=0;j<r;j++){
            array[i][j]=(int)(10*Math.random())+(int)((-10)*Math.random());// range from -10 to 10
            //array2=(int)(10*Math.random())+(int)((-10)*Math.random());// range from -10 to 10
        }
    }
    return array;
}
public static int[][] matrixMultiply(int[][] A, int[][] B){
    int aR = A.length;
    int aC = A[0].length;
    int bR = aC;
    int bC = B[0].length;
    int [][] C= new int [aR][bC];
    for(int i=0; i<aR;i++){// a row
        for(int j=0; j<bC;j++){// b colume
            for(int k=0;k<aC;k++){// a colume/b row
                C[i][j]+=A[i][k]*B[k][j];
            }
        }
    }
    return C;
}
public static void printMatrix(int [][] a){
    int r = a.length;
    int c = a[0].length;
    for (int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(a[i][j]+"  ");
        }
        System.out.println();
    }
}
}//end of class