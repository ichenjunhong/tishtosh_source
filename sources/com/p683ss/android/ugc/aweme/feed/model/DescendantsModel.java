package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.DescendantsModel */
public class DescendantsModel implements Serializable {
    @C17952c(mo34828a = "notify_msg")
    public String notifyMsg;
    @C17952c(mo34828a = "platforms")
    public List<String> platforms;

    public String getNotifyMsg() {
        return this.notifyMsg;
    }

    public List<String> getPlatforms() {
        return this.platforms;
    }

    public void setNotifyMsg(String str) {
        this.notifyMsg = str;
    }

    public void setPlatforms(List<String> list) {
        this.platforms = list;
    }
}
