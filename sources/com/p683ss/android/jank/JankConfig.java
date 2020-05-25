package com.p683ss.android.jank;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;

@Keep
/* renamed from: com.ss.android.jank.JankConfig */
public final class JankConfig {
    @C17952c(mo34828a = "collectStack")
    public boolean collectStack = true;
    @C17952c(mo34828a = "isGlobalCollect")
    public boolean isGlobalCollect;
    @C17952c(mo34828a = "isOnline")
    public boolean isOnline = true;
    @C17952c(mo34828a = "isOpen")
    public boolean isOpen;
    @C17952c(mo34828a = "jankThreshold")
    public long jankThreshold = 100;

    public final boolean getCollectStack() {
        return this.collectStack;
    }

    public final long getJankThreshold() {
        return this.jankThreshold;
    }

    public final boolean isGlobalCollect() {
        return this.isGlobalCollect;
    }

    public final boolean isOnline() {
        return this.isOnline;
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    public final void setCollectStack(boolean z) {
        this.collectStack = z;
    }

    public final void setGlobalCollect(boolean z) {
        this.isGlobalCollect = z;
    }

    public final void setJankThreshold(long j) {
        this.jankThreshold = j;
    }

    public final void setOnline(boolean z) {
        this.isOnline = z;
    }

    public final void setOpen(boolean z) {
        this.isOpen = z;
    }
}
