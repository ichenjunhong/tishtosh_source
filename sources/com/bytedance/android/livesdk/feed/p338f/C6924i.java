package com.bytedance.android.livesdk.feed.p338f;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.core.p226e.C3842b;

/* renamed from: com.bytedance.android.livesdk.feed.f.i */
final /* synthetic */ class C6924i implements C0199s {

    /* renamed from: a */
    private final C6915d f18947a;

    C6924i(C6915d dVar) {
        this.f18947a = dVar;
    }

    public final void onChanged(Object obj) {
        C3842b bVar = (C3842b) obj;
        this.f18947a.f18931s.setRefreshing(bVar != null && bVar.mo9203a());
    }
}
