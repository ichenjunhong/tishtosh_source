package com.bytedance.android.livesdk.feed.viewmodel;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.a */
final /* synthetic */ class C7138a implements C0199s {

    /* renamed from: a */
    private final BaseFeedDataViewModel f19415a;

    C7138a(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f19415a = baseFeedDataViewModel;
    }

    public final void onChanged(Object obj) {
        this.f19415a.f19377p.setValue((Integer) obj);
    }
}
