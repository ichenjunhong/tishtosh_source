package com.p683ss.android.ugc.aweme.commerce.service.models;

import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.a */
public final class C25553a implements Serializable {

    /* renamed from: a */
    private long f67527a;

    /* renamed from: b */
    private String f67528b = "";

    /* renamed from: c */
    private String f67529c = "";

    /* renamed from: d */
    private long f67530d;

    public final String getAdExtraData() {
        return this.f67529c;
    }

    public final long getCreativeId() {
        return this.f67527a;
    }

    public final long getGroupId() {
        return this.f67530d;
    }

    public final String getLogExtra() {
        return this.f67528b;
    }

    public final void setCreativeId(long j) {
        this.f67527a = j;
    }

    public final void setGroupId(long j) {
        this.f67530d = j;
    }

    public final void setAdExtraData(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f67529c = str;
    }

    public final void setLogExtra(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f67528b = str;
    }
}
