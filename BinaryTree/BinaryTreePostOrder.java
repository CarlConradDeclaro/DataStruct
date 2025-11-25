package BinaryTree;

import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;

    Node(int x){
        data =  x;
        left = null;
        right =  null;
    }
}

// PostOrder is left,right,root
public class BinaryTreePostOrder {

    static void postOrder(Node node,ArrayList<Integer> res){
        if(node == null)
            return;

        postOrder(node.left, res);
        postOrder(node.right, res);
        res.add(node.data);
    }

    public static void main(String[] args) {
        Node root  = new Node(1);
        root.left = new Node(2);
        root.right =  new Node(3);

        root.left.left = new Node(4);
        root.left.right =  new Node(5);
        
        root.right.right = new Node(6);

        ArrayList<Integer> res = new ArrayList<>();
        postOrder(root, res);


        for(int val : res){
            System.err.print(val + " ");
        }

    }
}
