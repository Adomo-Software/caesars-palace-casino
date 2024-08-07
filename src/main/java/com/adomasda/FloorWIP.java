package com.adomasda;

import java.util.LinkedList;

public abstract class FloorWIP {
    FloorConfig floorConfig;

    private int index;

    FloorWIP(FloorConfig floorConfig, int index) {
        this.floorConfig = floorConfig;
        this.index = index;
    }

    public boolean addItem(Object item) {
        return floorConfig.floors.add(item);
    }

    public int getIndex() {
        return this.index;
    }

    abstract void enter();
}
