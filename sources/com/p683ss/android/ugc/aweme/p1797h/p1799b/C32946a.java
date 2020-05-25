package com.p683ss.android.ugc.aweme.p1797h.p1799b;

import com.p683ss.android.ugc.aweme.app.C23051bf;

/* renamed from: com.ss.android.ugc.aweme.h.b.a */
public abstract class C32946a {

    /* renamed from: a */
    private long f85620a;

    /* renamed from: b */
    private int f85621b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C23051bf<Long> mo69834a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C23051bf<Integer> mo69836b();

    /* renamed from: a */
    public final void mo69835a(long j) {
        mo69834a().mo47776a(Long.valueOf(j));
        mo69836b().mo47776a(Integer.valueOf(((Integer) mo69836b().mo47782d()).intValue() + 1));
    }

    /* renamed from: b */
    public final boolean mo69837b(long j) {
        if (j - ((Long) mo69834a().mo47782d()).longValue() <= this.f85620a * 1000 || ((Integer) mo69836b().mo47782d()).intValue() >= this.f85621b) {
            return false;
        }
        return true;
    }
}
