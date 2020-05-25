package com.twitter.sdk.android.core;

import okhttp3.C53671s;

/* renamed from: com.twitter.sdk.android.core.u */
public final class C52230u {

    /* renamed from: a */
    public int f130063a;

    /* renamed from: b */
    public int f130064b;

    /* renamed from: c */
    public long f130065c;

    C52230u(C53671s sVar) {
        if (sVar != null) {
            for (int i = 0; i < sVar.mo111591a(); i++) {
                if ("x-rate-limit-limit".equals(sVar.mo111592a(i))) {
                    this.f130063a = Integer.valueOf(sVar.mo111594b(i)).intValue();
                } else if ("x-rate-limit-remaining".equals(sVar.mo111592a(i))) {
                    this.f130064b = Integer.valueOf(sVar.mo111594b(i)).intValue();
                } else if ("x-rate-limit-reset".equals(sVar.mo111592a(i))) {
                    this.f130065c = Long.valueOf(sVar.mo111594b(i)).longValue();
                }
            }
            return;
        }
        throw new IllegalArgumentException("headers must not be null");
    }
}
