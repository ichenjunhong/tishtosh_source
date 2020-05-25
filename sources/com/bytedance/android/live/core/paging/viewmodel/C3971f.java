package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.live.core.paging.viewmodel.f */
final /* synthetic */ class C3971f implements C0199s {

    /* renamed from: a */
    private final PagingViewModel f11057a;

    C3971f(PagingViewModel pagingViewModel) {
        this.f11057a = pagingViewModel;
    }

    public final void onChanged(Object obj) {
        this.f11057a.f11043f.setValue((Integer) obj);
    }
}
