 /**
  * BinarySearch
  */
 public class BinarySearch {
          
    public static int BinarySearch(int arr[] ,int x){
              
        int low =0;
        int high = arr.length-1;
        int middle =0;

        while(low<= high){
            middle = (low+high)/2;
            if(arr[middle] == x)
               return 1;
            else if(x > arr[middle])
                   low = middle +1;
            else  
                    high = middle-1;       
        }
        return -1;
    }          
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
      System.out.println(BinarySearch(a, 4));   
    }
    
 }