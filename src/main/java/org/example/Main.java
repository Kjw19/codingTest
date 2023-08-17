package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] IntList = {"0","1","2","3","4","5","6","7","8","9"};
        String[] StringList = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

    }

    public class Solution {
        String[] IntList = {"0","1","2","3","4","5","6","7","8","9"};
        String[] StringList = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        public int solution(String s) {
            int answer =  0;
            for (String s1 : StringList) {
                int index = Arrays.asList(StringList).indexOf(s1);
                if (s.contains(s1)) {
                    s = s.replace(s1, IntList[index]);
                }
            }
            answer = Integer.parseInt(s);
            return answer;

        }
    }
}