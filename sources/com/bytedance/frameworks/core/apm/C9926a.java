package com.bytedance.frameworks.core.apm;

import com.bytedance.apm.p485h.C9043e;
import com.bytedance.frameworks.core.apm.p578a.p580b.C9936b;

/* renamed from: com.bytedance.frameworks.core.apm.a */
public final class C9926a {

    /* renamed from: a */
    public long f27000a;

    /* renamed from: b */
    private C9936b f27001b = C9937b.m19972a().f27022d;

    /* renamed from: c */
    private C9043e f27002c;

    /* renamed from: com.bytedance.frameworks.core.apm.a$a */
    static class C9927a {

        /* renamed from: a */
        public static final C9926a f27003a = new C9926a();
    }

    /* renamed from: a */
    public static C9926a m19912a() {
        return C9927a.f27003a;
    }

    protected C9926a() {
    }

    /* renamed from: a */
    public final C9043e mo17871a(long j) {
        return this.f27001b.mo17902b(j);
    }

    /* renamed from: a */
    public final void mo17872a(C9043e eVar) {
        this.f27002c = eVar;
        if (this.f27002c != null) {
            C9043e f = this.f27001b.mo17897f();
            if (f == null || !f.equals(this.f27002c)) {
                this.f27000a = this.f27001b.mo17901a(this.f27002c);
            } else {
                this.f27000a = f.f24688a;
            }
        }
    }
}
