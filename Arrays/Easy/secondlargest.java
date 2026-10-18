public class secondlargest {
        public static void SecondlargestInArray(int arr[]){
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
       if(arr[i]>largest){
          second=largest;
          largest=arr[i];
    }  else if(arr[i]>second){
        second=arr[i];
    }
      }
      System.out.println(second);
    }
    public static void main(String[] args) {
        int arr[]={3,1,7,5};
        SecondlargestInArray(arr);
       
    }
}

