package com.bytedance.android.livesdk.feed.viewmodel;

import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.t */
final /* synthetic */ class C7157t implements C1710e {

    /* renamed from: a */
    private final FeedTabViewModel f19434a;

    C7157t(FeedTabViewModel feedTabViewModel) {
        this.f19434a = feedTabViewModel;
    }

    public final void accept(Object obj) {
        this.f19434a.f19393a.onNext((List) obj);
    }
}
