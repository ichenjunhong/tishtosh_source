package com.p683ss.android.ugc.aweme.dfbase;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.dfbase.j */
final /* synthetic */ class C27555j implements C1710e {

    /* renamed from: a */
    private final C27536b f72442a;

    C27555j(C27536b bVar) {
        this.f72442a = bVar;
    }

    public final void accept(Object obj) {
        C27536b bVar = this.f72442a;
        if (!((Boolean) obj).booleanValue()) {
            bVar.mo55976b();
            synchronized (C27536b.class) {
                if (C27536b.f72387b && C27536b.f72389d != null && !C27536b.f72389d.isDisposed()) {
                    C27536b.f72389d.dispose();
                    C27536b.f72387b = false;
                }
            }
        }
    }
}
