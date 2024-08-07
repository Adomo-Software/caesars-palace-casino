package com.adomasda;

import java.util.Arrays;
import java.util.LinkedList;

enum GameType {
    POKER,
    PACHINKO_MACHINE,
    SLOT_MACHINE,
    BLACKJACK
}

enum ServiceType {
    BAR,
    SPA,
    SHOP
}

class FloorConfig {
    public LinkedList<Object> items;

    public FloorConfig(Object... elements) {
        items = new LinkedList<>(Arrays.asList(elements));
    }
}

abstract class Floor {
    FloorConfig floorConfig;

    private int index;

    Floor(FloorConfig floorConfig, int index) {
        this.floorConfig = floorConfig;
        this.index = index;
    }

    public boolean addItem(Object item) {
        return floorConfig.items.add(item);
    }

    public int getIndex() {return this.index;}

    abstract void enter();
}

class FirstFloor extends Floor {
    FirstFloor(FloorConfig floorConfig) {
        super(floorConfig, 1);
    }

    @Override
    void enter() {
        System.out.println("Entering First Floor with items: " + floorConfig.items);
    }
}

class SecondFloor extends Floor {
    SecondFloor(FloorConfig floorConfig) {
        super(floorConfig, 2);
    }

    @Override
    void enter() {
        System.out.println("Entering Floor with items: " + floorConfig.items);
    }
}

class ThirdFloor extends Floor {
    ThirdFloor(FloorConfig floorConfig) {
        super(floorConfig, 3);
    }

    @Override
    void enter() {
        System.out.println("Entering Third Floor with items: " + floorConfig.items);
    }
}

class FourthFloor extends Floor {
    FourthFloor(FloorConfig floorConfig) {
        super(floorConfig, 4);
    }

    @Override
    void enter() {
        System.out.println("Entering Third Fourth with items: " + floorConfig.items);
    }
}


interface Elevator {
    void goToFloor(int floorNumber);
}

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
            System.out.println("Passing floor: " + floors.get(currentIndex).getIndex());
            currentIndex++;
        }
        while (currentIndex > floorNumber) {
            System.out.println("Passing floor: " + floors.get(currentIndex).getIndex());
            currentIndex--;
        }
        currentFloor = floors.get(floorNumber);
        currentFloor.enter();
    }
}