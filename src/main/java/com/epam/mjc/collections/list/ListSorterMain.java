package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ListSorterMain {
    public static void main(String[] args) {
        new ListSorter().sort(new ArrayList<>(Arrays.asList("-5", "-12", "0", "20", "9", "-20", "37")));
    }
}
