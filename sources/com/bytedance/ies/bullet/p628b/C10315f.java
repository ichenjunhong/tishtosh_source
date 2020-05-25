package com.bytedance.ies.bullet.p628b;

import com.bytedance.ies.bullet.p628b.p633e.C10284d;
import com.bytedance.ies.bullet.p628b.p633e.C10293l;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10271f;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import java.util.List;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.f */
public final class C10315f implements C10250d {

    /* renamed from: a */
    private final C10284d<?, ?, ?, ?> f27718a;

    /* renamed from: b */
    private final C10293l<?, ?> f27719b;

    /* renamed from: c */
    private final List<C10293l<?, ?>> f27720c;

    /* renamed from: d */
    private final C10271f f27721d;

    /* renamed from: e */
    private final List<C10271f> f27722e;

    /* renamed from: f */
    private final List<C52671b<C10326b, List<C10423r>>> f27723f;

    /* renamed from: a */
    public final C10293l<?, ?> mo18280a() {
        return this.f27719b;
    }

    /* renamed from: b */
    public final List<C10293l<?, ?>> mo18281b() {
        return this.f27720c;
    }

    /* renamed from: c */
    public final C10271f mo18282c() {
        return this.f27721d;
    }

    /* renamed from: d */
    public final List<C10271f> mo18283d() {
        return this.f27722e;
    }

    /* renamed from: e */
    public final List<C52671b<C10326b, List<C10423r>>> mo18284e() {
        return this.f27723f;
    }

    public C10315f(C10284d<?, ?, ?, ?> dVar, C10293l<?, ?> lVar, List<? extends C10293l<?, ?>> list, C10271f fVar, List<? extends C10271f> list2, List<? extends C52671b<? super C10326b, ? extends List<? extends C10423r>>> list3) {
        C52711k.m112240b(dVar, "kitApi");
        C52711k.m112240b(list, "kitFactories");
        C52711k.m112240b(list2, "bridgeProviderFactories");
        C52711k.m112240b(list3, "extraParamsProviders");
        this.f27718a = dVar;
        this.f27719b = lVar;
        this.f27720c = list;
        this.f27721d = fVar;
        this.f27722e = list2;
        this.f27723f = list3;
    }
}
