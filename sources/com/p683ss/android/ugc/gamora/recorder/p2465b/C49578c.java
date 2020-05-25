package com.p683ss.android.ugc.gamora.recorder.p2465b;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.b.c */
public final class C49578c {

    /* renamed from: a */
    public boolean f124355a;

    /* renamed from: b */
    public final Object f124356b;

    /* renamed from: c */
    public final Object f124357c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomTabIndexChangeEvent{fromTag=");
        sb.append(this.f124356b);
        sb.append(", toTag=");
        sb.append(this.f124357c);
        sb.append('}');
        return sb.toString();
    }

    public C49578c(Object obj, Object obj2) {
        C52711k.m112240b(obj2, "tag");
        this.f124356b = obj;
        this.f124357c = obj2;
    }
}
