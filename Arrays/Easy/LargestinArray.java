import java.util.*;
//Problem: Find the largest element in given array

public class LargestinArray {
    public static void largestInArray(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println("The Largest is :" + largest);
    }
    public static void main(String[] args) {
        int arr[]={50,60,40,20,80,70};
        largestInArray(arr);
    }
}
