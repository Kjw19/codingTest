package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); //뒤에 오는 줄바꿈 문자 제거
        String[] strs = new String[N]; //입력한 N에따라 배열크기 지정
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            str = new StringBuilder(str).reverse().toString(); // StringBuilder를 이용해 문자열 뒤집기
            strs[i] = str; // 뒤집은 단어 저장
        }
        for (String str: strs) {
            System.out.println(str);
        }
    }
}
