//Approach - Kadane's algorithm work for both all negative element and positive element

import java.util.*;
public class kadanealgo{
    public static void KadaneAlgorithm(int arr[]){
        int curr_sum =0;
        int max_sum = Integer.MIN_VALUE;;
        for(int i = 0; i<arr.length; i++){
            curr_sum += arr[i];
            max_sum = Math.max(curr_sum , max_sum);
            if(curr_sum<0){
                curr_sum = 0;
            }
           }
        System.out.println(max_sum);
    }
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,-4};
        KadaneAlgorithm(arr);
    }
}