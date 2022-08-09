package com.example.demo02javamath.javaMath;

/**
 * @Author: mlingOkay
 * @CreateTime: 2022-08-09  12:44
 * @Description: TODO
 * @Version: 1.0
 */
public class demo0009palindromeNumber {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        byte[] bytes = s.getBytes();
        int num=bytes.length;
        byte[] one = new byte[num];
        for (int i = 0; i < num; i++) {
            one[num-i-1]=bytes[i];
        }
        for (int i = 0; i <= num/2; i++) {
            if (one[i]!=bytes[i]){
                return false;
            }
        }
        return true;
    }

    /**
     * 标准答案
     * @param x
     * @return
     */
    public static boolean isPalindrome1(int x) {
        if (x<0){
            return false;
        }
        int num,x1=x,reNum=0;
        while (x>0){
            num=x%10;
            reNum=reNum*10+num;
            x=x/10;
        }
        return x1==reNum;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome1(121);
        System.out.println(palindrome);
    }

}
