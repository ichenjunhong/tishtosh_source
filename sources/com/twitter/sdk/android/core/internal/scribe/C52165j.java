package com.twitter.sdk.android.core.internal.scribe;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.j */
final /* synthetic */ class C52165j implements Runnable {

    /* renamed from: a */
    private final C52164i f129850a;

    /* renamed from: b */
    private final Object f129851b;

    /* renamed from: c */
    private final boolean f129852c;

    C52165j(C52164i iVar, Object obj, boolean z) {
        this.f129850a = iVar;
        this.f129851b = obj;
        this.f129852c = z;
    }

    public final void run() {
        this.f129850a.mo108892b(this.f129851b, this.f129852c);
    }
}
