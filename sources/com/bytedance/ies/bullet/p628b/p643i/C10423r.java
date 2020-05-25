package com.bytedance.ies.bullet.p628b.p643i;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: com.bytedance.ies.bullet.b.i.r */
public abstract class C10423r {

    /* renamed from: c */
    public final Map<Class<?>, C52671b<?, C10388i<?>>> f27841c = new LinkedHashMap();

    /* renamed from: a */
    public abstract List<C10385f<?>> mo18322a();

    /* renamed from: a */
    public final <R> void mo18493a(Class<R> cls, R r) {
        C52711k.m112240b(cls, "inputType");
        C52671b bVar = (C52671b) this.f27841c.get(cls);
        if (bVar != null) {
            C10388i iVar = null;
            if (!C52731z.m112264a((Object) bVar, 1)) {
                bVar = null;
            }
            if (bVar != null) {
                iVar = (C10388i) bVar.invoke(r);
            }
            if (iVar != null) {
                for (C10385f a : mo18322a()) {
                    a.mo18455a(iVar.f27812a, iVar.f27813b);
                }
                return;
            }
        }
        for (C10385f a2 : mo18322a()) {
            a2.mo18455a(cls, r);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Object m20983a(C10423r rVar, String str, Object obj, int i, Object obj2) {
        C52711k.m112240b(str, "key");
        for (C10385f fVar : rVar.mo18322a()) {
            if (C52711k.m112239a((Object) fVar.mo18454a(), (Object) str)) {
                return fVar.mo18457b();
            }
        }
        return null;
    }
}
