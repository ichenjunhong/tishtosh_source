package com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1894b;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.b.c */
public final class C35217c {

    /* renamed from: a */
    public C35217c f90505a;

    /* renamed from: b */
    public final C35218d f90506b;

    /* renamed from: c */
    public final Long f90507c;

    /* renamed from: d */
    public final Integer f90508d;

    /* renamed from: e */
    public final String f90509e;

    private C35217c(C35218d dVar, Long l, Integer num, String str) {
        C52711k.m112240b(dVar, "type");
        this.f90506b = dVar;
        this.f90507c = l;
        this.f90508d = num;
        this.f90509e = str;
    }

    public /* synthetic */ C35217c(C35218d dVar, Long l, Integer num, String str, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        this(dVar, l, num, str);
    }
}
