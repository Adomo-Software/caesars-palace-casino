package com.adomasda;

import java.util.ArrayList;
import java.util.List;

enum GameType {
    POKER,
    PACHINKO_MACHINE,
    SLOT_MACHINE,
    BLACKJACK
}

class GamingArea {
    List<GameType> games;
    GamingArea () {
        this.games = new ArrayList<>();
    }

    private boolean addGame(GameType game) {
        return this.games.add(game);
    }
    private boolean deleteGame(GameType game) {
        return this.games.remove(game);
    }
}

public class Casino {
    private boolean isRigged;

    public boolean isItRigged() {
        return isRigged;
    }

    public void setRigged(boolean isRigged) {
        this.isRigged = isRigged;
    }
}
