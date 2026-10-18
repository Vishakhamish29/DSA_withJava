//Approach - Prefix sum technique

public class MaxofsubArraysum {
public static void maxOfSubArray(int arr[]){
    int maxSum = Integer.MIN_VALUE;
    int curr_sum=0;
    int prefix[] = new int[arr.length];
    prefix[0] = arr[0];
    for(int i = 1;i< arr.length;i ++ ){
        prefix[i] = prefix[i-1] + arr[i];
    }
    for(int i= 0;i<arr.length; i++ ){
        int start = i;
        for(int j = i;j<arr.length; j++){
            int end = j;
            curr_sum = start ==0 ? prefix[end] : prefix[end] - prefix[start-1];
            if(maxSum<curr_sum){
                maxSum= curr_sum;
            }
        }
    }
    System.out.println(maxSum);
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        maxOfSubArray(arr);
        
    }
}

