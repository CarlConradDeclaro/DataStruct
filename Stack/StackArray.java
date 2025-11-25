package Stack;

 

class MyStack{
    // array to store elememts
    private int arr[];
    
    //maximum size of the stack
    private int capacity;
    
    //index of the top
    private int top;
    
    MyStack(int cap){
        capacity = cap;
        arr = new int[capacity];
        top = -1;
    }
    
    
    //push operation
    public void push(int x){
        if(top == capacity-1){
            System.out.println("Stack overflow");
            return;
        }
        
        arr[++top]=x;
    }
    
    
    //pop operation
      public int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        
        return arr[top--];
    }
    
    //peek operation
    public int peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        
        return arr[top];
    }
    
    //isEmpty operation
    public boolean isEmpty(){
        return top == -1;
        
    }
    
    //isFull operation
    public boolean isFull(){
        return top == capacity-1;
    }
    
    
} 
 

public class StackArray {
    	public static void main(String[] args) {
       MyStack stack = new MyStack(4);
       
       stack.push(1);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       
       System.out.println("Peek: " + stack.peek());// display 4
       
       System.out.println("Pop: " + stack.pop()); // remove 4
       
       System.out.println("Peek: " + stack.peek()); // display 3
       
       System.out.println("Peek: " + stack.isEmpty()); //false
       
       System.out.println("Peek: " + stack.isFull()); // false
       
       
  	}
}
