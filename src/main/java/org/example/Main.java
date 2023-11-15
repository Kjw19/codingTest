package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String vote = sc.nextLine();

        HashMap<Character, Integer> voteCount = new HashMap<>();
        for (int i = 0; i < N; i++) {
            char candidate = vote.charAt(i);
            voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
            //이 코드는 voteCount 맵에 candidate라는 키가 이미 존재하는 경우, 그 키에 해당하는 값을 가져와 1을 더한 후 다시 맵에 저장합니다.
            //getOrDefault 메서드는 맵에 candidate라는 키가 존재하면 해당 키의 값을 반환하고, 존재하지 않으면 기본값(여기서는 0)을 반환합니다.
            //즉, candidate가 이전에 등장하지 않았다면, 그 값은 0으로 시작하여 1이 됩니다. 이미 존재한다면, 현재 값에 1을 더해 증가시킵니다.
        }

        char MaxVoteMember = ' ';
        int maxVote = 0;

        for (Map.Entry<Character, Integer> entry : voteCount.entrySet()) {
            // 맵의 모든 항목(후보와 해당 후보의 투표 수를 나타내는 Entry)을 순회하는 루프입니다.
            if (maxVote < entry.getValue()) {
                maxVote = entry.getValue();
                MaxVoteMember = entry.getKey();
            }
        }

        System.out.println(MaxVoteMember);

    }
}

