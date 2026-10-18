//Problem: Find the Max and Min in given array

public class MaxAndMin {
    public static void maxAndmin(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max is : "+ max);
        System.out.println("Min is : "+ min);
    }
    public static void main(String[] args) {
        int arr[]={8,7,10,9,4,50};
        maxAndmin(arr);
    }
}
