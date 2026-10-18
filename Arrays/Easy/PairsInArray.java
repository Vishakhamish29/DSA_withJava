//Problem: Find Pairs in Array

public class PairsInArray {
    public static void pairsInarray(int arr[]){
   for(int i=0;i<arr.length;i++){
    // int curr=arr[i];
    for(int j=i+1;j<arr.length;j++){
      System.out.print("("+ arr[i] + " " + arr[j]+ ") ");
    }
    System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        pairsInarray(arr);
    }
} 

