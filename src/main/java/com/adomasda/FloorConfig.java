package com.adomasda;

import java.util.Arrays;
import java.util.LinkedList;

class FloorConfig {
    public LinkedList<Object> floors;

    public FloorConfig(Object... floors) {
        this.floors = new LinkedList<>(Arrays.asList(floors));
    }
}