package com.p683ss.android.ugc.aweme.feed.model.livesplash;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo */
public final class LiveAwesomeSplashInfo implements Serializable {
    @C17952c(mo34828a = "end_time")
    public long endTime;
    @C17952c(mo34828a = "feed_show_time")
    public int feedShowTime;
    public boolean hasShown;
    @C17952c(mo34828a = "is_topview_data")
    public boolean isTopViewData;
    @C17952c(mo34828a = "live_info")
    public String liveData;
    @C17952c(mo34828a = "start_time")
    public long startTime;
    @C17952c(mo34828a = "topview_valid")
    public boolean topviewValid = true;

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getFeedShowTime() {
        return this.feedShowTime;
    }

    public final boolean getHasShown() {
        return this.hasShown;
    }

    public final String getLiveData() {
        return this.liveData;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean getTopviewValid() {
        return this.topviewValid;
    }

    public final boolean isTopViewData() {
        return this.isTopViewData;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setFeedShowTime(int i) {
        this.feedShowTime = i;
    }

    public final void setHasShown(boolean z) {
        this.hasShown = z;
    }

    public final void setLiveData(String str) {
        this.liveData = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setTopViewData(boolean z) {
        this.isTopViewData = z;
    }

    public final void setTopviewValid(boolean z) {
        this.topviewValid = z;
    }
}
