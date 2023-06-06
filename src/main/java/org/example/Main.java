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

        List<Character> ab = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        int length = 7;

        for (int k = 0; k < a.length(); k++) {
            ab.add(a.charAt(k));
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < length && !ab.isEmpty(); j++) {
                sb.append(ab.get(0));
                ab.remove(0);
            }
            list.add(sb.toString());
            sb = new StringBuilder();
        }
        for (int m = 0; m < list.size(); m++) {
            StringBuilder newSb = new StringBuilder();
            String chunk = list.get(m);
            for (int n = 0; n < chunk.length(); n++) {
                if (chunk.charAt(n) == '#') {
                    newSb.append(1);
                } else if (chunk.charAt(n) == '*'){
                    newSb.append(0);
                }
            }
            int parseInt = Integer.parseInt(newSb.toString(), 2);
            char anInt = (char) parseInt;
            System.out.print(anInt);
        }


    }
}
