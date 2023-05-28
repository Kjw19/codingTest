package org.example;

import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] array = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            char cr = array[i];
            if (Character.isUpperCase(cr)) {
                array[i] = Character.toLowerCase(cr);
            } else {
                array[i] = Character.toUpperCase(cr);
            }
        }
        str = new String(array);
        System.out.println(str);
    }
}
