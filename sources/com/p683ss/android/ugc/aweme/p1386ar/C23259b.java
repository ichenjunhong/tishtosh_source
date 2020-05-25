package com.p683ss.android.ugc.aweme.p1386ar;

import com.bytedance.retrofit2.C12796s;
import java.util.HashMap;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ar.b */
public final class C23259b extends C12796s {

    /* renamed from: C */
    public final HashMap<String, Long> f62191C = new HashMap<>();

    /* renamed from: D */
    public final HashMap<String, Long> f62192D = new HashMap<>();

    /* renamed from: E */
    public final HashMap<String, Long> f62193E = new HashMap<>();

    /* renamed from: F */
    public long f62194F;

    /* renamed from: G */
    public long f62195G;

    /* renamed from: H */
    public String f62196H = "";

    /* renamed from: I */
    public long f62197I;

    /* renamed from: J */
    public long f62198J;

    /* renamed from: K */
    public long f62199K;

    /* renamed from: L */
    public long f62200L;

    /* renamed from: a */
    public final void mo48195a(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f62196H = str;
    }

    public C23259b(long j, long j2) {
        super(j, j2);
    }

    /* renamed from: b */
    public final void mo48197b(String str, long j) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        this.f62192D.put(str, Long.valueOf(j));
    }

    /* renamed from: c */
    public final void mo48198c(String str, long j) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        this.f62193E.put(str, Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo48196a(String str, long j) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        Long l = (Long) this.f62191C.get(str);
        if (l == null) {
            l = Long.valueOf(0);
        }
        C52711k.m112236a((Object) l, "interceptorDurations.get(name) ?: 0");
        this.f62191C.put(str, Long.valueOf(j + l.longValue()));
    }
}
