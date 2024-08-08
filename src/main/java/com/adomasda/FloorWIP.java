package com.adomasda;

import java.util.LinkedList;

public abstract class FloorWIP extends Floor {
    public static LinkedList<Integer> WIPfloors = new LinkedList<>();

    FloorWIP(FloorConfig floorConfig, int index) {
        super(floorConfig, index);
        WIPfloors.add(this.getIndex());
    }
}