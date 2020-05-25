package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.C0199s;
import android.arch.p010b.C0082h;

/* renamed from: com.bytedance.android.live.core.paging.viewmodel.c */
final /* synthetic */ class C3968c implements C0199s {

    /* renamed from: a */
    private final PagingViewModel f11054a;

    C3968c(PagingViewModel pagingViewModel) {
        this.f11054a = pagingViewModel;
    }

    public final void onChanged(Object obj) {
        this.f11054a.f11044g.postValue((C0082h) obj);
    }
}
