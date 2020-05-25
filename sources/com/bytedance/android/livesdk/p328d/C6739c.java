package com.bytedance.android.livesdk.p328d;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.d.c */
final /* synthetic */ class C6739c implements C1710e {

    /* renamed from: a */
    private final C6737a f18416a;

    /* renamed from: b */
    private final boolean f18417b;

    C6739c(C6737a aVar, boolean z) {
        this.f18416a = aVar;
        this.f18417b = z;
    }

    public final void accept(Object obj) {
        C6737a aVar = this.f18416a;
        boolean z = this.f18417b;
        Throwable th = (Throwable) obj;
        if (aVar.f18413a != null) {
            aVar.f18413a.mo12006b(z, (Exception) th);
        }
    }
}
