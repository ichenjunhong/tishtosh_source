package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;

public final class bfq extends bgm {
    public bfq(bey bey, String str, String str2, C15588a aVar, int i, int i2) {
        super(bey, str, str2, aVar, i, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        this.f42315b.mo29278b(-1);
        this.f42315b.mo29282c(-1);
        int[] iArr = (int[]) this.f42316c.invoke(null, new Object[]{this.f42314a.f42216a});
        synchronized (this.f42315b) {
            this.f42315b.mo29278b((long) iArr[0]);
            this.f42315b.mo29282c((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.f42315b.mo29263B((long) iArr[2]);
            }
        }
    }
}
