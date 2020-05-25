package com.p683ss.android.push.daemon.p1203a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.ss.android.push.daemon.a.c */
public final class C19629c extends C19626a {

    /* renamed from: c */
    private IBinder f54069c;

    /* renamed from: d */
    private Parcel f54070d;

    /* renamed from: b */
    private boolean m47979b() {
        try {
            if (this.f54069c != null) {
                if (this.f54070d != null) {
                    this.f54069c.transact(14, this.f54070d, null, 0);
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo40942a() {
        try {
            if (!(!m47979b() || this.f54064b == null || this.f54064b.f54073c == null)) {
                this.f54064b.f54073c.mo40941a();
            }
        } catch (Throwable unused) {
        }
    }
}
