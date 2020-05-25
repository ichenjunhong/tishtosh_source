package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@C16299uq
public final class ahu {

    /* renamed from: a */
    private final long f40512a = TimeUnit.MILLISECONDS.toNanos(((Long) caf.m37099d().mo30717a(C15740bx.f44187A)).longValue());

    /* renamed from: b */
    private long f40513b;

    /* renamed from: c */
    private boolean f40514c = true;

    ahu() {
    }

    /* renamed from: a */
    public final void mo28914a() {
        this.f40514c = true;
    }

    /* renamed from: a */
    public final void mo28915a(SurfaceTexture surfaceTexture, ahi ahi) {
        if (ahi != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f40514c || Math.abs(timestamp - this.f40513b) >= this.f40512a) {
                this.f40514c = false;
                this.f40513b = timestamp;
                acd.f40245a.post(new ahv(this, ahi));
            }
        }
    }
}
