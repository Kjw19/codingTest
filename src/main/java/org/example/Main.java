package org.example;

import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" "); //split사용하여 공백으로 단어 분할
        String longWord = "";

        for (String word : words) {
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }
        System.out.println(longWord);
        }

    }
