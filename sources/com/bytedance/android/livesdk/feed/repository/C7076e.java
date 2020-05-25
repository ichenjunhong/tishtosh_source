package com.bytedance.android.livesdk.feed.repository;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.core.p226e.C3842b;

/* renamed from: com.bytedance.android.livesdk.feed.repository.e */
final /* synthetic */ class C7076e implements C0199s {

    /* renamed from: a */
    private final FeedRepository f19280a;

    C7076e(FeedRepository feedRepository) {
        this.f19280a = feedRepository;
    }

    public final void onChanged(Object obj) {
        this.f19280a.mo13217a((C3842b) obj);
    }
}
