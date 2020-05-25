package com.p683ss.android.ugc.aweme.discover.model;

import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.BarrageBean */
public final class BarrageBean {
    public final String cid;

    /* renamed from: id */
    public int f74681id;
    public final String name;
    public final String text;
    public final long time;
    public final int type;

    public BarrageBean(String str, int i, int i2, String str2, String str3, long j) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(str2, "text");
        C52711k.m112240b(str3, "cid");
        this.name = str;
        this.type = i;
        this.f74681id = i2;
        this.text = str2;
        this.cid = str3;
        this.time = j;
    }
}
