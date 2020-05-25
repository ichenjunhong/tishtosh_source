package com.p683ss.android.push.daemon;

import com.p683ss.android.push.daemon.C19630b.C19632b;

/* renamed from: com.ss.android.push.daemon.a */
public final class C19625a implements C19632b, C19637e {

    /* renamed from: a */
    private C19630b f54059a;

    /* renamed from: b */
    private C19632b f54060b;

    /* renamed from: c */
    private final String f54061c = "d_permit";

    /* renamed from: d */
    private final String f54062d = "permitted";

    /* renamed from: a */
    public final void mo40941a() {
        if (this.f54060b != null) {
            this.f54060b.mo40941a();
        }
    }

    public C19625a(C19630b bVar) {
        this.f54059a = bVar;
        if (bVar != null) {
            this.f54060b = this.f54059a.f54073c;
            this.f54059a.f54073c = this;
        }
    }
}
