package com.bytedance.android.live.core.rxutils;

import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.core.rxutils.p */
public class C4075p<T> implements C1674ab<T> {
    public void onComplete() {
    }

    public void onError(Throwable th) {
        C52711k.m112240b(th, "e");
    }

    public void onNext(T t) {
    }

    public void onSubscribe(C1690c cVar) {
        C52711k.m112240b(cVar, "d");
    }
}
