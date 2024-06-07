package com.bootcoding.leetcode75.array_string;

import java.util.List;

public class Lc_648 {
    public static void main(String[] args) {
        List<String> dictionary = null;
        String sengtence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary,sengtence));
    }
    static Trie root;
    public static String replaceWords(List<String> dictionary, String sentence) {
        root = new Trie();
        for(String word : dictionary){
            insert(word);
        }
        StringBuilder result = new StringBuilder();
        String []  input = sentence.split(" ");
        for(String i : input){
            result.append(search(i));
            result.append(" ");
        }
        return result.toString().trim();
    }
    public static String search(String word){
        Trie node = root;
        int j = 0;
        for(char c : word.toCharArray()){
            int i = c - 'a';
            j++;
            if(node.children[i] == null){
                return word;
            }else if(node.children[i].isEnd){
                return word.substring(0, j);
            }else{
                node = node.children[i];
            }

        }
        return word;

    }
    public static void insert(String word){
        Trie node = root;
        for(char c: word.toCharArray()){
            int i = c - 'a';
            if(node.children[i] == null){
                node.children[i] = new Trie();
            }
            node = node.children[i];
        }
        node.isEnd = true;
    }
}
class Trie{
    Trie [] children;
    boolean isEnd;
    public Trie(){
        children = new Trie[26];
        isEnd =false;
    }
}
