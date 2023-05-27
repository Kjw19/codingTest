package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt();
        long sum = 0;
        List<Long> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            long a = sc.nextInt();
            list.add(a);
            sum += a;
        }


        if (sum % 2 != 0) {
            Optional<Long> min = list.stream().filter(a -> a % 2 != 0).min(Long::compareTo);
            sum -= min.get();
        }
        System.out.println(sum);
    }
}
