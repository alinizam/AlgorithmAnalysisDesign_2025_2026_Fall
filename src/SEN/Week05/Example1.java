package SEN.Week05;

public class Example1 {
    public static int countMatches(TreeNode root){
        if (root==null){
            return 0;
        }
        int counter=0;
        if(root.left!=null && root.value==root.left.value)
            counter++;
        if(root.right!=null && root.value==root.right.value)
            counter++;
        counter+=countMatches(root.left);
        counter+=countMatches(root.right);
        return counter;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(0);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(0);
        root.right.left=new TreeNode(3);
        root.right.right=new TreeNode(2);
        root.right.left.right=new TreeNode(3);

        System.out.println(countMatches(root,null));
    }
    public static int countMatches(TreeNode node,TreeNode root){
        if (node==null){
            return 0;
        }
        int counter=0;
        if(root!=null && node.value==root.value)
            counter++;
        counter+=countMatches(node.left,node);
        counter+=countMatches(node.right,node);
        return counter;
    }

}
