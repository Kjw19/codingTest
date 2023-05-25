package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int original = N;
        int count = 0;

        do {
            int a = N / 10;
            int b = N % 10;
            int sum = a + b;
            N = (b * 10) + (sum % 10);
            count++;
        } while (N != original);

        System.out.println(count);
    }

}
