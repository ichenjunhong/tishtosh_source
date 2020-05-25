package com.p683ss.android.ugc.aweme.tools.mvtemplate.net;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.VideoItem */
public final class VideoItem {
    private String algorithm = "";
    private String content;
    @C17952c(mo34828a = "video_conf")
    private String jsonResult = "";

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getJsonResult() {
        return this.jsonResult;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setAlgorithm(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.algorithm = str;
    }

    public final void setJsonResult(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.jsonResult = str;
    }
}
