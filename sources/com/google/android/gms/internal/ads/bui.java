package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

public final class bui {

    /* renamed from: a */
    final buj f43946a;

    /* renamed from: b */
    final boolean f43947b;

    /* renamed from: c */
    final long f43948c;

    /* renamed from: d */
    final long f43949d;

    /* renamed from: e */
    long f43950e;

    /* renamed from: f */
    long f43951f;

    /* renamed from: g */
    long f43952g;

    /* renamed from: h */
    boolean f43953h;

    /* renamed from: i */
    long f43954i;

    /* renamed from: j */
    long f43955j;

    /* renamed from: k */
    long f43956k;

    public bui() {
        this(-1.0d);
    }

    public bui(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this(windowManager.getDefaultDisplay() != null ? (double) windowManager.getDefaultDisplay().getRefreshRate() : -1.0d);
    }

    private bui(double d) {
        this.f43947b = d != -1.0d;
        if (this.f43947b) {
            this.f43946a = buj.f43957b;
            this.f43948c = (long) (1.0E9d / d);
            this.f43949d = (this.f43948c * 80) / 100;
            return;
        }
        this.f43946a = null;
        this.f43948c = -1;
        this.f43949d = -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo30726a(long j, long j2) {
        return Math.abs((j2 - this.f43954i) - (j - this.f43955j)) > 20000000;
    }
}
