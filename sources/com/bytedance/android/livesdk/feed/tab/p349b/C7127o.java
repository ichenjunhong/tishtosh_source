package com.bytedance.android.livesdk.feed.tab.p349b;

import java.util.ArrayList;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.bytedance.android.livesdk.feed.tab.b.o */
final /* synthetic */ class C7127o implements C2205y {

    /* renamed from: a */
    private final C7125n f19357a;

    C7127o(C7125n nVar) {
        this.f19357a = nVar;
    }

    public final void subscribe(C2204x xVar) {
        C7125n nVar = this.f19357a;
        nVar.mo13250c();
        if (C7125n.m14799a(nVar.f19346a)) {
            xVar.mo6282a(new ArrayList(nVar.f19346a));
            xVar.mo6273a();
            return;
        }
        xVar.mo6274a((Throwable) new IllegalStateException("tab list wrong"));
    }
}
