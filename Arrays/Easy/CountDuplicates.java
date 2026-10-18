import java.util.*;

//Problem:Count Duplicates in given array
public class CountDuplicates{
    public static void countDuplicates(int arr[]){
       int count=0;
       for(int i=1;i<arr.length-1;i++){
        if(arr[i]==arr[i+1]){
            count++;
            }
        }
      System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,4,4};// duplicates = 2 (because 1 original + 2 extra)
        countDuplicates(arr);
    }
}