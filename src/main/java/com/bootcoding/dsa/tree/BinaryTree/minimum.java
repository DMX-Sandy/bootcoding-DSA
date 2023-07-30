package com.bootcoding.dsa.tree.BinaryTree;

public class minimum {
    public static int min(TreeNode root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int val=root.data;
        int leftMin=min(root.left);
        int rightMin=min(root.right);
        return Math.min(val,Math.min(leftMin,rightMin));
    }
    public static void print(TreeNode root){
        int res=min(root);
        System.out.println(res);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(23);
        root.right=new TreeNode(89);
        root.left.left=new TreeNode(0);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(600);
        root.right.right=new TreeNode(80);
        min(root);
        print(root);
    }
}
