package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int reverseA = getReverseA(a);

            if (searchPrime(reverseA)) {
                System.out.print(reverseA + " ");
            }
        }
    }

    private static int getReverseA(int a) {
        StringBuilder str = new StringBuilder(Integer.toString(a));
        String reverseStr = str.reverse().toString();
        int reverseA = Integer.parseInt(reverseStr);
        return reverseA;
    }

    private static boolean searchPrime(int reverseA) {
        if (reverseA < 2) {
            return false;
        }
        for (int j = 2; j * j <= reverseA; j++) {
            if (reverseA % j == 0) {
                return false;
            }
        }
        return true;
    }

}
