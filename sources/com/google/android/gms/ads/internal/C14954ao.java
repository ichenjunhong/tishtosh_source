package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.zzyv;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.ads.internal.ao */
final class C14954ao implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f38554a;

    /* renamed from: b */
    private final /* synthetic */ C14953an f38555b;

    C14954ao(C14953an anVar, WeakReference weakReference) {
        this.f38555b = anVar;
        this.f38554a = weakReference;
    }

    public final void run() {
        this.f38555b.f38549b = false;
        C14939a aVar = (C14939a) this.f38554a.get();
        if (aVar != null) {
            zzyv zzyv = this.f38555b.f38548a;
            if (aVar.mo27484c(zzyv)) {
                aVar.mo27482b(zzyv);
            } else {
                abv.m32796d("Ad is not visible. Not refreshing ad.");
                aVar.f38500d.mo27541a(zzyv);
            }
        }
    }
}
