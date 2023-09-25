interface Arrays{
        void add(int data); //add element to the array
        void view(int data);//view an element if present in the array
        void remove(int data);//remove an element from the array
        void search(int data);//search for an element in the array
        void ascendingSort(int[] arr); //sort an array in  ascending way
        void descendingSort(int[] arr);//sort an array in descending way
        void edit(int index);//edit an element in the array
        void displayArray(int[] my_array);
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
    public void view(int data) {
         
    }

    @Override
    public void remove(int data) {
      
    }

    @Override
    public void search(int data) {
      
    }

    @Override
    public void ascendingSort(int[] arr) {
         
    }

    @Override
    public void descendingSort(int[] arr) {
      
    }

    @Override
    public void edit(int index) {
       
    }

    //Prints the elements stored in the array.
    @Override
    public void displayArray(int[] my_array) {
        // the number of element printed depends on how many times the add() have been called 
        // to prevent printing empty indices 
        for(int i=0; i<getCount();i++){
            System.out.print(my_array[i]+" ");
        }
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
        myArray.add(0);
       
        myArray.displayArray(myArray.arr);
    }
}
