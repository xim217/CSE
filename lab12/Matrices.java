// Xintong Ming
// 04/17/2015
// lab 12
import java.util.Scanner;
public class Matrices{
public static void main (String []args){
    Scanner scan= new Scanner(System.in);
    
    int x= scan.nextInt();
    int y=scan.nextInt();
    boolean format;
    System.out.println("Generating a matrix with width" +x+" and height "+y+" :");
    int [][] array=increasingMatrix(int x, int y, boolean format);
}
    
    
    public static int [][] increasingMatrix(int row, int colume, boolean format){
    int count=1;
     if (format == true){
     int[][] row = new int[colume][row];
        for(int i = 0; i<colume; i++){
	        for (int j=0; j<row; j++){
	            row[colume][row]=count;
	             count++;
	        }
        }
    }
    else{
        int[][] colume = new int[row][colume];
        for (int i =0; i<row; i++){
            for (int j=0; j<colume; j++){
                colume[row][colume]=count;
                count+r=count;
            }
            count++;
        }
        }
    }
    
    public void printMatrix( int[][] array, boolean format )
    System.out.printf( “%i %i %i”,board[0][0], board[0][1],board[0][2]);

    }// end of class

