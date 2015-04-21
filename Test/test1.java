
public class test1 {
public static void main(String[] args) {
  for(int i=1;i<9;i++){
      for(int j=i;j>=1;j--) {
        for (int k=0;k<j;k++){
          System.out.print(i);
        }
        System.out.println();
      }
 }






  


}
}


import java.util.Scanner;
public class Multiply{
public static void main (String []args){
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter width and height for matrix:(width and height should be the same)");
    int x=0;
   // int y=0;
    int input=0;
    int count=0;
    int n=0;
    for (int i=0;i<2;i++){
    if (scan.hasNextInt()){
            input=scan.nextInt();
                if (input<0) {
                System.out.print(" enter positive number ");
                i--;
                }
              /*  else if (i>0&&input!=count){
                System.out.println(" Please enter correct dimension of array to multiply ");
                i--;
                }*/
                else {
                x=input;
                }
                n=count*x;
                count=input;
            }
            else {
                System.out.println("Not integer");
            }
    }
            System.out.println(n);
            System.out.println("Generating a matrix with width" +x+" and height "+x+" :");
    int [][] array1=randomMatrix( x,  x);
    int [][] array2=randomMatrix( x,  x);
    System.out.println("first matrix generated(range -10 to 10)");
    printMatrix(array1);
    System.out.println("second matrix generated(range -10 to 10)");
    printMatrix(array2);
    System.out.println("=================Multiplying matrix : =======================");
    int [][] MultiArray=matrixMultiply(array1,array2);
    printMatrix(MultiArray);
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
    int bR = B.length;
    int bC = B[0].length;
    int [][] C= new int [aR][aC];
    for(int i=0; i<aR;i++){
        for(int j=0; j<bC;j++){
            for(int k=0;k<aC;k++){
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
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
}
}//end of class