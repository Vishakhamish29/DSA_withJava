import java.util.*;

public class Basic {
     
    public static boolean searchKey(int matrix[] [] , int key){
         for(int i =0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
           if( matrix[i][j] == key){
            System.out.println("found at  (" + i +  " ," + j +")");
            return true;
           }
        }
    }
    System.out.println("not found");
    return false;
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
    searchKey(matrix, 5);
   }
}
