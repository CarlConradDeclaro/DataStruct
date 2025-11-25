package BinaryTree;

import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;

    Node(int x){
        data = x;
        left = null;
        right =null;
    }
}


// PreOrder is Root left right
public class BinaryTreePreOrder {

    static void preOrder(Node node, ArrayList<Integer> res){
         if(node == null){
            return;
         }

         res.add(node.data);
         preOrder(node.left, res);
         preOrder(node.right, res);
    }
    public static void main(String[] args) {
        
        Node root  = new Node(1);
        root.left = new Node(2);
        root.right =  new Node(3);

        root.left.left = new Node(4);
        root.left.right =  new Node(5);
        
        root.right.right = new Node(6);

        ArrayList<Integer> res =  new ArrayList<>();
        preOrder(root, res);

        for(int val : res){
            System.out.print(val + " ");
        }


    }
}
