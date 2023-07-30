package com.bootcoding.dsa.tree.BinaryTree;

public class search {
   public static  boolean searchh(TreeNode root,int target){
        if(root==null){
            return false;
        }
        if(target==root.data){
            return true;
        }
        return searchh(root.left,target ) || searchh(root.right,target);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left = new TreeNode(12);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(50);
        root.right.right = new TreeNode(60);
        searchh(root,60);
    }
}
