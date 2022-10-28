package com.example.likelionalgorithm.class1028;

import java.util.HashSet;
import java.util.Set;

class Pokemon {
    public int solution(int[] nums) {
        // Set으로 만드는 이유? 중복을 없애기위해 -> [3,2,1,2] > [3,2,1]
        // Set -> 중복허용X , 순서없음
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int N = nums.length / 2; // N구하기 타입을 자동으로 설정해주는것
        // -> 다른 종류의 폰켓몬을 가져갈 수 있는 최대값
        // set개수와 n중에서 하나를 return
        // length 6개 N = 3 [333222]
        if (set.size() < N) {
            return set.size();
        }else {
            return N;
        }
    }

    public static void main(String[] args) {

    }
}