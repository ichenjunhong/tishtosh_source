package com.bytedance.android.livesdk.feed.tab.p349b;

import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.feed.C6946g;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import p064c.p065a.C2201v;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.feed.tab.b.t */
public final class C7132t implements C7130r {

    /* renamed from: a */
    private FeedTabApi f19359a;

    /* renamed from: a */
    public final C2201v<C4172a<C6945f, C6946g>> mo13253a() {
        return this.f19359a.queryTab(0).mo6529b(C2168a.m6521b());
    }

    /* renamed from: b */
    public final C2201v<C4172a<C6945f, C6946g>> mo13254b() {
        return this.f19359a.queryTab(2).mo6529b(C2168a.m6521b());
    }

    public C7132t(FeedTabApi feedTabApi) {
        this.f19359a = feedTabApi;
    }
}
