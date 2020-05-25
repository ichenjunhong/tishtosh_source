package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n */
public final class C44150n {

    /* renamed from: a */
    static final CopyOnWriteArrayList<Long> f111841a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public static final C44150n f111842b = new C44150n();

    private C44150n() {
    }

    /* renamed from: a */
    public static final void m96799a() {
        f111841a.clear();
    }

    /* renamed from: a */
    public static final void m96800a(long j) {
        boolean z;
        Long valueOf = Long.valueOf(j);
        if (valueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            f111841a.add(Long.valueOf(valueOf.longValue()));
        }
    }
}
