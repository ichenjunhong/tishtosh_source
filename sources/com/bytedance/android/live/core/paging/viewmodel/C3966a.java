package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.core.p226e.C3842b;

/* renamed from: com.bytedance.android.live.core.paging.viewmodel.a */
final /* synthetic */ class C3966a implements C0199s {

    /* renamed from: a */
    private final PagingViewModel f11052a;

    C3966a(PagingViewModel pagingViewModel) {
        this.f11052a = pagingViewModel;
    }

    public final void onChanged(Object obj) {
        this.f11052a.f11039b.postValue((C3842b) obj);
    }
}
