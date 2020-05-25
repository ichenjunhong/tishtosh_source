package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

public final class bfn extends bgm {

    /* renamed from: d */
    private static bgn<String> f42279d = new bgn<>();

    /* renamed from: e */
    private final Context f42280e;

    public bfn(bey bey, String str, String str2, C15588a aVar, int i, int i2, Context context) {
        super(bey, str, str2, aVar, i, 29);
        this.f42280e = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        this.f42315b.mo29287d("E");
        AtomicReference a = f42279d.mo30130a(this.f42280e.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.f42316c.invoke(null, new Object[]{this.f42280e}));
                }
            }
        }
        String str = (String) a.get();
        synchronized (this.f42315b) {
            this.f42315b.mo29287d(azm.m34870a(str.getBytes(), true));
        }
    }
}
