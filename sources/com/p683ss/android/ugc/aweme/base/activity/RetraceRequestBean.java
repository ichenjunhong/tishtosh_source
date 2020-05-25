package com.p683ss.android.ugc.aweme.base.activity;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.base.activity.RetraceRequestBean */
public class RetraceRequestBean {
    @C17952c(mo34828a = "mapping_url")
    private String mappingUrl;
    private String stack;

    public String getMappingUrl() {
        return this.mappingUrl;
    }

    public String getStack() {
        return this.stack;
    }

    public void setMappingUrl(String str) {
        this.mappingUrl = str;
    }

    public void setStack(String str) {
        this.stack = str;
    }

    public RetraceRequestBean(String str, String str2) {
        this.stack = str;
        this.mappingUrl = str2;
    }
}
