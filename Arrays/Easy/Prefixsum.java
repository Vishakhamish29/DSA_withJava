public class Prefixsum {
    public static void prefixSum(int arr[]){
        int n =arr.length;
        int prefix[] = new int[n];
         prefix[0] = arr[0];
        
        for(int i=1;i<arr.length;i++){
        prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(prefix[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={-5, 1, 5, 0, -7};
        prefixSum(arr);
    }
}
