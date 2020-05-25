package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.live.core.paging.viewmodel.e */
final /* synthetic */ class C3970e implements C0199s {

    /* renamed from: a */
    private final PagingViewModel f11056a;

    C3970e(PagingViewModel pagingViewModel) {
        this.f11056a = pagingViewModel;
    }

    public final void onChanged(Object obj) {
        this.f11056a.f11042e.postValue((Boolean) obj);
    }
}
