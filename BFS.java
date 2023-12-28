public class BFS {
    public void bfs(TreeNode root){
        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
        if(root != null){
            queue.add(root);
        }
        int level = 0;
        while(!queue.isEmpty()){
            System.out.println("level: "+ level);
            int levelLength = queue.size();
            for(int i = 0; i < levelLength; i++){
                TreeNode curr = queue.removeFirst();
                System.out.println(curr.val+" ");
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
                level++;
    }
    
}
