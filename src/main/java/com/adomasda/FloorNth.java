package com.adomasda;

public class FloorNth {
    static class FirstFloor extends Floor {
        FirstFloor(FloorConfig floorConfig) {
            super(floorConfig, 1);
        }

        @Override
        void enter() {
            System.out.println(
                    "Entering First Floor with items: " + floorConfig.items);
        }
    }

    static class SecondFloor extends Floor {
        SecondFloor(FloorConfig floorConfig) {
            super(floorConfig, 2);
        }

        @Override
        void enter() {
            System.out.println(
                    "Entering Floor with items: " + floorConfig.items);
        }
    }

    static class ThirdFloor extends Floor {
        ThirdFloor(FloorConfig floorConfig) {
            super(floorConfig, 3);
        }

        @Override
        void enter() {
            System.out.println(
                    "Entering Third Floor with items: " + floorConfig.items);
        }
    }

    static class FourthFloor extends Floor {
        FourthFloor(FloorConfig floorConfig) {
            super(floorConfig, 4);
        }

        @Override
        void enter() {
            System.out.println(
                    "Entering Third Fourth with items: " + floorConfig.items);
        }
    }
}