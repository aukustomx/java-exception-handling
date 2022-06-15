package com.aukustomx;

import java.util.HashMap;
import java.util.Objects;

public class TargetAdditionInArray {

    public int[] findAdditionInArrayOneWay(int[] array, int target) {

        for (int j = 0; j < array.length; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (array[j] + array[k] == target) {
                    System.out.println("Indexes are: " + j + "=" + array[j] + ", " + k + "=" + array[k]);
                    return new int[]{j, k};
                }
            }
        }
        return new int[0];
    }

    public int[] findAdditionInArrayAnotherWay(int[] array, int targetNumber) {

        var numberAndIndexes = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {

            var lookedNumber = Math.abs(array[i] - targetNumber);
            var lookedIndex = numberAndIndexes.get(lookedNumber);
            if (Objects.nonNull(lookedIndex)) {
                System.out.println("Indexes are: " + lookedIndex + "=" + array[lookedIndex] + ", " + i + "=" + array[i]);
//                System.out.println("Indexes are: " + lookedIndex + ", " + i);
                return new int[]{lookedIndex, i};
            } else {
                numberAndIndexes.putIfAbsent(array[i], i);
            }
        }

        return new int[0];
    }
}
