package harvieMockProblem;

public class productExceptItSelf {
     static int[] exceptItSelf(int[] arr){
        
        int val = 1;
        int newArr[] = new int[arr.length];
        
        for(int i=1;i<arr.length;i++){
           val*=arr[i];     
        }
        
        for(int j=0;j<arr.length;j++){
               int x = val/arr[j];
               newArr[j] = x;
        }
        return newArr;
    }

    public static void main(String[] args) {
           
	        int arr[] = {1,2,3,4};
	        int result[] = exceptItSelf(arr);
	        
	        for(int res:result){
	            System.out.print(res + " ");
	        }
    }
}
