package com.google.firebase.iid;

import com.google.firebase.p1072a.C17845a;
import com.google.firebase.p1072a.C17846b;

/* renamed from: com.google.firebase.iid.as */
final /* synthetic */ class C17908as implements C17846b {

    /* renamed from: a */
    private final C17886a f49763a;

    C17908as(C17886a aVar) {
        this.f49763a = aVar;
    }

    /* renamed from: a */
    public final void mo34667a(C17845a aVar) {
        C17886a aVar2 = this.f49763a;
        synchronized (aVar2) {
            if (aVar2.mo34724a()) {
                FirebaseInstanceId.this.mo34719b();
            }
        }
    }
}
