import java.util.*;

public class LargestandSmallest {

    public static void largestAndSmallestele(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;
        for(int i =0; i<matrix.length; i++){
           for(int j =0; j<matrix[0].length; j++){
            if(matrix[i][j] > largest){
                largest = matrix[i][j];
            }if(matrix[i][j] < smallest){
                smallest = matrix[i][j];
            }
           }
        }
        System.out.println("Largest is :" + largest);
        System.out.println("smallest is :" + smallest);
    }
    public static void main(String[] args) {
        int matrix[] [] = new int [3][3];
    int n = matrix.length; //size of row
    int m = matrix[0].length;//size of column

    Scanner sc = new Scanner(System.in);
    for(int i =0; i<n; i++){
        for(int j=0; j<m; j++){
            matrix[i][j] = sc.nextInt();
        }
    }

    //output
    for(int i =0;i<n;i++){
        for(int j =0; j<m; j++){
           System.out.print( matrix[i][j] + " ");
        }
        System.out.println();
    }
    largestAndSmallestele(matrix);
    }
}
