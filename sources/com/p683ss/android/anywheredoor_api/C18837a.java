package com.p683ss.android.anywheredoor_api;

import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.anywheredoor_api.a */
public final class C18837a implements Serializable {

    /* renamed from: a */
    private String f52013a;

    /* renamed from: b */
    private String f52014b;

    /* renamed from: c */
    private String f52015c;

    public final String getChannelDes() {
        return this.f52014b;
    }

    public final String getChannelName() {
        return this.f52013a;
    }

    public final String getChannelPath() {
        return this.f52015c;
    }

    public final void setChannelPath(String str) {
        this.f52015c = str;
    }

    public final void setChannelDes(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f52014b = str;
    }

    public final void setChannelName(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f52013a = str;
    }

    public C18837a(String str, String str2, String str3) {
        C52711k.m112240b(str, "channelName");
        C52711k.m112240b(str2, "channelDes");
        this.f52013a = str;
        this.f52014b = str2;
        this.f52015c = str3;
    }
}
