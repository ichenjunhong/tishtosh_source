package com.bytedance.android.livesdk.admin.p275c;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.admin.c.c */
final /* synthetic */ class C4535c implements C1710e {

    /* renamed from: a */
    private final C4533a f12474a;

    /* renamed from: b */
    private final boolean f12475b;

    C4535c(C4533a aVar, boolean z) {
        this.f12474a = aVar;
        this.f12475b = z;
    }

    public final void accept(Object obj) {
        C4533a aVar = this.f12474a;
        boolean z = this.f12475b;
        Throwable th = (Throwable) obj;
        if (aVar.f12469a != null) {
            aVar.f12469a.mo10363a(z, (Exception) th);
        }
    }
}
