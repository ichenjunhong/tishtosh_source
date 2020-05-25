package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.os.Handler;
import com.p683ss.android.medialib.p1181c.C19233b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.t */
public final class C45215t implements C19233b {

    /* renamed from: a */
    public Handler f114380a;

    /* renamed from: b */
    public C19233b f114381b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.t$a */
    static final class C45216a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C45215t f114382a;

        /* renamed from: b */
        final /* synthetic */ int f114383b;

        C45216a(C45215t tVar, int i) {
            this.f114382a = tVar;
            this.f114383b = i;
        }

        public final void run() {
            this.f114382a.f114381b.mo39624a(this.f114383b);
        }
    }

    /* renamed from: a */
    public final void mo39624a(int i) {
        this.f114380a.post(new C45216a(this, i));
    }

    /* renamed from: a */
    public final void mo39625a(int i, int i2) {
        this.f114381b.mo39625a(i, i2);
    }

    public C45215t(Handler handler, C19233b bVar) {
        C52711k.m112240b(handler, "mHandler");
        C52711k.m112240b(bVar, "mNativeInitListener");
        this.f114380a = handler;
        this.f114381b = bVar;
    }
}
