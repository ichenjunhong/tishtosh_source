package com.p683ss.android.ugc.aweme.feed.p1736ui;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dm */
final /* synthetic */ class C30912dm implements Runnable {

    /* renamed from: a */
    private final C30907dl f80967a;

    /* renamed from: b */
    private final boolean f80968b;

    /* renamed from: c */
    private final long f80969c;

    /* renamed from: d */
    private final Aweme f80970d;

    C30912dm(C30907dl dlVar, boolean z, long j, Aweme aweme) {
        this.f80967a = dlVar;
        this.f80968b = z;
        this.f80969c = j;
        this.f80970d = aweme;
    }

    public final void run() {
        C30907dl dlVar = this.f80967a;
        boolean z = this.f80968b;
        long j = this.f80969c;
        Aweme aweme = this.f80970d;
        dlVar.f80949p.setSelected(z);
        dlVar.f80950q.setText(dlVar.mo63668a(j, aweme));
    }
}
