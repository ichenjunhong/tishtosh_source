package com.p683ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.RoomExtra */
public class RoomExtra implements Serializable {
    @C17952c(mo34828a = "config")
    public RoomConfig config;
    @C17952c(mo34828a = "with_promotion")
    public boolean withPromotion;

    public RoomConfig getConfig() {
        return this.config;
    }

    public void setConfig(RoomConfig roomConfig) {
        this.config = roomConfig;
    }
}
