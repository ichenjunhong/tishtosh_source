package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

public final class bul {

    /* renamed from: a */
    final Handler f43963a;

    /* renamed from: b */
    final buk f43964b;

    public bul(Handler handler, buk buk) {
        this.f43963a = buk != null ? (Handler) bti.m36697a(handler) : null;
        this.f43964b = buk;
    }

    /* renamed from: a */
    public final void mo30730a(int i, long j) {
        if (this.f43964b != null) {
            this.f43963a.post(new bup(this, i, j));
        }
    }

    /* renamed from: a */
    public final void mo30729a(int i, int i2, int i3, float f) {
        if (this.f43964b != null) {
            Handler handler = this.f43963a;
            buq buq = new buq(this, i, i2, i3, f);
            handler.post(buq);
        }
    }

    /* renamed from: a */
    public final void mo30731a(Surface surface) {
        if (this.f43964b != null) {
            this.f43963a.post(new bur(this, surface));
        }
    }

    /* renamed from: a */
    public final void mo30732a(bob bob) {
        if (this.f43964b != null) {
            this.f43963a.post(new bus(this, bob));
        }
    }
}
