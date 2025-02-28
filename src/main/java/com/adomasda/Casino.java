package com.adomasda;

import java.util.Arrays;
import java.util.ArrayList;

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

    private ArrayList<Floor> floors;
    private Floor currentFloor;

    public Casino(Floor... floors) {
        this.floors = new ArrayList<>(Arrays.asList(floors));
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
        while (!floors.get(currentIndex).isAccessible()) {
            floors.get(currentIndex).enter();
            currentIndex++;
        }
        floors.get(currentIndex).enter();
        currentFloor = floors.get(currentIndex);
    }

    static class FirstFloor extends AvailableFloor {
        FirstFloor(FloorConfig floorConfig) {
            super(floorConfig, 1);
        }

        @Override
        void enter() {
            System.out.println(
                    "Entering First Floor with floors: " + floorConfig.floors);
        }
    }

    static class SecondFloor extends UnavailableFloor {
        SecondFloor(FloorConfig floorConfig) {
            super(floorConfig, 2);
        }
    }

    static class ThirdFloor extends AvailableFloor {
        ThirdFloor(FloorConfig floorConfig) {
            super(floorConfig, 3);
        }

        @Override
        void enter() {
            System.out.println(
                    "Entering Third Floor with floors: " + floorConfig.floors);
        }
    }

    static class FourthFloor extends AvailableFloor {
        FourthFloor(FloorConfig floorConfig) {
            super(floorConfig, 4);
        }

        @Override
        void enter() {
            System.out.println(
                    "Entering Fourth Floor with floors: " + floorConfig.floors);
        }
    }
}