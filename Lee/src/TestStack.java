import java.util.Stack;

import utils.TreeNode;

public class TestStack
{
    public static void main(String[] args)
    {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        System.out.println(stack.size());
        stack.push(null);
        System.out.println(stack.size());
    }
}
