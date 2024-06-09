package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreatorMain {
    public static void main(String[] args) {
        List<String> sourceList = new ArrayList<>();
        sourceList.add("The");
        sourceList.add("ArrayList");
        sourceList.add("class");
        sourceList.add("has");
        sourceList.add("many");
        sourceList.add("useful");
        sourceList.add("methods");

        ArrayListCreator arrayListCreator = new ArrayListCreator();
        System.out.println(arrayListCreator.createArrayList(sourceList));
    }
}
