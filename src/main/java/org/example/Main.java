package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if (Character.isLetter(a.charAt(i))) {
                sb.append(a.charAt(i));
            }
        }
        String b = sb.toString();
        String c = sb.reverse().toString();
        if (c.equals(b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
