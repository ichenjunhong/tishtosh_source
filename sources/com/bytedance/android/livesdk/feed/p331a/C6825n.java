package com.bytedance.android.livesdk.feed.p331a;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.base.model.user.C3009i.C3010a;
import com.bytedance.android.live.core.p226e.C3842b;

/* renamed from: com.bytedance.android.livesdk.feed.a.n */
public final /* synthetic */ class C6825n implements C0199s {

    /* renamed from: a */
    private final C6812e f18710a;

    public C6825n(C6812e eVar) {
        this.f18710a = eVar;
    }

    public final void onChanged(Object obj) {
        C6812e eVar = this.f18710a;
        C3010a aVar = (C3010a) obj;
        if (eVar.f18682h && !eVar.f18686l) {
            eVar.f18677c.mo13263a("enter_auto");
        }
        if (aVar == C3010a.Login && !eVar.f18686l) {
            C3842b bVar = (C3842b) eVar.f18677c.f11039b.getValue();
            Boolean bool = (Boolean) eVar.f18677c.f11041d.getValue();
            boolean z = true;
            boolean z2 = bVar != null && bVar.mo9204b();
            if (bool != null && !bool.booleanValue()) {
                z = false;
            }
            if (z2 && z) {
                eVar.f18677c.mo13263a("enter_auto");
            }
        }
    }
}
