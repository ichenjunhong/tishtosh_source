package com.bytedance.android.livesdk.feed.viewmodel;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.base.model.media.C2990d;

/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.b */
final /* synthetic */ class C7139b implements C0199s {

    /* renamed from: a */
    private final BaseFeedDataViewModel f19416a;

    C7139b(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f19416a = baseFeedDataViewModel;
    }

    public final void onChanged(Object obj) {
        this.f19416a.f19378q.setValue((C2990d) obj);
    }
}
