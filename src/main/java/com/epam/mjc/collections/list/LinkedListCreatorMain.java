package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCreatorMain {
    public static void main(String[] args) {
        List<Integer> sourceList = new ArrayList<>();
        sourceList.add(2);
        sourceList.add(14);
        sourceList.add(3);
        sourceList.add(6);
        sourceList.add(5);
        sourceList.add(7);
        LinkedListCreator linkedListCreator = new LinkedListCreator();
        System.out.println(linkedListCreator.createLinkedList(sourceList));
    }
}
