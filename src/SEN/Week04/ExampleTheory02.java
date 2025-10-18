package SEN.Week04;

public class ExampleTheory02 {
    public static void main(String[] args) {
        Node tree=new Node(1);
        tree.right=new Node(7);
        tree.left=new Node(3);
        tree.right.left=new Node(6);
        tree.right.right=new Node(5);
        tree.right.right.right=new Node(8);
        tree.right.right.left=new Node(5);


    //       1
    //  3      7
    //       6   5

        preOrder(tree);
    }
    static int preOrder(Node root) {
        if (root==null) return 0;

        int l=preOrder(root.left);
        int r=preOrder(root.right);
        if ((l+r)>10) System.out.println(root.value+" "+(l+r));
        return l+r+ root.value;
    }
}
