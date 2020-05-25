package com.bytedance.android.live.broadcast.effect.sticker;

import android.os.SystemClock;
import com.bytedance.android.live.core.p225d.C3833a;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.e */
public class C3286e extends C3833a {

    /* renamed from: a */
    private long f9473a;

    /* renamed from: b */
    private long f9474b;

    /* renamed from: a */
    public void mo8653a() {
    }

    /* renamed from: a */
    public void mo8654a(int i, String str) {
    }

    /* renamed from: b */
    public void mo8655b() {
    }

    /* renamed from: b */
    public void mo8656b(int i, String str) {
    }

    /* renamed from: c */
    public final void mo8657c() {
        this.f9473a = SystemClock.uptimeMillis();
    }

    /* renamed from: e */
    public final void mo8659e() {
        this.f9474b = SystemClock.uptimeMillis();
    }

    /* renamed from: d */
    public final long mo8658d() {
        long j;
        if (this.f9473a > 0) {
            j = SystemClock.uptimeMillis() - this.f9473a;
        } else {
            j = 0;
        }
        this.f9473a = 0;
        return j;
    }

    /* renamed from: f */
    public final long mo8660f() {
        long j;
        if (this.f9474b > 0) {
            j = SystemClock.uptimeMillis() - this.f9474b;
        } else {
            j = 0;
        }
        this.f9474b = 0;
        return j;
    }
}
