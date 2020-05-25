package com.bytedance.android.live.core.paging.p236a;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.live.core.paging.a.g */
final /* synthetic */ class C3941g implements C0199s {

    /* renamed from: a */
    private final C3930c f10976a;

    C3941g(C3930c cVar) {
        this.f10976a = cVar;
    }

    public final void onChanged(Object obj) {
        C3930c cVar = this.f10976a;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (cVar.f10954g != booleanValue) {
                cVar.f10954g = booleanValue;
                cVar.notifyDataSetChanged();
            }
        }
    }
}
