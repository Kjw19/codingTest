package org.example;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] firstArr = new int[N];
        initArr(sc, N, firstArr);

        int M = sc.nextInt();
        int[] secArr = new int[M];
        initArr(sc, M, secArr);

        int[] total = new int[M + N];
        for (int j = 0; j < N; j++) {
            total[j] = firstArr[j];
        }
        for (int k = 0; k < M; k++) {
            total[k + N] = secArr[k];
        }

        Arrays.sort(total);
        for (int i : total) {
            System.out.print(i + " ");
        }


    }

    private static void initArr(Scanner sc, int M, int[] secArr) {
        for (int j = 0; j < M; j++) {
            secArr[j] = sc.nextInt();
        }
    }
}

