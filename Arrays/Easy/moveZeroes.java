//Problem: Move all zeroes to the end - Two Pointer Approach - Same direction
public class moveZeroes {
    public static void MoveZeroestoEnd(int []arr){
        int left=0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]!=0){
                arr[left]=arr[right];
                left++;
            }
        }
        while(left < arr.length){
        arr[left]=0;
        left++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3};
        MoveZeroestoEnd(arr);
    }
   
}
