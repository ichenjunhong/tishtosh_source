package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.core.p226e.C3842b;

/* renamed from: com.bytedance.android.live.core.paging.viewmodel.b */
final /* synthetic */ class C3967b implements C0199s {

    /* renamed from: a */
    private final PagingViewModel f11053a;

    C3967b(PagingViewModel pagingViewModel) {
        this.f11053a = pagingViewModel;
    }

    public final void onChanged(Object obj) {
        this.f11053a.f11040c.postValue((C3842b) obj);
    }
}
