package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment;

import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.f */
final /* synthetic */ class C22749f implements Callable {

    /* renamed from: a */
    private final C227352 f60970a;

    /* renamed from: b */
    private final Throwable f60971b;

    C22749f(C227352 r1, Throwable th) {
        this.f60970a = r1;
        this.f60971b = th;
    }

    public final Object call() {
        C227352 r0 = this.f60970a;
        C22971a.m56493a(TimeUnlockFragment.this.getContext(), this.f60971b);
        return null;
    }
}
