package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.PlatformInfo */
public class PlatformInfo implements Serializable {
    @C17952c(mo34828a = "full_synced")
    public boolean fullSynced;
    @C17952c(mo34828a = "nickname")
    public String nickName;
    @C17952c(mo34828a = "platform_name")
    public String patformName;

    public String getNickName() {
        return this.nickName;
    }

    public String getPatformName() {
        return this.patformName;
    }

    public boolean isFullSynced() {
        return this.fullSynced;
    }

    public void setFullSynced(boolean z) {
        this.fullSynced = z;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setPatformName(String str) {
        this.patformName = str;
    }
}
