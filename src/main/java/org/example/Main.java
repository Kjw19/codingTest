package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int count =1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i - 1) == a.charAt(i)) {
                count++;
            } else {
                sb.append(a.charAt(i - 1));
                if (count != 1) {
                    sb.append(count);
                }
                count=1;
            }
        }
        sb.append(a.charAt(a.length() - 1));
        if (count != 1) {
            sb.append(count);
        }

        String b = sb.toString();
        System.out.println(b);


    }
}
