package com.trainingapps.productms;

import java.util.*;

public class Main {
    public static int solution(int N) {
        int num = N;
        int[] times = new int[10];
        while (num != 0) {
            if (num == 0) {
                break;
            }
            int val = num % 10;
            times[val]++;
            num /= 10;
        }
        String largestNumber = "";
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < times[i]; j++) {
                largestNumber += i;
            }
        }
        if(Long.parseLong(largestNumber)>100000000){
            return -1;
        }
        return Integer.parseInt(largestNumber);
      }


    public static void main(String[] args) {
        System.out.println(solution(123));
    }
}
