package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().toLowerCase();
        char[] chars = a.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char ch : chars) {
            sb.append(ch);
        }
        sb.reverse();
        String b = sb.toString();
        if (a.equals(b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
