package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;

public final class bfr extends bgm {

    /* renamed from: d */
    private static volatile Long f42285d;

    /* renamed from: e */
    private static final Object f42286e = new Object();

    public bfr(bey bey, String str, String str2, C15588a aVar, int i, int i2) {
        super(bey, str, str2, aVar, i, 44);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        if (f42285d == null) {
            synchronized (f42286e) {
                if (f42285d == null) {
                    f42285d = (Long) this.f42316c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f42315b) {
            this.f42315b.mo29311w(f42285d.longValue());
        }
    }
}
