package com.p683ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.FansStruct */
public class FansStruct implements Serializable {
    @C17952c(mo34828a = "fans_level")
    public int fansLevel;
    @C17952c(mo34828a = "fans_name")
    public String fansName;
    @C17952c(mo34828a = "is_fan")
    public boolean isFan;
    @C17952c(mo34828a = "light_up")
    public boolean lightUp;

    public int getFansLevel() {
        return this.fansLevel;
    }

    public String getFansName() {
        return this.fansName;
    }

    public boolean isFan() {
        return this.isFan;
    }

    public boolean isLightUp() {
        return this.lightUp;
    }

    public void setFan(boolean z) {
        this.isFan = z;
    }

    public void setFansLevel(int i) {
        this.fansLevel = i;
    }

    public void setFansName(String str) {
        this.fansName = str;
    }

    public void setLightUp(boolean z) {
        this.lightUp = z;
    }
}
