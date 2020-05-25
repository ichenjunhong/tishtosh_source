package com.p683ss.android.ugc.aweme.feed.p1736ui;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ao */
final /* synthetic */ class C30763ao implements Callable {

    /* renamed from: a */
    private final C30760am f80610a;

    /* renamed from: b */
    private final String f80611b;

    /* renamed from: c */
    private final LogPbBean f80612c;

    /* renamed from: d */
    private final Aweme f80613d;

    /* renamed from: e */
    private final String f80614e;

    C30763ao(C30760am amVar, String str, LogPbBean logPbBean, Aweme aweme, String str2) {
        this.f80610a = amVar;
        this.f80611b = str;
        this.f80612c = logPbBean;
        this.f80613d = aweme;
        this.f80614e = str2;
    }

    public final Object call() {
        return this.f80610a.mo63463a(this.f80611b, this.f80612c, this.f80613d, this.f80614e);
    }
}
