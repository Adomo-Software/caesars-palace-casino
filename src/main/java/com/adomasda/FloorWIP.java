package com.adomasda;

public abstract class FloorWIP extends Floor {
    FloorWIP(FloorConfig floorConfig, int index) {
        super(floorConfig, index);
    }

    @Override
    boolean isAccessible() {
        return false;
    }

    @Override
    void enter() {
        System.out.println("This floor is under construction, working floors are: " + FloorWorking.workingFloors);
    }
}