package com.adomasda;

import java.util.LinkedList;

public abstract class Floor extends FloorWIP {
    public static LinkedList<Integer> workingFloors = new LinkedList<>();

    Floor(FloorConfig floorConfig, int index) {
        super(floorConfig, index);
        workingFloors.add(this.getIndex());
    }
}

