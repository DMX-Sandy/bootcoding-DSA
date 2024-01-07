package com.bootcoding.dsa.Searching;

public class lc1662 {
    public static void main(String[] args){
              String [] word1={"a","bc"};
              String [] word2={"ab","c"};
                String sum1="";
                String sum2="";
                for(int i=0;i<word1.length;i++){
                    sum1+=word1[i];
                }
                for(int j=0;j<word2.length;j++){
                    sum2+=word2[j];
                }

                //return sum1.equals(sum2);
                System.out.println(sum1.equals(sum2));

            }

        }


