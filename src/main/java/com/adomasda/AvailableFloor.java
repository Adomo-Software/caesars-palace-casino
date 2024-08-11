package com.adomasda;

import java.util.ArrayList;

public abstract class AvailableFloor extends Floor {
    public static ArrayList<Integer> availableFloors = new ArrayList<>();

    AvailableFloor(FloorConfig floorConfig, int index) {
        super(floorConfig, index);
        availableFloors.add(this.getIndex());
    }

    boolean isAccessible() {
//        workingFloors.next
        return true;
    }
}

