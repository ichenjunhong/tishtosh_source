package com.bytedance.android.live.core.paging.p236a;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.live.core.paging.a.h */
final /* synthetic */ class C3942h implements C0199s {

    /* renamed from: a */
    private final C3930c f10977a;

    C3942h(C3930c cVar) {
        this.f10977a = cVar;
    }

    public final void onChanged(Object obj) {
        C3930c cVar = this.f10977a;
        Integer num = (Integer) obj;
        if (num != null && num.intValue() >= 0 && num.intValue() < cVar.getItemCount()) {
            cVar.notifyItemChanged(num.intValue());
        }
    }
}
