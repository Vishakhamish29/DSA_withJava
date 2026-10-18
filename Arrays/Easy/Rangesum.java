import java.util.*;
public class Rangesum {
        public static void rangeSum(int arr[],int l ,int r){
        int n =arr.length;
        int prefix[] = new int[n];
         prefix[0] = arr[0];
        
        for(int i=1;i<arr.length;i++){
        prefix[i] = prefix[i-1] + arr[i];
        }
        if(l == 0){
        System.out.print(prefix[r]);
       } else {
        int sum = prefix[r] - prefix[l-1];
        System.out.print(sum);
       }
       }
    public static void main(String[] args) {
     int arr[] ={2,4,6,8,10};
     int  l = 2;
     int r = 4;
     rangeSum(arr, l, r);
    }
}