package com.adomasda;

import java.util.Arrays;
import java.util.LinkedList;

class FloorConfig {
    public LinkedList<Object> items;

    public FloorConfig(Object... elements) {
        items = new LinkedList<>(Arrays.asList(elements));
    }
}