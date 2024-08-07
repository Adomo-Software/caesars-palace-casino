package com.adomasda;

import com.adomasda.Casino.*;

public class Main {
    public static void main(String[] args) {
        FloorConfig firstFloorConfig = new FloorConfig(
                GameType.BLACKJACK, GameType.SLOT_MACHINE, ServiceType.SPA);
        FloorConfig secondFloorConfig =
                new FloorConfig(GameType.PACHINKO_MACHINE,
                        GameType.PACHINKO_MACHINE, ServiceType.SHOP);
        Floor firstFloor = new FirstFloor(firstFloorConfig);
        Floor secondFloor = new SecondFloor(secondFloorConfig);
        Floor thirdFloor = new ThirdFloor(secondFloorConfig);
        FloorWIP forthFloor = new FourthFloor(secondFloorConfig);

        Casino casino = new Casino(firstFloor, secondFloor, thirdFloor, forthFloor);

        casino.goToFloor(3);
        casino.goToFloor(1);
        casino.goToFloor(4);

    }
}
