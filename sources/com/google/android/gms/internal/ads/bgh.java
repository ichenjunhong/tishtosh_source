package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;

public final class bgh extends bgm {

    /* renamed from: d */
    private static volatile Long f42302d;

    /* renamed from: e */
    private static final Object f42303e = new Object();

    public bgh(bey bey, String str, String str2, C15588a aVar, int i, int i2) {
        super(bey, str, str2, aVar, i, 33);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        if (f42302d == null) {
            synchronized (f42303e) {
                if (f42302d == null) {
                    f42302d = (Long) this.f42316c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f42315b) {
            this.f42315b.mo29303o(f42302d.longValue());
        }
    }
}
