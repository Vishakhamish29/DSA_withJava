public class squareofsortedArray {
    public static void SquareOfSortedArray(int arr[]){
        int n = arr.length;
        int ans[]= new int[n];
        int left = 0;
        int right= n-1;
        int idx = n-1;
        while(left<=right){
            int leftsquare = arr[left] * arr[left];
            int rightsquare = arr[right] * arr[right];
            if(leftsquare > rightsquare){
                ans[idx] = leftsquare;
                left++;
            }
            else{
                ans[idx] = rightsquare;
                right--;
            }
            idx--;
        }
        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
        

    }
    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};
        SquareOfSortedArray(arr);
    }
}
