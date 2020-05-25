package com.bytedance.ies.bullet.p628b;

import com.bytedance.ies.bullet.p628b.p633e.C10284d;
import com.bytedance.ies.bullet.p628b.p633e.C10286e;
import com.bytedance.ies.bullet.p628b.p633e.C10288g;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.C10293l;
import com.bytedance.ies.bullet.p628b.p633e.C10294m;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10271f;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.g */
public final class C10323g implements C10253e {

    /* renamed from: a */
    private final Map<Class<C10284d<?, ?, ?, ?>>, C10293l<?, ?>> f27732a = new LinkedHashMap();

    /* renamed from: b */
    private final C10271f f27733b;

    /* renamed from: c */
    private final C10326b f27734c;

    /* renamed from: d */
    private final C52671b<C10326b, List<C10423r>> f27735d;

    /* renamed from: a */
    public final C10271f mo18287a() {
        return this.f27733b;
    }

    /* renamed from: b */
    public final C52671b<C10326b, List<C10423r>> mo18290b() {
        return this.f27735d;
    }

    /* renamed from: c */
    public final C10326b mo18291c() {
        return this.f27734c;
    }

    /* renamed from: a */
    public final <S extends C10284d<? extends T, ? extends U, ? extends V, ? extends X>, T extends C10294m, U extends C10286e, V extends C10290i, X extends C10288g> C10293l<T, U> mo18288a(Class<? extends S> cls) {
        C52711k.m112240b(cls, "apiClass");
        C10293l<T, U> lVar = (C10293l) this.f27732a.get(cls);
        if (lVar == null) {
            return null;
        }
        if (lVar != null) {
            return lVar;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.IKitPackageProviderFactory<out T, out U>");
    }

    /* renamed from: a */
    public final <S extends C10284d<? extends T, ? extends U, ? extends V, ? extends X>, T extends C10294m, U extends C10286e, V extends C10290i, X extends C10288g> void mo18289a(Class<? extends S> cls, C10293l<? extends T, ? extends U> lVar) {
        C52711k.m112240b(cls, "apiClass");
        C52711k.m112240b(lVar, "kitFactory");
        this.f27732a.put(cls, lVar);
    }

    public C10323g(C10271f fVar, C10326b bVar, C52671b<? super C10326b, ? extends List<? extends C10423r>> bVar2) {
        C52711k.m112240b(fVar, "bridgeProviderFactory");
        C52711k.m112240b(bVar, "contextProviderFactory");
        C52711k.m112240b(bVar2, "extraParamsProvider");
        this.f27733b = fVar;
        this.f27734c = bVar;
        this.f27735d = bVar2;
    }
}
