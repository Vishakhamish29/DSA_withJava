public class Spiralmatrix{
    public static void spiralMatrixProblem(int matrix[][]){
        int startRow=0;
        int startcol =0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startcol<=endCol){
            //top
            for(int i = startcol; i<=endCol;i++){
                System.out.print(matrix[startRow][i] +" ");
            }
            //right
            for(int j = startRow+1; j<=endRow; j++){
                System.out.print(matrix[j][endCol] + " ");
            }
            //bottom
            for(int k =endCol-1; k>=startcol; k-- ){
                System.out.print(matrix[endRow][k] + " ");
            }
            //left
            for(int l =endRow-1; l>=startRow+1; l--){
                System.out.print(matrix[l][startcol] + " ");
            }
            startRow++;
            startcol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        spiralMatrixProblem(matrix);
    }
}