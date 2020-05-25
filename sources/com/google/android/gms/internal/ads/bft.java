package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.p1029b.C14902a;
import com.google.android.gms.ads.p1029b.C14902a.C14903a;
import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import com.google.android.gms.internal.ads.amq.C15587a.C15590c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public final class bft extends bgm {
    public bft(bey bey, String str, String str2, C15588a aVar, int i, int i2) {
        super(bey, str, str2, aVar, i, 24);
    }

    /* renamed from: b */
    public final Void mo30120b() throws Exception {
        if (this.f42314a.f42228m) {
            return super.call();
        }
        if (this.f42314a.f42226k) {
            m35564c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        if (this.f42314a.f42226k) {
            m35564c();
            return;
        }
        synchronized (this.f42315b) {
            this.f42315b.mo29297i((String) this.f42316c.invoke(null, new Object[]{this.f42314a.f42216a}));
        }
    }

    /* renamed from: c */
    private final void m35564c() {
        C14902a a = this.f42314a.mo30093a();
        if (a != null) {
            try {
                C14903a b = a.mo27308b();
                String a2 = bfg.m35542a(b.f38442a);
                if (a2 != null) {
                    synchronized (this.f42315b) {
                        this.f42315b.mo29297i(a2);
                        this.f42315b.mo29277a(b.f38443b);
                        this.f42315b.mo29271a(C15590c.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public final /* synthetic */ Object call() throws Exception {
        return call();
    }
}
