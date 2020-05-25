package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;

public final class bge extends bgm {

    /* renamed from: d */
    private final StackTraceElement[] f42299d;

    public bge(bey bey, String str, String str2, C15588a aVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(bey, str, str2, aVar, i, 45);
        this.f42299d = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        aug aug;
        if (this.f42299d != null) {
            bew bew = new bew((String) this.f42316c.invoke(null, new Object[]{this.f42299d}));
            synchronized (this.f42315b) {
                this.f42315b.mo29312x(bew.f42210a.longValue());
                if (bew.f42211b.booleanValue()) {
                    C15588a aVar = this.f42315b;
                    if (bew.f42212c.booleanValue()) {
                        aug = aug.ENUM_FALSE;
                    } else {
                        aug = aug.ENUM_TRUE;
                    }
                    aVar.mo29283c(aug);
                } else {
                    this.f42315b.mo29283c(aug.ENUM_FAILURE);
                }
            }
        }
    }
}
