package SEN.Week05;

public class Example02 {
    public static int countAllMatches(TreeNode root){
        if(root==null){
            return 0;
        }
        int count=0;
        count+=countValue(root.left,root.value);
        count+=countValue(root.right,root.value);

        count+=countAllMatches(root.left);
        count+=countAllMatches(root.right);

        return count;
    }
    public static int countValue(TreeNode root, int target){
        if(root==null)  return 0;
        int count= (root.value==target) ? 1 : 0;
        count+=countValue(root.left,target);
        count+=countValue(root.right,target);
        return count;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(0);
        root.right=new TreeNode(4);
        root.left.left=new TreeNode(0);
        root.right.left=new TreeNode(3);
        root.right.right=new TreeNode(2);
        root.right.left.right=new TreeNode(3);
        root.right.left.left=new TreeNode(1);
        root.right.right.right=new TreeNode(4);
        root.right.right.left=new TreeNode(5);
        System.out.println(countAllMatches(root));
    }
}
