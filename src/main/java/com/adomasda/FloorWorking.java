package com.adomasda;

import java.util.LinkedList;

public abstract class FloorWorking extends Floor {
    public static LinkedList<Integer> workingFloors = new LinkedList<>();

    FloorWorking(FloorConfig floorConfig, int index) {
        super(floorConfig, index);
        workingFloors.add(this.getIndex());
    }
}

