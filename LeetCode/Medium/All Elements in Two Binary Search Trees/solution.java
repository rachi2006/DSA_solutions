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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        traverse(root1, result);
        traverse(root2, result);
        Collections.sort(result);
        
        return result;
    }
    private void traverse(TreeNode root, List<Integer> result) {
        if (root == null) return;
        
        result.add(root.val);
        traverse(root.left, result);
        traverse(root.right, result);
    }
}
