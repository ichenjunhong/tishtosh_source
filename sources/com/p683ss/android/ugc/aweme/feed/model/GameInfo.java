package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.GameInfo */
public class GameInfo implements Serializable {
    @C17952c(mo34828a = "game_score")
    public int gameScore;
    @C17952c(mo34828a = "game_type")
    public int gameType;

    public int getGameScore() {
        return this.gameScore;
    }

    public int getGameType() {
        return this.gameType;
    }

    public void setGameScore(int i) {
        this.gameScore = i;
    }

    public void setGameType(int i) {
        this.gameType = i;
    }
}
