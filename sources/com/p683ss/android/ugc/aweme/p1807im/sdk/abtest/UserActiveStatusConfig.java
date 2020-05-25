package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;

@Keep
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.UserActiveStatusConfig */
public final class UserActiveStatusConfig {
    @C17952c(mo34828a = "delay")
    public final int activeDelay;
    @C17952c(mo34828a = "im_heartbeat")
    public final int pullDuration;
    @C17952c(mo34828a = "heartbeat")
    public final int reportDuration;

    public static /* synthetic */ UserActiveStatusConfig copy$default(UserActiveStatusConfig userActiveStatusConfig, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = userActiveStatusConfig.activeDelay;
        }
        if ((i4 & 2) != 0) {
            i2 = userActiveStatusConfig.reportDuration;
        }
        if ((i4 & 4) != 0) {
            i3 = userActiveStatusConfig.pullDuration;
        }
        return userActiveStatusConfig.copy(i, i2, i3);
    }

    public final int component1() {
        return this.activeDelay;
    }

    public final int component2() {
        return this.reportDuration;
    }

    public final int component3() {
        return this.pullDuration;
    }

    public final UserActiveStatusConfig copy(int i, int i2, int i3) {
        return new UserActiveStatusConfig(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserActiveStatusConfig) {
                UserActiveStatusConfig userActiveStatusConfig = (UserActiveStatusConfig) obj;
                if (this.activeDelay == userActiveStatusConfig.activeDelay) {
                    if (this.reportDuration == userActiveStatusConfig.reportDuration) {
                        if (this.pullDuration == userActiveStatusConfig.pullDuration) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getActiveDelay() {
        return this.activeDelay;
    }

    public final int getPullDuration() {
        return this.pullDuration;
    }

    public final int getReportDuration() {
        return this.reportDuration;
    }

    public final int hashCode() {
        return (((this.activeDelay * 31) + this.reportDuration) * 31) + this.pullDuration;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserActiveStatusConfig(activeDelay=");
        sb.append(this.activeDelay);
        sb.append(", reportDuration=");
        sb.append(this.reportDuration);
        sb.append(", pullDuration=");
        sb.append(this.pullDuration);
        sb.append(")");
        return sb.toString();
    }

    public UserActiveStatusConfig(int i, int i2, int i3) {
        this.activeDelay = i;
        this.reportDuration = i2;
        this.pullDuration = i3;
    }
}
