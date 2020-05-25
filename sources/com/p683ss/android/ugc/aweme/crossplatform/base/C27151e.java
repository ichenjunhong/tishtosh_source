package com.p683ss.android.ugc.aweme.crossplatform.base;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.base.e */
public final class C27151e {

    /* renamed from: a */
    private AtomicBoolean f71612a;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.base.e$a */
    static class C27153a {

        /* renamed from: a */
        public static C27151e f71613a = new C27151e();
    }

    /* renamed from: a */
    public static C27151e m65508a() {
        return C27153a.f71613a;
    }

    /* renamed from: b */
    public final void mo55463b() {
        this.f71612a.compareAndSet(false, true);
    }

    private C27151e() {
        this.f71612a = new AtomicBoolean(false);
    }
}
