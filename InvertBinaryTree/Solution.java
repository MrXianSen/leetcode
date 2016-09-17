
public class Solution{

	public static void main(String[] args) {
		
	}

	public TreeNode invertTree(TreeNode root){
		if(root == null){
			return null;
		}
		TreeNode p = root;
		TreeNode temp = p.left;
		p.left = p.right;
		p.right = temp;
		invertTree(p.left);
		invertTree(p.right);
		return root;
	}

}