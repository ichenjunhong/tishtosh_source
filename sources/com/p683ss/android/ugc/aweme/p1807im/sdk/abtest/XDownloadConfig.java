package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;

@Keep
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.XDownloadConfig */
public final class XDownloadConfig {
    @C17952c(mo34828a = "enable_preload")
    public final boolean enable_preload;
    @C17952c(mo34828a = "enable_pre_load_friend_count")
    public final int friends_count;

    public static /* synthetic */ XDownloadConfig copy$default(XDownloadConfig xDownloadConfig, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = xDownloadConfig.friends_count;
        }
        if ((i2 & 2) != 0) {
            z = xDownloadConfig.enable_preload;
        }
        return xDownloadConfig.copy(i, z);
    }

    public final int component1() {
        return this.friends_count;
    }

    public final boolean component2() {
        return this.enable_preload;
    }

    public final XDownloadConfig copy(int i, boolean z) {
        return new XDownloadConfig(i, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XDownloadConfig) {
                XDownloadConfig xDownloadConfig = (XDownloadConfig) obj;
                if (this.friends_count == xDownloadConfig.friends_count) {
                    if (this.enable_preload == xDownloadConfig.enable_preload) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getEnable_preload() {
        return this.enable_preload;
    }

    public final int getFriends_count() {
        return this.friends_count;
    }

    public final int hashCode() {
        int i = this.friends_count * 31;
        boolean z = this.enable_preload;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XDownloadConfig(friends_count=");
        sb.append(this.friends_count);
        sb.append(", enable_preload=");
        sb.append(this.enable_preload);
        sb.append(")");
        return sb.toString();
    }

    public XDownloadConfig(int i, boolean z) {
        this.friends_count = i;
        this.enable_preload = z;
    }
}
