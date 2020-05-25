package com.p683ss.android.ugc.trill.share.base;

import com.p683ss.android.ugc.trill.share.base.C50418a.C50430b;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.trill.share.base.e */
final /* synthetic */ class C50435e implements Callable {

    /* renamed from: a */
    private final C50430b f126478a;

    /* renamed from: b */
    private final String f126479b;

    /* renamed from: c */
    private final long f126480c;

    /* renamed from: d */
    private final long f126481d;

    C50435e(C50430b bVar, String str, long j, long j2) {
        this.f126478a = bVar;
        this.f126479b = str;
        this.f126480c = j;
        this.f126481d = j2;
    }

    public final Object call() {
        return this.f126478a.mo98349a(this.f126479b, this.f126480c, this.f126481d);
    }
}
