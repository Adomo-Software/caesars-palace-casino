package com.adomasda;

public abstract class Floor {
    FloorConfig floorConfig;

    private int index;

    Floor(FloorConfig floorConfig, int index) {
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
