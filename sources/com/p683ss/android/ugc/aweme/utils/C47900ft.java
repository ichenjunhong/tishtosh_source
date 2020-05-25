package com.p683ss.android.ugc.aweme.utils;

import android.os.Handler;
import android.os.Looper;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.ft */
public final class C47900ft {

    /* renamed from: a */
    private static final Handler f120493a = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m103619a(long j, C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "action");
        if (j <= 0) {
            Thread currentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
            if (C52711k.m112239a((Object) currentThread, (Object) mainLooper.getThread())) {
                aVar.invoke();
            } else {
                f120493a.post(new C47901fu(aVar));
            }
        } else {
            f120493a.postDelayed(new C47901fu(aVar), j);
        }
    }
}
