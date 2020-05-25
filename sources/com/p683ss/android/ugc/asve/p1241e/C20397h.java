package com.p683ss.android.ugc.asve.p1241e;

import android.os.Handler;
import android.os.Looper;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.e.h */
public final class C20397h {

    /* renamed from: a */
    private static final Handler f55927a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static final void m50605a(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "action");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
        if (C52711k.m112239a((Object) currentThread, (Object) mainLooper.getThread())) {
            aVar.invoke();
        } else {
            f55927a.post(new C20398i(aVar));
        }
    }
}
