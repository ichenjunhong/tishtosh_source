package com.bytedance.ttnet.p883a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9425l.C9426a;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.bytedance.ttnet.a.d */
public final class C13272d {

    /* renamed from: e */
    private static volatile C13272d f34601e;

    /* renamed from: f */
    private static final Object f34602f = new Object();

    /* renamed from: h */
    private static volatile SharedPreferences f34603h;

    /* renamed from: a */
    volatile int f34604a;

    /* renamed from: b */
    volatile long f34605b;

    /* renamed from: c */
    volatile int f34606c;

    /* renamed from: d */
    volatile int f34607d;

    /* renamed from: g */
    private volatile Context f34608g;

    /* renamed from: a */
    public static C13272d m26709a() {
        return f34601e;
    }

    /* renamed from: c */
    public final int mo24871c() {
        return this.f34604a;
    }

    /* renamed from: d */
    public final int mo24872d() {
        return this.f34606c;
    }

    /* renamed from: e */
    public final int mo24873e() {
        return this.f34607d;
    }

    /* renamed from: f */
    public final C9426a mo24874f() {
        return C9425l.m18652c(this.f34608g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public SharedPreferences mo24870b() {
        if (f34603h == null) {
            f34603h = C35807d.m80935a(this.f34608g, "image_opt_table", 0);
        }
        return f34603h;
    }

    /* renamed from: a */
    public static C13272d m26710a(Context context) {
        if (f34601e == null) {
            synchronized (f34602f) {
                if (f34601e == null) {
                    f34601e = new C13272d(context);
                }
            }
        }
        return f34601e;
    }

    private C13272d(Context context) {
        if (context != null) {
            this.f34608g = context.getApplicationContext();
        }
        try {
            SharedPreferences b = mo24870b();
            this.f34604a = b.getInt("image_opt_switch", 0);
            this.f34605b = b.getLong("image_opt_black_interval", 0);
            this.f34606c = b.getInt("image_opt_failed_times", 0);
            this.f34607d = b.getInt("image_opt_limit_count", 0);
        } catch (Throwable unused) {
        }
    }
}
