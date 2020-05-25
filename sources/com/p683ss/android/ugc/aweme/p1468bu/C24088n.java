package com.p683ss.android.ugc.aweme.p1468bu;

import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.bu.n */
final class C24088n {

    /* renamed from: a */
    private C24092o f63946a;

    /* renamed from: b */
    private C24090a f63947b;

    /* renamed from: com.ss.android.ugc.aweme.bu.n$a */
    public interface C24090a {
        /* renamed from: a */
        ExecutorService mo49831a(C24085m mVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bu.n$b */
    static class C24091b {

        /* renamed from: a */
        public static final C24088n f63948a = new C24088n();
    }

    /* renamed from: a */
    static C24088n m58933a() {
        return C24091b.f63948a;
    }

    private C24088n() {
        this.f63946a = new C24092o();
        this.f63947b = new C24063e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ExecutorService mo49848a(C24085m mVar, boolean z) {
        ExecutorService a = this.f63947b.mo49831a(mVar);
        if (C24076h.m58897a().f63918a) {
            this.f63946a.mo49849a(mVar.f63932a, a, z);
        }
        return a;
    }
}
