package com.example.demo02javamath.javaMath;

/**
 * @Author: mlingOkay
 * @CreateTime: 2022-08-17  09:28
 * @Description: 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 * @Version: 1.0
 */
public class demo0014IongngestCommonPrefix {
    public static void main(String[] args) {
       String[]  strs= {"flower","flower","flower"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);

    }

    private static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for(int i =1;i<strs.length;i++) {
            int j=0;
            for(;j<ans.length() && j < strs[i].length();j++) {
                if(ans.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            ans = ans.substring(0, j);
            if(ans.equals("")){
                return ans;}
        }
        return ans;
    }

}
