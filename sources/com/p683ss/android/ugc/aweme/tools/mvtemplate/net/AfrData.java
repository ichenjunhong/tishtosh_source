package com.p683ss.android.ugc.aweme.tools.mvtemplate.net;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.AfrData */
public final class AfrData {
    private String algorithm = "";
    @C17952c(mo34828a = "pic_conf")
    private String jsonResult = "";
    private String pic;

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getJsonResult() {
        return this.jsonResult;
    }

    public final String getPic() {
        return this.pic;
    }

    public final void setPic(String str) {
        this.pic = str;
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
