package com.p683ss.android.ugc.aweme.global.config.settings;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.i */
public final class C32818i {

    /* renamed from: a */
    private static volatile C32818i f85436a;

    /* renamed from: b */
    private boolean f85437b;

    private C32818i() {
    }

    /* renamed from: b */
    public final boolean mo66399b() {
        boolean z;
        synchronized (C32818i.class) {
            z = this.f85437b;
        }
        return z;
    }

    /* renamed from: a */
    public static C32818i m75717a() {
        if (f85436a == null) {
            synchronized (C32818i.class) {
                if (f85436a == null) {
                    f85436a = new C32818i();
                }
            }
        }
        return f85436a;
    }

    /* renamed from: a */
    public final void mo66398a(boolean z) {
        synchronized (C32818i.class) {
            this.f85437b = z;
        }
    }
}
