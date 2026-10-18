// Problem: In Given array every element appears twice except one single element,find that element.

public class SingleElement {
    public static void PrintsingleElement(int arr[]){
      int result=0;
      for(int i=0;i<arr.length;i++){
        result = result^ arr[i]; 
      }
      System.out.println("The single Element is: " + result);
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        PrintsingleElement(arr);
    }
}
