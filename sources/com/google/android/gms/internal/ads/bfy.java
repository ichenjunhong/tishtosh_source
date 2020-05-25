package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;

public final class bfy extends bgm {

    /* renamed from: d */
    private static volatile String f42293d;

    /* renamed from: e */
    private static final Object f42294e = new Object();

    public bfy(bey bey, String str, String str2, C15588a aVar, int i, int i2) {
        super(bey, str, str2, aVar, i, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        this.f42315b.mo29276a("E");
        if (f42293d == null) {
            synchronized (f42294e) {
                if (f42293d == null) {
                    f42293d = (String) this.f42316c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f42315b) {
            this.f42315b.mo29276a(f42293d);
        }
    }
}
