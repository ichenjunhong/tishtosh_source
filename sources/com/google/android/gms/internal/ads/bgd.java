package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;

public final class bgd extends bgm {

    /* renamed from: d */
    private final boolean f42298d;

    public bgd(bey bey, String str, String str2, C15588a aVar, int i, int i2) {
        super(bey, str, str2, aVar, i, 61);
        this.f42298d = bey.f42229n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f42316c.invoke(null, new Object[]{this.f42314a.f42216a, Boolean.valueOf(this.f42298d)})).longValue();
        synchronized (this.f42315b) {
            this.f42315b.mo29265D(longValue);
        }
    }
}
