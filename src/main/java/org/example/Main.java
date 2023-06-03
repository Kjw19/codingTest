package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        char b = sc.next().charAt(0);
        int[] s = new int[a.length()];
        int c = 200;


        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                c = 0;
            }else {
                c++;
            }
            s[i] = c;
        }

        c=200;
        for (int j = a.length() -1; j >=0; j--) {
            if (a.charAt(j) == b) {
                c = 0;
            } else {
                c++;
            }
            s[j] = Math.min(s[j], c);
        }

        for (int k = 0; k < s.length; k++) {
            System.out.print(s[k] + " ");
        }
    }
}
