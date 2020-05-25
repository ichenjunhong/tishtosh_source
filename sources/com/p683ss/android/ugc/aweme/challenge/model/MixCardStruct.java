package com.p683ss.android.ugc.aweme.challenge.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.MixCardStruct */
public final class MixCardStruct implements Serializable {
    public static final Companion Companion = new Companion(null);
    @C17952c(mo34828a = "aweme_info")
    private Aweme aweme;
    @C17952c(mo34828a = "room_info")
    private RoomStructV2 roomInfo;
    @C17952c(mo34828a = "type")
    private int type;

    /* renamed from: com.ss.android.ugc.aweme.challenge.model.MixCardStruct$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final RoomStructV2 getRoomInfo() {
        return this.roomInfo;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isLive() {
        if (this.roomInfo != null) {
            return true;
        }
        return false;
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setRoomInfo(RoomStructV2 roomStructV2) {
        this.roomInfo = roomStructV2;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
