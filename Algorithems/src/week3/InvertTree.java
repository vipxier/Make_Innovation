package week3;

import java.util.Stack;

import BinaryTree.TreeNode;

public class InvertTree {

	 public TreeNode invertTree(TreeNode root) {
		 if(root != null)
		 {
			 Stack<TreeNode> stack = new Stack<TreeNode>();
			 stack.push(root);
			 while(!stack.isEmpty())
			 {
				 TreeNode currentNode = stack.pop();
				 
				 if(currentNode.left != null)
				 {
					 stack.push(currentNode.left);
				 }
				 
				 if(currentNode.right != null)
				 {
					 stack.push(currentNode.right);
				 }
				 
				 TreeNode tempNode = currentNode.left;
				 currentNode.left = currentNode.right;
				 currentNode.right = tempNode;
			 }
		 }
		 
		 return root;
	 }
}
