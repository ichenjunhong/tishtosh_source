package com.bytedance.android.livesdk.app.dataholder;

import com.bytedance.android.livesdkapi.depend.model.C8688c;

/* renamed from: com.bytedance.android.livesdk.app.dataholder.e */
public final class C4639e extends C4635a<Integer> {

    /* renamed from: n */
    private static C4639e f12670n;

    /* renamed from: c */
    public long f12671c;

    /* renamed from: d */
    public boolean f12672d;

    /* renamed from: e */
    public long f12673e;

    /* renamed from: f */
    public boolean f12674f;

    /* renamed from: g */
    public int f12675g;

    /* renamed from: h */
    public C8688c f12676h;

    /* renamed from: i */
    public String f12677i;

    /* renamed from: j */
    public boolean f12678j;

    /* renamed from: k */
    public int f12679k;

    /* renamed from: l */
    public int f12680l;

    /* renamed from: m */
    public int f12681m;

    /* renamed from: o */
    private long f12682o;

    private C4639e() {
        this.f12651b = Integer.valueOf(0);
    }

    /* renamed from: a */
    public static C4639e m11122a() {
        if (f12670n == null) {
            f12670n = new C4639e();
        }
        return f12670n;
    }

    /* renamed from: b */
    public final long mo10424b() {
        long j = this.f12682o;
        this.f12671c += this.f12682o;
        this.f12682o = 0;
        return j;
    }

    /* renamed from: c */
    public final void mo10425c() {
        this.f12651b = Integer.valueOf(0);
        this.f12672d = false;
        this.f12682o = 0;
        this.f12671c = 0;
        this.f12673e = 0;
        this.f12674f = false;
        this.f12675g = 0;
        this.f12676h = null;
        this.f12677i = null;
        this.f12678j = false;
        this.f12679k = 0;
        this.f12680l = 0;
    }

    /* renamed from: a */
    public final void mo10422a(long j) {
        if (j > this.f12682o) {
            this.f12682o = j;
        }
    }

    /* renamed from: a */
    public final void mo10414a(Integer num) {
        if (num != null && num.intValue() >= 0 && num.intValue() <= 2) {
            if (2 == num.intValue()) {
                this.f12672d = true;
            }
            super.mo10414a(num);
        }
    }
}
