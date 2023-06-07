package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];
        List<Integer> list2 = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            list[i] = a;
        }
        list2.add(list[0]);
        for (int j = 1; j < list.length; j++) {
            if (list[j - 1] < list[j]) {
                list2.add(list[j]);
            }
        }
        for (Integer integer : list2) {
            System.out.print(integer + " ");
        }
        }

    }

