package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] firstArr = new int[N];
        initArr(sc, N, firstArr);


        int M = sc.nextInt();
        int[] secArr = new int[M];
        initArr(sc, M, secArr);

        Arrays.sort(firstArr);
        Arrays.sort(secArr);

        int i = 0, j = 0;
        while (i < N && j < M) {
            if (firstArr[i] < secArr[j]) {
                i++;
            } else if (firstArr[i] > secArr[j]) {
                j++;
            } else {
                System.out.print(firstArr[i] + " ");
                i++;
                j++;
            }
        }

        }

    private static void initArr(Scanner sc, int M, int[] secArr) {
        for (int j = 0; j < M; j++) {
            secArr[j] = sc.nextInt();
        }
    }
}

