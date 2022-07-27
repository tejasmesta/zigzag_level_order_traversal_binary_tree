class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root==null)
        {
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        boolean f = true;
        
        while(!q.isEmpty())
        {
            int s = q.size();
            
            List<Integer> list = new ArrayList<>();
            
            for(int i=0;i<s;i++)
            {
                TreeNode rem = q.remove();
                
                list.add(rem.val);
                
                if(rem.left!=null)
                {
                    q.add(rem.left);
                }
                
                if(rem.right!=null)
                {
                    q.add(rem.right);
                }
            }
            
            if(f==false)
            {
                Collections.reverse(list);
            }
            
            ans.add(list);
            
            f = !f;
        }
        
        return ans;
        
    }
}
