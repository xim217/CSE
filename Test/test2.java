public class test2 {
    public static void main (String []args){
int[] A = new int[5];
A[0]=2;
for (int i=1;i<5;i++){
    A[i]=A[i-1]+1;
}
int[][]B=new int[A.length][];
for (int i=0;i<A.length;i++){
    B[i]=new int [A[i]];
}
int k=1;
for (int i=0; i<A.length;i++){
    for (int j=0;j<B[i].length;j++){
        B[i][j]=B[i].length*k;
        k++;
    }
    k=1;
}
printMatrix(B);
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
}