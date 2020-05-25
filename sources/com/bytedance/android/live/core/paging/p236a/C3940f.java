package com.bytedance.android.live.core.paging.p236a;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.live.core.paging.a.f */
final /* synthetic */ class C3940f implements C0199s {

    /* renamed from: a */
    private final C3930c f10975a;

    C3940f(C3930c cVar) {
        this.f10975a = cVar;
    }

    public final void onChanged(Object obj) {
        C3930c cVar = this.f10975a;
        Boolean bool = (Boolean) obj;
        boolean z = bool != null && !bool.booleanValue();
        if (cVar.f10952e == z || cVar.f10954g) {
            cVar.f10952e = z;
            return;
        }
        cVar.f10952e = z;
        cVar.notifyDataSetChanged();
    }
}
