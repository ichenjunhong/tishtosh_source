package com.bytedance.android.livesdk.p328d;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.d.e */
final /* synthetic */ class C6741e implements C1710e {

    /* renamed from: a */
    private final C6737a f18420a;

    /* renamed from: b */
    private final boolean f18421b;

    C6741e(C6737a aVar, boolean z) {
        this.f18420a = aVar;
        this.f18421b = z;
    }

    public final void accept(Object obj) {
        C6737a aVar = this.f18420a;
        boolean z = this.f18421b;
        Throwable th = (Throwable) obj;
        if (aVar.f18413a != null) {
            aVar.f18413a.mo12006b(z, (Exception) th);
        }
    }
}
