package SEN.Week09;

public class MidtermTreeQuestion {
    static public class Node {
        Node left, right;
        int value;
        Node(int value) {
            this.value = value;
        }
        void visit(int i){
            System.out.println(i+": "+value + " visited");
        }
    }

    static void Order(Node node){
        if(node == null) return;
        node.visit(1);
        Order(node.left);
        Order(node.right);
        node.visit(2);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right = new Node(3);
        Order(root);

    }



}
