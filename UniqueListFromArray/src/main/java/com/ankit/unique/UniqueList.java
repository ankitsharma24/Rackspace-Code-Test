package com.ankit.unique;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UniqueList {
    public static void main(String[] args) {
        int[] sortedArray = new int[6];
        sortedArray[0] =3;
        sortedArray[1] =9;
        sortedArray[2] =1;
        sortedArray[3] =2;
        sortedArray[4] =6;
        sortedArray[5] =0;

        System.out.println(getUniqueList(sortedArray));

    }

    /**
     *
     * @param sortedArray
     * @return list of unique integer(s)
     */
    public static List<Integer> getUniqueList(int[] sortedArray) {
        return IntStream.of(sortedArray)
                .distinct()
                .sorted()
                .boxed()
                .collect(Collectors.toList());
    }
}
