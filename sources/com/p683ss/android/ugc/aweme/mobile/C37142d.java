package com.p683ss.android.ugc.aweme.mobile;

import com.p683ss.android.ugc.aweme.mobile.C37139b.C37140a;
import com.p683ss.android.ugc.aweme.utils.C47957v;

/* renamed from: com.ss.android.ugc.aweme.mobile.d */
final /* synthetic */ class C37142d implements C37148a {

    /* renamed from: a */
    private final C37139b f94813a;

    /* renamed from: b */
    private final C37140a f94814b;

    C37142d(C37139b bVar, C37140a aVar) {
        this.f94813a = bVar;
        this.f94814b = aVar;
    }

    /* renamed from: a */
    public final void mo76417a(boolean z) {
        C37139b bVar = this.f94813a;
        C37140a aVar = this.f94814b;
        if (z && bVar.f94809c) {
            bVar.f94809c = false;
            if (aVar != null) {
                aVar.mo66201a(bVar.f94807a);
            }
            C47957v.m103768a((Runnable) new C37143e(bVar));
        }
    }
}
