/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        if(root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        else if(root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {

            return root;
        }
    }

    // boolean search(Node root, Node n) {

    //     if(root == null || n == null) {
    //         return false;
    //     }

    //     if(root.val == n.val) return true;
    //     if(n.val < root.val) {
    //         return search(root.left, n);
    //     } else {
    //         return search(root.right,n);
    //     }

    // }
}
