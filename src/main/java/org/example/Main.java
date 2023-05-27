package org.example;

import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().toLowerCase();
        char b = sc.next().toLowerCase().charAt(0);
        int count =0;

        for (char x : a.toCharArray()) { //문자하나하나 분리해서 문자배열 생성
            if (x == b) {
                ++count;
            }
        }
        System.out.println(count);

    }
}
