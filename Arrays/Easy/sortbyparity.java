public class sortbyparity {
    public static void SortByParity(int [] arr) {
        int left = 0;
        int right= arr.length-1;
        while(left<=right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }else if(arr[left] % 2 == 0){
                left++;
            }else{
                right--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        SortByParity(arr);
    }
}
