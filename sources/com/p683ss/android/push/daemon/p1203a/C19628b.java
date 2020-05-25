package com.p683ss.android.push.daemon.p1203a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.ss.android.push.daemon.a.b */
public final class C19628b extends C19626a {

    /* renamed from: c */
    private IBinder f54067c;

    /* renamed from: d */
    private Parcel f54068d;

    /* renamed from: b */
    private boolean m47977b() {
        try {
            if (this.f54067c != null) {
                if (this.f54068d != null) {
                    this.f54067c.transact(34, this.f54068d, null, 0);
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
        if (m47977b() && this.f54064b != null && this.f54064b.f54073c != null) {
            this.f54064b.f54073c.mo40941a();
        }
    }
}
