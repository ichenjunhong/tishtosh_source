package com.p683ss.android.ugc.aweme.sticker.data;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.BaseTrackTimeStamp */
public class BaseTrackTimeStamp implements Serializable {
    public static final int FULL_TRACK = -1;
    @C17952c(mo34828a = "p")
    private int pts = -1;

    public int getPts() {
        return this.pts;
    }

    public BaseTrackTimeStamp() {
    }

    public boolean isFullTrack() {
        if (-1 == this.pts) {
            return true;
        }
        return false;
    }

    public void setPts(int i) {
        this.pts = i;
    }

    public BaseTrackTimeStamp(int i) {
        this.pts = i;
    }
}
