package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strs = sc.nextLine();
        char[] chars = strs.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char ch:chars) {
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
