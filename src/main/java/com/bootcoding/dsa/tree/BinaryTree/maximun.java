package com.bootcoding.dsa.tree.BinaryTree;

public class maximun {
    int count = 0;

    public static int inorder(TreeNode root) {

        if (root == null) {
            return Integer.MIN_VALUE;

        }
        int val=root.data;
        int leftMax = inorder(root.left);
        int rightMax = inorder(root.right);
        //return Math.max(root.data, Math.max(leftMax, rightMax));
        if(leftMax>val){
            val=leftMax;
        } if (rightMax>val) {
            val=rightMax;
        }
        return val;
    }

    public static void print(TreeNode root) {
        int max = inorder(root);
        System.out.println(max);
    }



    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left = new TreeNode(12);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(50);
        root.right.right = new TreeNode(60);
        inorder(root);
        print(root);
    }
}

