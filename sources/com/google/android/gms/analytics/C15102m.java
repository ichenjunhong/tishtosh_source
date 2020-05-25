package com.google.android.gms.analytics;

import android.net.Uri;
import com.google.android.gms.common.internal.C15464q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.analytics.m */
final class C15102m implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15095i f38980a;

    /* renamed from: b */
    private final /* synthetic */ C15098l f38981b;

    C15102m(C15098l lVar, C15095i iVar) {
        this.f38981b = lVar;
        this.f38980a = iVar;
    }

    public final void run() {
        this.f38980a.f38957a.mo27829a(this.f38980a);
        Iterator it = this.f38981b.f38973b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        C15098l lVar = this.f38981b;
        C15095i iVar = this.f38980a;
        C15464q.m32136c("deliver should be called from worker thread");
        C15464q.m32134b(iVar.f38958b, "Measurement must be submitted");
        List<C15104o> list = iVar.f38963g;
        if (!list.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (C15104o oVar : list) {
                Uri a = oVar.mo27832a();
                if (!hashSet.contains(a)) {
                    hashSet.add(a);
                    oVar.mo27833a(iVar);
                }
            }
        }
    }
}
