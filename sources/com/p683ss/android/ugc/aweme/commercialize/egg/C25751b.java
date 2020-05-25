package com.p683ss.android.ugc.aweme.commercialize.egg;

import java.util.concurrent.atomic.AtomicBoolean;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b */
public final class C25751b {

    /* renamed from: a */
    public final String f68094a;

    /* renamed from: b */
    public final String f68095b;

    /* renamed from: c */
    public final C25743a f68096c;

    /* renamed from: d */
    public final boolean f68097d;

    /* renamed from: e */
    public final AtomicBoolean f68098e;

    /* renamed from: f */
    public C25779f f68099f;

    /* renamed from: g */
    public C25772e f68100g;

    private C25751b(String str, String str2, C25743a aVar, boolean z, AtomicBoolean atomicBoolean, C25779f fVar, C25772e eVar) {
        C52711k.m112240b(str, "materialUrl");
        C52711k.m112240b(str2, "fileType");
        C52711k.m112240b(atomicBoolean, "preloadSuccess");
        this.f68094a = str;
        this.f68095b = str2;
        this.f68096c = aVar;
        this.f68097d = z;
        this.f68098e = atomicBoolean;
        this.f68099f = fVar;
        this.f68100g = eVar;
    }

    public /* synthetic */ C25751b(String str, String str2, C25743a aVar, boolean z, AtomicBoolean atomicBoolean, C25779f fVar, C25772e eVar, int i, C52707g gVar) {
        this(str, str2, aVar, z, new AtomicBoolean(false), null, eVar);
    }
}
