package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int sis = 1;
        int rock = 2;
        int paper = 3;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (A[i] == B[i]) {
                System.out.println("D");
            } else if (A[i] == sis && B[i] == rock) {
                System.out.println("B");
            } else if (A[i] == sis && B[i] == paper) {
                System.out.println("A");
            } else if (A[i] == rock && B[i] == sis) {
                System.out.println("A");
            } else if (A[i] == rock && B[i] == paper) {
                System.out.println("B");
            } else if (A[i] == paper && B[i] == sis) {
                System.out.println("B");
            } else if (A[i] == paper && B[i] == rock) {
                System.out.println("A");
            }
        }
        }

        }

