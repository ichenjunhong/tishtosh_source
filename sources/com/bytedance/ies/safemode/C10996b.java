package com.bytedance.ies.safemode;

import android.app.Application;
import android.webkit.ValueCallback;

/* renamed from: com.bytedance.ies.safemode.b */
public final class C10996b {

    /* renamed from: m */
    private static C10996b f29531m;

    /* renamed from: a */
    public Application f29532a;

    /* renamed from: b */
    public C11001g<Integer> f29533b = new C10998d();

    /* renamed from: c */
    public C11001g<Long> f29534c = new C10998d();

    /* renamed from: d */
    public C11001g<Integer> f29535d = new C10998d();

    /* renamed from: e */
    public C11001g<Long> f29536e = new C10998d();

    /* renamed from: f */
    public C11001g<Long> f29537f = new C10998d();

    /* renamed from: g */
    public boolean f29538g = true;

    /* renamed from: h */
    public ValueCallback<C10997c> f29539h = null;

    /* renamed from: i */
    public Runnable f29540i = null;

    /* renamed from: j */
    public Runnable f29541j = null;

    /* renamed from: k */
    public boolean f29542k = false;

    /* renamed from: l */
    public long f29543l = 0;

    /* renamed from: a */
    public static synchronized C10996b m22262a(Application application) {
        C10996b bVar;
        synchronized (C10996b.class) {
            if (f29531m == null) {
                f29531m = new C10996b(application);
            }
            bVar = f29531m;
        }
        return bVar;
    }

    private C10996b(Application application) {
        this.f29532a = application;
    }
}
