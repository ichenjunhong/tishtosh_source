package com.bytedance.ies.bullet.p628b.p643i;

import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: com.bytedance.ies.bullet.b.i.o */
public final class C10420o<T> implements C10387h<T> {

    /* renamed from: a */
    private final Map<Class<?>, C52682m<?, String, ?>> f27829a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<Class<?>, C52686q<?, String, ?, ?>> f27830b = new LinkedHashMap();

    /* renamed from: c */
    private final Class<T> f27831c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParamType: ");
        sb.append(this.f27831c.getCanonicalName());
        return sb.toString();
    }

    public C10420o(Class<T> cls) {
        C52711k.m112240b(cls, "type");
        this.f27831c = cls;
    }

    /* renamed from: a */
    public final <R> C52682m<R, String, T> mo18461a(Class<R> cls) {
        C52711k.m112240b(cls, "inputType");
        C52682m mVar = (C52682m) this.f27829a.get(cls);
        if (mVar == null) {
            return null;
        }
        if (mVar != null) {
            return (C52682m) C52731z.m112265b(mVar, 2);
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.core.params.Parser<R, T> /* = (R, kotlin.String) -> T? */");
    }

    /* renamed from: b */
    public final <R> C52686q<R, String, T, R> mo18464b(Class<R> cls) {
        C52711k.m112240b(cls, "inputType");
        C52686q qVar = (C52686q) this.f27830b.get(cls);
        if (qVar == null) {
            return null;
        }
        if (qVar != null) {
            return (C52686q) C52731z.m112265b(qVar, 3);
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.core.params.Builder<R, T> /* = (R, kotlin.String, T) -> R */");
    }

    /* renamed from: a */
    public final <R> void mo18462a(Class<R> cls, C52682m<? super R, ? super String, ? extends T> mVar) {
        C52711k.m112240b(cls, "inputType");
        C52711k.m112240b(mVar, "parser");
        this.f27829a.put(cls, mVar);
    }

    /* renamed from: a */
    public final <R> void mo18463a(Class<R> cls, C52686q<? super R, ? super String, ? super T, ? extends R> qVar) {
        C52711k.m112240b(cls, "inputType");
        C52711k.m112240b(qVar, "builder");
        this.f27830b.put(cls, qVar);
    }
}
