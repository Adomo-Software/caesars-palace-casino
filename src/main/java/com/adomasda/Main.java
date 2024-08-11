package com.adomasda;

import com.adomasda.Casino.*;

public class Main {
    public static void main(String[] args) {
        FloorConfig firstFloorConfig = new FloorConfig(
                GameType.BLACKJACK, GameType.SLOT_MACHINE, ServiceType.SPA);
        FloorConfig secondFloorConfig =
                new FloorConfig(GameType.PACHINKO_MACHINE,
                        GameType.PACHINKO_MACHINE, ServiceType.SHOP);
        AvailableFloor firstFloor = new FirstFloor(firstFloorConfig);
        UnavailableFloor secondFloor = new SecondFloor(new FloorConfig(GameType.PACHINKO_MACHINE));
        AvailableFloor thirdFloor = new ThirdFloor(secondFloorConfig);
        AvailableFloor forthFloor = new FourthFloor(secondFloorConfig);

        Casino casino = new Casino(firstFloor, secondFloor, thirdFloor, forthFloor);

        casino.goToFloor(2); // 1, skipping 2, 3
        casino.goToFloor(1); // 3, 2, 1
        casino.goToFloor(4); // 1, 2, 3, 4

    }
}
