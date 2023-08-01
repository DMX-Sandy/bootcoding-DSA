package com.bootcoding.dsa.tree.Binarysearch;

public class InsertElement {
    TreeNode root;
    InsertElement(){
        root = null;
    }
     static TreeNode insert(TreeNode root,int val ){
        if(root==null){
            return new TreeNode(val);
        }

        if(root.data>val){
                root.left=insert(root.left,val);
                }
            else {
                root.right=insert(root.right,val);
            }
        return root;

        }

    public void insertNode(int val) {
        root = insert(root, val);
    }
   public static void  print(TreeNode root, int val) {
        TreeNode res=insert(root,val);
       System.out.println(res);
    }


    public static void main(String[] args) {
        InsertElement bst = new InsertElement();
        bst.insertNode(4);
        bst.insertNode(2);
        bst.insertNode(6);
        bst.insertNode(1);
        bst.insertNode(3);
        bst.insertNode(5);
        bst.insertNode(7);
       // print(root,0);
    }



}
