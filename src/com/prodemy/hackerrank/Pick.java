package com.prodemy.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pick {
    public static void main(String[] args) {
        int temp = 0;
        int max = 0;

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(2);

        Collections.sort(a);
        // 1 1 2 2 2 3
        for (int i = 0; i < a.size(); i++) {
            for (int j = i+1; j < a.size(); j++) {
                if (Math.abs(a.get(i) - a.get(j)) <= 1) {
                    temp++;
                }
            }

            if (temp > max) {
                max = temp;
            }

            temp = 0;
        }

        System.out.println(max + 1);
    }
}
