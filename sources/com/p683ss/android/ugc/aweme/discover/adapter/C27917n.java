package com.p683ss.android.ugc.aweme.discover.adapter;

import com.p683ss.android.ugc.aweme.discover.model.Banner;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.n */
final /* synthetic */ class C27917n implements Callable {

    /* renamed from: a */
    private final int f73327a;

    /* renamed from: b */
    private final Banner f73328b;

    /* renamed from: c */
    private final String f73329c;

    C27917n(int i, Banner banner, String str) {
        this.f73327a = i;
        this.f73328b = banner;
        this.f73329c = str;
    }

    public final Object call() {
        return DiscoverBannerViewHolder.m66426a(this.f73327a, this.f73328b, this.f73329c);
    }
}
