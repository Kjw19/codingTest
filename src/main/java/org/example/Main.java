package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution(n);

    }

    private static long Solution(int n) {


        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuffer sb = new StringBuffer();
        for (String s : list) {
            sb.append(s);
        }
        return Long.parseLong(sb.reverse().toString());

    }

}
