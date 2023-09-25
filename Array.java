interface Arrays{
        void add(int data); //add element to the array
        void viewArray();//view an element if present in the array
         void remove(int index);//remove an element from the array
        void search(int data);//search for an element in the array
        void ascendingSort(); //sort an array in  ascending way
        void descendingSort();//sort an array in descending way
        void edit(int index,int data);//edit an element in the array
        
}

class MyArray implements Arrays{
   int[] arr;
   int size,count;
    MyArray(int size){
        this.size = size;
        arr = new int[size];
        count =0;
    }

    @Override
    public void add(int data) {
       arr[count] =data;
       count++;
    }

    @Override
        public void viewArray(  ) {
            for(int i=0; i<getCount();i++){
                System.out.print(arr[i]+" ");
            } 
            System.out.println();
        }
    



    @Override
    public  void remove(int index) {
       
         setCount(getCount()-1);// decrease the size of the array because we're going to remove 1 element
         int n =getCount();
         int last = arr[getCount()];  
         int j=0;
          for(int i=0;i<n;i++){
              if(i != index){
                arr[j] =arr[i];              
                j++;
              }   
          }
           arr[j] = last;
    
        
          
          
    }









    @Override
    public void search(int data) {
       int low =0;
       int high = arr.length-1;
         
            while(low<=high){
                int mid1 = low+ (high-low)/3;
                int mid2 = high- (high-low)/3;

                    if(data == arr[mid1]){
                        System.out.println("Element: " + data + " is present in index: " + mid1);
                        return;
                    }
                    if(data == arr[mid2]){
                        System.out.println("Element: " + data + " is present in index: " + mid2);
                        return;
                    }
                    if(data < arr[mid1]){
                        high = mid1-1;
                    }else if(data > arr[mid2]){
                        low = mid2+1;
                    }else{
                        high = mid2-1;
                        low = mid1+1;
                    }
               } 
       System.out.println(data + " not found");   
    }

    @Override
    public void ascendingSort() {
       
	     for(int i=0;i<getCount();i++){
	         int min=i; // 7
	         for(int j=i+1;j<getCount();j++){
	             if(arr[j]<arr[min])
	               min = j;
	         }
	         int x = arr[min]; 
	         arr[min] = arr[i];  
	         arr[i] = x; 
	     }
        
        
    }

    @Override
    public void descendingSort( ) {
          
        for(int i=0;i<getCount();i++){
	         int min=i; // 7
	         for(int j=i+1;j<getCount();j++){
	             if(arr[j]>arr[min])
	               min = j;
	         }
	         int x = arr[min]; 
	         arr[min] = arr[i];  
	         arr[i] = x; 
	     }
    }

    @Override
    public void edit(int index, int data) {
              arr[index] = data; 
    }

     
    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    



   



}


public class Array {
    
    public static void main(String[] args) {
        MyArray myArray = new MyArray(10);
     
        myArray.add(1);
       
        myArray.add(2);
         myArray.add(3);
         myArray.add(4);
         myArray.add(5);
         myArray.add(6);
         myArray.add(7);
         
    
            //  myArray.viewArray( );
              myArray.ascendingSort( );
            //  myArray.viewArray( );
            //  myArray.descendingSort();
            //  myArray.viewArray( );
            //  myArray.edit(1, 100);
            //  myArray.viewArray();
             myArray.remove(6);
             myArray.viewArray();
             myArray.add(100);
             myArray.viewArray();
             
      
    }
}


