import java.util.*;
public class LCTwoSumII {
    public static int[] twoSum(int arr[], int target){
        int left=0;
        int right= arr.length-1;
        while(left<=right){
            if(arr[left] + arr[right] == target){
                return new int[]{left+1, right+1};
            }
            else if(arr[left] + arr[right] < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{left+1, right+1};
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7};
        int target=6;
        int [] result = twoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
        }
}
