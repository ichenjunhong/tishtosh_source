package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;

public final class bfv extends bgm {

    /* renamed from: d */
    private static volatile Long f42290d;

    /* renamed from: e */
    private static final Object f42291e = new Object();

    public bfv(bey bey, String str, String str2, C15588a aVar, int i, int i2) {
        super(bey, str, str2, aVar, i, 22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        if (f42290d == null) {
            synchronized (f42291e) {
                if (f42290d == null) {
                    f42290d = (Long) this.f42316c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f42315b) {
            this.f42315b.mo29299k(f42290d.longValue());
        }
    }
}
