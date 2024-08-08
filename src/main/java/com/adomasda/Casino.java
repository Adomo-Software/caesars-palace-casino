package com.adomasda;

import java.util.Arrays;
import java.util.LinkedList;

class Casino implements Elevator {
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

    static class FirstFloor extends FloorWorking {
        FirstFloor(FloorConfig floorConfig) {
            super(floorConfig, 1);
        }

        @Override
        void enter() {
            System.out.println(
                    "Entering First Floor with floors: " + floorConfig.floors);
        }
    }

    static class SecondFloor extends FloorWorking {
        SecondFloor(FloorConfig floorConfig) {
            super(floorConfig, 2);
        }

        @Override
        void enter() {
            System.out.println(
                    "Entering Floor with floors: " + floorConfig.floors);
        }
    }

    static class ThirdFloor extends FloorWorking {
        ThirdFloor(FloorConfig floorConfig) {
            super(floorConfig, 3);
        }

        @Override
        void enter() {
            System.out.println(
                    "Entering Third Floor with floors: " + floorConfig.floors);
        }
    }

    static class FourthFloor extends FloorWIP {
        FourthFloor(FloorConfig floorConfig) {
            super(floorConfig, 4);
        }

        @Override
        void enter() {
            System.out.println("This floor is under construction, working floors are: " + FloorWorking.workingFloors);
        }
    }
}