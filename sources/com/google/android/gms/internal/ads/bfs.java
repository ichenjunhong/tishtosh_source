package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;

public final class bfs extends bgm {

    /* renamed from: d */
    private long f42287d;

    public bfs(bey bey, String str, String str2, C15588a aVar, long j, int i, int i2) {
        super(bey, str, str2, aVar, i, 25);
        this.f42287d = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f42316c.invoke(null, new Object[0])).longValue();
        synchronized (this.f42315b) {
            this.f42315b.mo29268G(longValue);
            if (this.f42287d != 0) {
                this.f42315b.mo29296i(longValue - this.f42287d);
                this.f42315b.mo29300l(this.f42287d);
            }
        }
    }
}
