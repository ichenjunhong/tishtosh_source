package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.StreamUrlModel */
public class StreamUrlModel implements Serializable {
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public String f79733id;
    @C17952c(mo34828a = "rtmp_pull_url")
    public String rtmpPullUrl;

    public String getId() {
        return this.f79733id;
    }

    public String getRtmpPullUrl() {
        return this.rtmpPullUrl;
    }

    public void setId(String str) {
        this.f79733id = str;
    }

    public void setRtmpPullUrl(String str) {
        this.rtmpPullUrl = str;
    }
}
