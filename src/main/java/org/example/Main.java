package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] list = new int[n][n];
        List<Integer> max = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list[i][j] += sc.nextInt();
            }
        }

        searchMax(n, list, max);
    }

    private static void searchMax(int n, int[][] list, List<Integer> max) {
        columnSum(n, list, max);
        rowSum(n, list, max);
        diagonal(n, list, max);
        reverseDiagonal(n, list, max);

        Optional<Integer> optionalMax = max.stream().max(Integer::compareTo);
        Integer maxValue = optionalMax.get();
        System.out.println(maxValue);
    }

    private static void columnSum(int n, int[][] list, List<Integer> max) {
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < n; j++) {
                total += list[i][j];
            }
            max.add(total);
        }
    }
    private static void rowSum(int n, int[][] list, List<Integer> max) {
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < n; j++) {
                total += list[j][i];
            }
            max.add(total);
        }
    }
    private static void diagonal(int n, int[][] list, List<Integer> max) {
            int total = 0;
            for (int j = 0; j < n; j++) {
                total += list[j][j];
            }
            max.add(total);
        }
    private static void reverseDiagonal(int n, int[][] list, List<Integer> max) {
            int total = 0;
            for (int j = 0; j < n; j++) {
                total += list[j][j];
            }
            max.add(total);
        }
    }
