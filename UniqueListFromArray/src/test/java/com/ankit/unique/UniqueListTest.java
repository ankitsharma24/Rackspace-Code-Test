package com.ankit.unique;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class UniqueListTest {

    @Test
    void getUniqueList() {
        assertEquals(Arrays.asList(1,2,3,4), UniqueList.getUniqueList(new int[]{1,1,3,4,2,1,2,3}));
    }
}