package BinaryTree;

import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;

    Node(int x){
        data = x;
        left = null;
        right = null;
    }
}
// InOrder is Left Root Right
public class BinaryTreeInOrder {

    static void inOrder(Node node,ArrayList<Integer> res){
         if(node == null)
            return;
         inOrder(node.left, res);
         res.add(node.data);
         inOrder(node.right, res);
    }

    public static void main(String[] args){
        
        Node root =  new Node(1);
        root.left =  new Node(2);
        root.right =  new Node(3); 
        root.left.left = new Node(4);
        root.left.right =  new Node(5);
        root.right.right =  new Node(6); 


       ArrayList<Integer> res = new ArrayList<>();
       inOrder(root, res);

       for(int child : res){
        System.out.print(child + " ");
       }

    }    
}
