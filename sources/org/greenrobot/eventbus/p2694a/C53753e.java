package org.greenrobot.eventbus.p2694a;

import org.greenrobot.eventbus.ThreadMode;

/* renamed from: org.greenrobot.eventbus.a.e */
public final class C53753e {

    /* renamed from: a */
    final String f133298a;

    /* renamed from: b */
    final ThreadMode f133299b;

    /* renamed from: c */
    final Class<?> f133300c;

    /* renamed from: d */
    final int f133301d;

    /* renamed from: e */
    final boolean f133302e;

    public C53753e(String str, Class<?> cls) {
        this(str, cls, ThreadMode.POSTING, 0, false);
    }

    public C53753e(String str, Class<?> cls, ThreadMode threadMode) {
        this(str, cls, threadMode, 0, false);
    }

    public C53753e(String str, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f133298a = str;
        this.f133299b = threadMode;
        this.f133300c = cls;
        this.f133301d = i;
        this.f133302e = z;
    }
}
