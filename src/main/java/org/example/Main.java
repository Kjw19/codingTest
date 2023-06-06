package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();

        for (int i = 0; i < count; i++) {
            String b = a.substring(i * 7, (i + 1) * 7)
                    .replaceAll("#", "1")
                    .replaceAll("\\*", "0");

            int asc = Integer.parseInt(b, 2);
            System.out.println((char) asc);
        }

    }
}
