package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        long T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int student = sc.nextInt();
            int[] gradeList = new int[student];
            int sum = 0;
            for (int j = 0; j < student; j++) {
                gradeList[j] = sc.nextInt();
                sum += gradeList[j];
            }
            float avg = sum / student;
            int count = 0;
            for (int k = 0; k < student; k++) {
                if (gradeList[k] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", 100.0 * count / student);

        }
    }

}
