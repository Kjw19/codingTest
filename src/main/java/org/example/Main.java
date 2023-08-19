package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int max=0;

        List<Integer> price = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            price.add(sc.nextInt());
        }
        for (int h = 0; h < K; h++) {
            max += price.get(h);
        }


        int element = max;
        for (int j = K; j < N; j++) {
            element += price.get(j) - price.get(j - K);
            max = Math.max(max, element);
        }
        System.out.println(max);
    }
}

