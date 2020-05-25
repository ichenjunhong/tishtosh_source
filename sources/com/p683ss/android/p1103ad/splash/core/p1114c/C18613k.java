package com.p683ss.android.p1103ad.splash.core.p1114c;

import android.text.TextUtils;

/* renamed from: com.ss.android.ad.splash.core.c.k */
public class C18613k {

    /* renamed from: F */
    public String f51389F;

    public C18613k() {
    }

    /* renamed from: G */
    public String mo37971G() {
        return this.f51389F;
    }

    public int hashCode() {
        if (TextUtils.isEmpty(mo37971G())) {
            return super.hashCode();
        }
        return mo37971G().hashCode();
    }

    public C18613k(String str) {
        this.f51389F = str;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C18613k) && !TextUtils.isEmpty(mo37971G())) {
            C18613k kVar = (C18613k) obj;
            if (!TextUtils.isEmpty(kVar.mo37971G())) {
                return TextUtils.equals(mo37971G(), kVar.mo37971G());
            }
        }
        return false;
    }
}
