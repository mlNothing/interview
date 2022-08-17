package com.example.demo02javamath.javaMath;

import java.util.HashMap;

/**
 * @Author: mlingOkay
 * @CreateTime: 2022-08-09  13:28
 * @Description: TODO
 * @Version: 1.0
 */
public class demo13RomaNumToInt {
    public static int romanToInt(String s) {
        int excepNum=0;
        int totle=0;
        StringBuffer one =new StringBuffer(s);
        if (s.contains("IV")){
            excepNum=4;
            totle=totle+excepNum;
            int iv = one.indexOf("IV");
            one.delete(iv,iv+2);
        }if (s.contains("IX")){
            int iv = one.indexOf("IX");
            excepNum=9;
            totle=totle+excepNum;
            one.delete(iv,iv+2);
        }if (s.contains("XL")){
            int iv = one.indexOf("XL");
            excepNum=40;
            totle=totle+excepNum;
            one.delete(iv,iv+2);
        }if (s.contains("XC")){
            int iv = one.indexOf("XC");
            excepNum=90;
            totle=totle+excepNum;
            one.delete(iv,iv+2);
        }if (s.contains("CD")){
            int iv = one.indexOf("CD");
            excepNum=400;
            totle=totle+excepNum;
            one.delete(iv,iv+2);
        }if (s.contains("CM")) {
            int iv = one.indexOf("CM");
            excepNum=900;
            totle=totle+excepNum;
            one.delete(iv,iv+2);
        }
        HashMap<Character, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put('I',1);
        stringIntegerHashMap.put('V',5);
        stringIntegerHashMap.put('X',10);
        stringIntegerHashMap.put('L',50);
        stringIntegerHashMap.put('C',100);
        stringIntegerHashMap.put('D',500);
        stringIntegerHashMap.put('M',1000);
        String s1 = one.toString();
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            totle+= stringIntegerHashMap.get(chars[i]);
        }
        return totle;
    }

    /**
     * 更好的
     * @param s
     * @return
     */
    public static int romanToInt1(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private static  int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }



    public static void main(String[] args) {
        int iv = romanToInt1("MCMXCIV");
        System.out.println(iv);
    }
}
