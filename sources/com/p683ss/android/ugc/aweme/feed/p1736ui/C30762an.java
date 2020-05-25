package com.p683ss.android.ugc.aweme.feed.p1736ui;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.an */
final /* synthetic */ class C30762an implements Callable {

    /* renamed from: a */
    private final C30760am f80606a;

    /* renamed from: b */
    private final LogPbBean f80607b;

    /* renamed from: c */
    private final Aweme f80608c;

    /* renamed from: d */
    private final String f80609d;

    C30762an(C30760am amVar, LogPbBean logPbBean, Aweme aweme, String str) {
        this.f80606a = amVar;
        this.f80607b = logPbBean;
        this.f80608c = aweme;
        this.f80609d = str;
    }

    public final Object call() {
        return this.f80606a.mo63462a(this.f80607b, this.f80608c, this.f80609d);
    }
}
