package BLM.Week04;

import javax.swing.tree.TreeNode;

public class Example04 {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        preOrder(root);

    }

    static void preOrder(Node node){
        if(node == null) return;
        //Visit root
        node.visit();
        preOrder(node.left);
        preOrder(node.right);

    }

}
