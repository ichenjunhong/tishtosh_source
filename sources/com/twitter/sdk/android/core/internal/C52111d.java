package com.twitter.sdk.android.core.internal;

/* renamed from: com.twitter.sdk.android.core.internal.d */
final /* synthetic */ class C52111d implements Runnable {

    /* renamed from: a */
    private final C52110c f129717a;

    /* renamed from: b */
    private final C52104b f129718b;

    C52111d(C52110c cVar, C52104b bVar) {
        this.f129717a = cVar;
        this.f129718b = bVar;
    }

    public final void run() {
        C52110c cVar = this.f129717a;
        C52104b bVar = this.f129718b;
        C52104b a = cVar.mo108812a();
        if (!bVar.equals(a)) {
            cVar.mo108813a(a);
        }
    }
}
