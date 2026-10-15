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
    public int maxLevelSum(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root ==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            int sum = 0;
            for(int i=0;i<len;i++){
                TreeNode curr=q.poll();
                sum += curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            res.add(sum);
            
        }
        int max = Integer.MIN_VALUE;
        int pos = 0;
        int i = 1;
        for(int n : res){
            if(n > max){
                max = n;
                pos = i;
            }
            i++;
        }
        return pos;
        
    }
}