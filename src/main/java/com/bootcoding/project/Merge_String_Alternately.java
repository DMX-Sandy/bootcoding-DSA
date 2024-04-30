package com.bootcoding.project;

public class Merge_String_Alternately {
    public static void main(String[] args) {
        String word1 ="abc";
        String word2 ="pqr";

        StringBuilder str = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int ind=0;

        int i =0,j=0;

        while(i<n || j<m){
            if(ind % 2==0){
                str.append(word1.charAt(i++));
            }else{
                str.append(word2.charAt(j++));
            }
            ind++;
        }
        System.out.println(str);

        System.out.println(str);
//        char [] w1 = new char[word1.length()];
//        char [] w2 = new char[word2.length()];
//        char [] merger = new char[word1.length()+word2.length()];
//
//        for(int i=0; i<word1.length();i++){
//            w1[i]=word1.charAt(i);
//        }
//        for(int i =0;i<word2.length();i++){
//            w2[i]=word2.charAt(i);
//        }
//        for(int i =0;i<w1.length;i++){
//            merger[i++]= w1[i];
//        }
//        for(int i =1;i<w2.length;i++){
//            merger[i++]=w2[i];
//        }

//        for(int i=0;i<=merger.length;i++){
//            System.out.println(merger[i]);
//
//        }

    }
}
