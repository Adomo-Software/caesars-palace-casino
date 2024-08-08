package com.adomasda;

import com.adomasda.Casino.*;

public class Main {
    public static void main(String[] args) {
        FloorConfig firstFloorConfig = new FloorConfig(
                GameType.BLACKJACK, GameType.SLOT_MACHINE, ServiceType.SPA);
        FloorConfig secondFloorConfig =
                new FloorConfig(GameType.PACHINKO_MACHINE,
                        GameType.PACHINKO_MACHINE, ServiceType.SHOP);
        FloorWorking firstFloor = new FirstFloor(firstFloorConfig);
        FloorWorking secondFloor = new SecondFloor(secondFloorConfig);
        FloorWorking thirdFloor = new ThirdFloor(secondFloorConfig);
        FloorWIP forthFloor = new FourthFloor(secondFloorConfig);

        Casino casino = new Casino(firstFloor, secondFloor, thirdFloor, forthFloor);

        casino.goToFloor(3);
        casino.goToFloor(1);
        casino.goToFloor(4);

    }
}
