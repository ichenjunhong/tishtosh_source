package com.bytedance.opensdk.core.base.p807b;

import com.bytedance.opensdk.core.base.p807b.C12500a;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.core.base.b.b */
public abstract class C12501b<T extends C12500a> {
    @C17952c(mo34828a = "message")

    /* renamed from: b */
    public final String f32827b;
    @C17952c(mo34828a = "data")

    /* renamed from: c */
    public final T f32828c;

    /* renamed from: b */
    public final String mo23525b() {
        return this.f32828c.mo23523a();
    }

    /* renamed from: a */
    public final boolean mo23524a() {
        return C52711k.m112239a((Object) this.f32827b, (Object) "success");
    }

    public C12501b(String str, T t) {
        C52711k.m112240b(str, "message");
        C52711k.m112240b(t, "data");
        this.f32827b = str;
        this.f32828c = t;
    }
}
