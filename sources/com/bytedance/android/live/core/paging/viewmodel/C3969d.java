package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.live.core.paging.viewmodel.d */
final /* synthetic */ class C3969d implements C0199s {

    /* renamed from: a */
    private final PagingViewModel f11055a;

    C3969d(PagingViewModel pagingViewModel) {
        this.f11055a = pagingViewModel;
    }

    public final void onChanged(Object obj) {
        this.f11055a.f11041d.postValue((Boolean) obj);
    }
}
