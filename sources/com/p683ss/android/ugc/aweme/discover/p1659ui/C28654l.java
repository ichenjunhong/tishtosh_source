package com.p683ss.android.ugc.aweme.discover.p1659ui;

import com.p683ss.android.common.p1146d.C18898c;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.l */
final /* synthetic */ class C28654l implements Callable {

    /* renamed from: a */
    private final DiscoverFragment f75221a;

    /* renamed from: b */
    private final long f75222b;

    C28654l(DiscoverFragment discoverFragment, long j) {
        this.f75221a = discoverFragment;
        this.f75222b = j;
    }

    public final Object call() {
        DiscoverFragment discoverFragment = this.f75221a;
        C18898c.m46010a(discoverFragment.getContext(), "stay_time", "discovery", this.f75222b, 0);
        return null;
    }
}
