package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int count =1;

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        searchRank(list, count);
    }

    private static void searchRank(List<Integer> list, int count) {
        for (Integer integer : list) {
            for (int i = 0; i < list.size(); i++) {
                if (integer < list.get(i)) {
                    count++;
                }
            }
            System.out.print(count + " ");
            count = 1;
        }
    }

}
