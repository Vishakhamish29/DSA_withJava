public class RemoveDuplicates {
    public static void removeduplicates(int arr[]){
    int left=0; 
    for(int right =1; right < arr.length; right++){
        if(arr[left]!=arr[right]){
            left++;
           arr[left]=arr[right];
        }
    }
   System.out.println(left+1);
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        removeduplicates(arr);
    }
}
