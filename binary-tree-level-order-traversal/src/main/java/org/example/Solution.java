package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();
                if (node != null) {
                    level.add(node.val);
                }
                if (node != null && node.left != null) {
                    queue.offer(node.left);
                }
                if (node != null && node.right != null) {
                    queue.offer(node.right);
                }
            }
            ret.add(level);
        }

        return ret;
    }

    public void myFunc(ArrayList<Integer> arr) {
        // 使用自测数据按钮时调试用，正式提交时要删掉。
        Integer[] nums = arr.toArray(Integer[]::new);
        //System.out.println
        TreeNode n = (TreeNode.constructTree(nums));
        System.out.println(levelOrder(n));

    }
}
