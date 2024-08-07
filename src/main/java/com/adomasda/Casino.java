package com.adomasda;

import java.util.Arrays;
import java.util.LinkedList;

class Casino implements Elevator {
    private LinkedList<Floor> floors;
    private Floor currentFloor;

    public Casino(Floor... floors) {
        this.floors = new LinkedList<>(Arrays.asList(floors));
        this.currentFloor = this.floors.get(0);
    }

    public boolean addFloor(Floor floor) {
        return floors.add(floor);
    }

    public void goToFloor(int floorNumber) {
        if (floorNumber <= 0) {
            System.err.println("Enter a positive floor number");
        }
        floorNumber--;
        int currentIndex = floors.indexOf(currentFloor);
        while (currentIndex < floorNumber) {
            System.out.println(
                    "Passing floor: " + floors.get(currentIndex).getIndex());
            currentIndex++;
        }
        while (currentIndex > floorNumber) {
            System.out.println(
                    "Passing floor: " + floors.get(currentIndex).getIndex());
            currentIndex--;
        }
        currentFloor = floors.get(floorNumber);
        currentFloor.enter();
    }
}