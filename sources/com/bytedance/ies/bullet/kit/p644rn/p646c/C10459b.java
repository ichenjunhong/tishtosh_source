package com.bytedance.ies.bullet.kit.p644rn.p646c;

import android.net.Uri.Builder;
import com.bytedance.ies.bullet.kit.p644rn.p646c.C10459b;
import com.bytedance.ies.bullet.kit.p644rn.p646c.C10460c;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10579b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.kit.rn.c.b */
public abstract class C10459b<T extends C10459b<T, S>, S extends C10460c> extends C10579b<T, S> {
    public C10459b() {
        Builder scheme = new Builder().scheme("react-native");
        C52711k.m112236a((Object) scheme, "Uri.Builder().scheme(\"react-native\")");
        super(scheme);
    }

    /* renamed from: a */
    public final T mo18521a(String str) {
        C52711k.m112240b(str, "channel");
        ((C10460c) mo18387a()).f27861b.mo18456a(str);
        return this;
    }

    /* renamed from: b */
    public final T mo18522b(String str) {
        C52711k.m112240b(str, "bundle");
        ((C10460c) mo18387a()).f27862d.mo18456a(str);
        return this;
    }

    /* renamed from: c */
    public final T mo18523c(String str) {
        C52711k.m112240b(str, "moduleName");
        ((C10460c) mo18387a()).f27863e.mo18456a(str);
        return this;
    }
}
