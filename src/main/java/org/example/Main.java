package org.example;

import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); //뒤에 오는 줄바꿈 문자 제거
        String[] strs = new String[N]; //입력한 N에따라 배열크기 지정
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            char[] words = str.toCharArray();
            for (int k = 0; k < str.length()/2; k++) {//뒤집는 로직 절반만 반복돌림
                char tmp = words[k];
                words[k] = words[words.length - k -1];
                words[words.length - k -1] = tmp;
            }
            strs[i] = new String(words);//뒤집은 단어 저장
        }
        for (String str: strs) {
            System.out.println(str);
        }
    }

    }
