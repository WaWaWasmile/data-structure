package com.structure.select;

public class FindString {
    public static void main(String[] args) {
        String str = "aa 23 bc 33# weq23#$";
        Integer enNum = 0;//字母
        int mathNum = 0;//数字
        int spacNum = 0;//空格
        int num = 0;//特殊字符

        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++){
            if(chars[i]>='A'&&chars[i]<='Z'||chars[i]>='a'&&chars[i]<='z'){
                enNum++;
            }else if(chars[i]>='0'&&chars[i]<='9'){
                mathNum++;
            }else if(chars[i]==' '){
                spacNum++;
            }else{
                num++;
            }
        }
        for(int i=0;i<chars.length;i++){
            int j=chars[i];
            System.out.println(j);
        }
        System.out.println("字母个数："+enNum);
        System.out.println("数字个数："+mathNum);
        System.out.println("空格个数："+spacNum);
        System.out.println("特殊字符个数："+num);
    }
}
