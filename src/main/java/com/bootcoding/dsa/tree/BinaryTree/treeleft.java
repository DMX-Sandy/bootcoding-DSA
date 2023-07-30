package com.bootcoding.dsa.tree.BinaryTree;



public class treeleft {


    public static void Inorder(TreeNode root){
        if(root==null){
            return;
        }
       Inorder(root.left);
        if(root.data%2==0){
            System.out.println(root.data);
        }
        Inorder(root.right);

//        //left element
//        Inorder(root.left);
//        System.out.println(root.data);

//        //right element
//        Inorder(root.right);
//        System.out.println(root.data);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Inorder(root);

    }


}



