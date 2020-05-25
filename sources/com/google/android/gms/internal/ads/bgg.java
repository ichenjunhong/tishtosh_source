package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;

public final class bgg extends bgm {

    /* renamed from: d */
    private final bfi f42300d;

    /* renamed from: e */
    private long f42301e;

    public bgg(bey bey, String str, String str2, C15588a aVar, int i, int i2, bfi bfi) {
        super(bey, str, str2, aVar, i, 53);
        this.f42300d = bfi;
        if (bfi != null) {
            if (bfi.f42264b <= -2 && bfi.f42263a.get() == null) {
                bfi.f42264b = -3;
            }
            this.f42301e = bfi.f42264b;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        if (this.f42300d != null) {
            this.f42315b.mo29262A(((Long) this.f42316c.invoke(null, new Object[]{Long.valueOf(this.f42301e)})).longValue());
        }
    }
}
