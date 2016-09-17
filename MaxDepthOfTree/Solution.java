
public class Solution{

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.left.left = new TreeNode(4);
		System.out.println(new Solution().maxDepth(root));
	}

	public int maxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		int left = 1 + maxDepth(root.left);
		int right = 1 + maxDepth(root.right);
		return left > right ? left : right;
	}

}