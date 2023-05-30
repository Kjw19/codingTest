package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strs = sc.nextLine();
        char[] chars = strs.toCharArray();
        int i =0;
        int k = chars.length -1;

        while (i < k) {
            if (Character.isLetter(chars[i])) {//알파벳인지 확인
                while (i<k &&!Character.isLetter(chars[k])) { //알파벳인지 확인
                    k--;
                }
                if (i < k) {

                    char tmp = chars[i];
                    chars[i] = chars[k];
                    chars[k] = tmp;
                    k--;
                }
            }
            i++;
        }

        String toString = new String(chars);
        System.out.println(toString);
    }
}
