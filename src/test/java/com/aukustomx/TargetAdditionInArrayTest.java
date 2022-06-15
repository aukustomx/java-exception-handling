package com.aukustomx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class TargetAdditionInArrayTest {

    private static final int TARGET_NUMBER = 699_999;
    private static final int ARRAY_MAX_ELEMENT = 500_000;
    private static final int[] array = IntStream.rangeClosed(1, ARRAY_MAX_ELEMENT).toArray();

    private final TargetAdditionInArray targetAdditionInArray = new TargetAdditionInArray();

    @Test
    public void findAdditionInArrayOneWay() {
        Assertions.assertArrayEquals(new int[]{0, 997},
                targetAdditionInArray.findAdditionInArrayOneWay(array, TARGET_NUMBER));
    }

    @Test
    public void findAdditionInArrayAnotherWay() {
        Assertions.assertArrayEquals(new int[]{498, 499},
                targetAdditionInArray.findAdditionInArrayAnotherWay(array, TARGET_NUMBER));
    }
}
