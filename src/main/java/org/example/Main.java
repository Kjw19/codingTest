package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int k = sc.nextInt();

        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        //슬라이딩 윈도우 기법
        int maxLength=0;
        int start = 0;
        int cnt = 0;
        for (int end = 0; end < list.length; end++) {
            if (list[end] == 0) {
                cnt++;
            }

            while (cnt > k) {
                if (list[start] == 0) {
                    cnt--;
                }
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        System.out.println(maxLength);

    }
}

