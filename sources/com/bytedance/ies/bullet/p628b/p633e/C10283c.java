package com.bytedance.ies.bullet.p628b.p633e;

import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.ies.bullet.p628b.p633e.C10278b;
import com.bytedance.ies.bullet.p628b.p633e.C10283c;
import com.bytedance.ies.bullet.p628b.p643i.C10452u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.e.c */
public abstract class C10283c<T extends C10283c<T, S>, S extends C10278b> extends C10452u<T, S> {
    public C10283c(Builder builder) {
        C52711k.m112240b(builder, "uriBuilder");
        super(builder);
    }

    /* renamed from: a */
    public final T mo18327a(Uri uri) {
        C52711k.m112240b(uri, "fallbackUri");
        ((C10278b) mo18387a()).f27675a.mo18456a(uri);
        return this;
    }
}
