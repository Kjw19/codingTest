package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;
        int total =0;

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        total = createTotal(score, total, list);
        System.out.println(total);
    }

    private static int createTotal(int score, int total, List<Integer> list) {
        for (Integer integer : list) {
            if (integer == 1) {
                score++;
                total += score;
            } else {
                score = 0;
            };
        }
        return total;
    }


}
