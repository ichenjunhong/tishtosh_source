package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;

public final class bgi extends bgm {
    public bgi(bey bey, String str, String str2, C15588a aVar, int i, int i2) {
        super(bey, str, str2, aVar, i, 48);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        this.f42315b.mo29275a(aug.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.f42316c.invoke(null, new Object[]{this.f42314a.f42216a})).booleanValue();
        synchronized (this.f42315b) {
            if (booleanValue) {
                try {
                    this.f42315b.mo29275a(aug.ENUM_TRUE);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                this.f42315b.mo29275a(aug.ENUM_FALSE);
            }
        }
    }
}
