package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];

        array[0] = 1;
        array[1] = 1;
        System.out.print(array[0] + " " + array[1] + " ");

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1];
            System.out.print(array[i] + " ");
        }

    }

}

