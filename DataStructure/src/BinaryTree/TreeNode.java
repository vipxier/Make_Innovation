package BinaryTree;

public class TreeNode
{
    String value;
    TreeNode left, right;
    
    public TreeNode(String value)
    {
        this.value = value;
        this.left = this.right = null;
    }
    
    public boolean isLeaf()
    {
        return this.left == null && this.right == null;
    }
}
