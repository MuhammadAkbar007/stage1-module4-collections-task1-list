package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
        System.out.println(sourceList);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aValue = Integer.parseInt(a);
        int bValue = Integer.parseInt(b);

        int aFunctionValue = 5 * aValue * aValue + 3;
        int bFunctionValue = 5 * bValue * bValue + 3;

        if (aFunctionValue == bFunctionValue) {
            return Integer.compare(aValue, bValue);
        } else {
            return Integer.compare(aFunctionValue, bFunctionValue);
        }
    }
}
