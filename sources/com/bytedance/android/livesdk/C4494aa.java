package com.bytedance.android.livesdk;

import android.arch.lifecycle.C0198r;

/* renamed from: com.bytedance.android.livesdk.aa */
public final class C4494aa {

    /* renamed from: b */
    private static volatile C4494aa f12264b;

    /* renamed from: a */
    public final C0198r<Boolean> f12265a = new C0198r<>();

    /* renamed from: c */
    private boolean f12266c;

    /* renamed from: d */
    private int f12267d;

    /* renamed from: e */
    private boolean f12268e;

    /* renamed from: e */
    public final void mo10298e() {
        mo10299f();
        this.f12266c = true;
    }

    private C4494aa() {
    }

    /* renamed from: b */
    public final void mo10295b() {
        if (this.f12266c) {
            this.f12267d++;
        }
    }

    /* renamed from: f */
    public final void mo10299f() {
        if (this.f12266c) {
            this.f12266c = false;
            this.f12267d = 0;
            this.f12268e = false;
        }
    }

    /* renamed from: a */
    public static C4494aa m10815a() {
        if (f12264b == null) {
            synchronized (C4494aa.class) {
                if (f12264b == null) {
                    f12264b = new C4494aa();
                }
            }
        }
        return f12264b;
    }

    /* renamed from: g */
    private void m10816g() {
        if (this.f12267d == 0 && !this.f12268e) {
            this.f12265a.postValue(Boolean.valueOf(true));
        }
    }

    /* renamed from: c */
    public final void mo10296c() {
        if (this.f12266c) {
            this.f12267d--;
            if (this.f12267d < 0) {
                this.f12267d = 0;
            }
            if (this.f12267d == 0) {
                m10816g();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo10297d() {
        if (!this.f12266c) {
            return false;
        }
        if (this.f12267d != 0 || this.f12268e) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo10294a(boolean z) {
        if (this.f12266c) {
            this.f12268e = z;
            if (!this.f12268e) {
                m10816g();
            }
        }
    }
}
