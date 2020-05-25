package com.p683ss.android.ugc.aweme.utils;

import android.arch.lifecycle.C0198r;
import android.os.Looper;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.df */
public final class C47808df {
    /* renamed from: a */
    public static final <T> void m103446a(C0198r<T> rVar, T t) {
        C52711k.m112240b(rVar, "$this$threadSoftValue");
        if (C52711k.m112239a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            rVar.setValue(t);
        } else {
            rVar.postValue(t);
        }
    }
}
