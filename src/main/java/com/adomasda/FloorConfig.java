package com.adomasda;

import java.util.ArrayList;
import java.util.Arrays;

class FloorConfig {
    public ArrayList<Object> floors;

    public FloorConfig(Object... floors) {
        this.floors = new ArrayList<>(Arrays.asList(floors));
    }
}