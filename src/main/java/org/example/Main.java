package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int count=0;
        int start = 0;
        int end =0;
        int sum = 0;

        while (true) {
            if (sum >= M) {
                sum -= numbers[start++];
            } else if (end == N) {
                break;
            } else {
                sum += numbers[end++];
            }
            if (sum == M) {
                count++;
            }
        }
        System.out.println(count);

//        int sum =0;
//        int cnt = 0;
//        int index = 0;
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < N; i++) {
//            list.add(sc.nextInt());
//        }
//
//        for (int k = index; k < N; k++) {
//            sum += list.get(k);
//            if (sum == M) {
//                cnt++;
//                index++;
//                k = index -1;
//                sum = 0;
//            } else if (sum > M) {
//                index++;
//                k = index -1;
//                sum = 0;
//            }
//        }
//        System.out.println(cnt);
    }
}

