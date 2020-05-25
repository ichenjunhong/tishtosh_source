package com.p683ss.android.ugc.aweme.setting.model;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.setting.model.ShareMode */
public final class ShareMode {
    @C17952c(mo34828a = "mode")
    public int mode;
    @C17952c(mo34828a = "scenario")
    public int scenario;

    public ShareMode() {
        this(0, 0, 3, null);
    }

    public static /* synthetic */ ShareMode copy$default(ShareMode shareMode, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = shareMode.scenario;
        }
        if ((i3 & 2) != 0) {
            i2 = shareMode.mode;
        }
        return shareMode.copy(i, i2);
    }

    public final ShareMode copy(int i, int i2) {
        return new ShareMode(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShareMode) {
                ShareMode shareMode = (ShareMode) obj;
                if (this.scenario == shareMode.scenario) {
                    if (this.mode == shareMode.mode) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.scenario * 31) + this.mode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareMode(scenario=");
        sb.append(this.scenario);
        sb.append(", mode=");
        sb.append(this.mode);
        sb.append(")");
        return sb.toString();
    }

    public ShareMode(int i, int i2) {
        this.scenario = i;
        this.mode = i2;
    }

    public /* synthetic */ ShareMode(int i, int i2, int i3, C52707g gVar) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        this(i, i2);
    }
}
