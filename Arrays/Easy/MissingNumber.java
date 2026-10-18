import java.util.*;
//Given an array of size n-1 containing distinct integers in the range 1 to n, find the missing number.
public class MissingNumber {
    public static void missingNumber(int arr[]){
       int n=arr.length;
       int expected_sum=0;
       int total_sum=n*(n+1)/2;
       for(int i=0;i<n-1;i++){
        expected_sum+=arr[i];
       }
       int missingnumber = total_sum - expected_sum;
       System.out.println(missingnumber);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        missingNumber(arr);
      
    }
}
