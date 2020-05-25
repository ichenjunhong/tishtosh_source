package com.p683ss.android.ugc.aweme.p1402b;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.p1402b.C23347e.C23348a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.b.f */
public final class C23349f extends C23351h {

    /* renamed from: e */
    private volatile boolean f62355e;

    public C23349f(Activity activity) {
        C52711k.m112240b(activity, "activity");
        super(activity);
    }

    /* renamed from: a */
    public final void mo48404a(C23348a aVar, long j) {
        C52711k.m112240b(aVar, "target");
        if (!this.f62355e) {
            synchronized (this) {
                if (!this.f62355e) {
                    this.f62355e = true;
                    super.mo48404a(aVar, j);
                }
            }
        }
    }
}
