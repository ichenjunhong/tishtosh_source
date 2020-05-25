package com.p683ss.android.ugc.aweme.profile.util;

import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.util.g */
final /* synthetic */ class C40546g implements Callable {

    /* renamed from: a */
    private final int f103454a;

    /* renamed from: b */
    private final String f103455b;

    /* renamed from: c */
    private final FeedItemList f103456c;

    C40546g(int i, String str, FeedItemList feedItemList) {
        this.f103454a = i;
        this.f103455b = str;
        this.f103456c = feedItemList;
    }

    public final Object call() {
        return C40542c.m89962b(this.f103454a, this.f103455b, this.f103456c);
    }
}
