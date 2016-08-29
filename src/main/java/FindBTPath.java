/**
 * Created by orange on 16/8/15.
 * 二叉树前序遍历的理解
 */

import java.util.ArrayList;
import java.util.Stack;

public class FindBTPath {

     public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
     }
    public void PreOrder(TreeNode root){
        if (root!=null) {
            System.out.println(root.val);
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);

        return root;
    }

    private TreeNode reConstructBinaryTree(int[] pre,int startPre,int endPre,int[]in,int startIn,int endIn){
        if(startPre>endPre||startIn>endIn)
            return null;
        TreeNode root = new TreeNode(pre[startPre]);
        for(int i=startIn;i<=endIn;i++){
            if(in[i]==pre[startPre]){
                //left结束位置endPre = 左边个数i-1-startIn  +  左起位置startPre+1
                //right开始位置startIn = startIn
                //右边结束位置endIn = i-1
                root.left = reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                //右子树
                //left开始位置startPre = left结束位置+1
                //left结束位置endPre = endPre
                //右边开始位置startIn = i+1
                //右边结束位置endIn = endIn
                root.right = reConstructBinaryTree(pre,startPre+i-startIn+1,endPre,in,i+1,endIn);
            }
        }
//        System.out.println(root.val);
        return root;
    }

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> pathList = new ArrayList<ArrayList<Integer>>();
        if(root==null||root.val>target) return pathList;
        Stack<Integer> stack = new Stack<Integer>();
        FindPath(root,target,stack,pathList);
        return pathList;

    }
    public void FindPath(TreeNode root,int target,Stack<Integer> path,ArrayList<ArrayList<Integer>> pathList){
        if(root==null) return;
        //1.判断是否为叶结点
        if(root.left==null&&root.right==null){
            if(root.val==target){
                //将该结点添加到路径中
                ArrayList<Integer> list = new ArrayList<Integer>();
                for (int i:path) {
                    list.add(new Integer(i));
                }
                list.add(root.val);
                pathList.add(list);
            }

        }else{
            //非叶子结点,将该结点添加到路径中
            path.push(new Integer(root.val));
            //判断子树路径值的和是否与新的target相等
            FindPath(root.left,target-root.val,path,pathList);
            FindPath(root.right,target-root.val,path,pathList);
            //到达叶子结点且值不相等,出栈
            path.pop();
        }
    }

}