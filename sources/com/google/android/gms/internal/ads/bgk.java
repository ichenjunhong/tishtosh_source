package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class bgk {

    /* renamed from: g */
    private static final String f42305g = "bgk";

    /* renamed from: a */
    final bey f42306a;

    /* renamed from: b */
    final String f42307b;

    /* renamed from: c */
    final String f42308c;

    /* renamed from: d */
    volatile Method f42309d;

    /* renamed from: e */
    final Class<?>[] f42310e;

    /* renamed from: f */
    CountDownLatch f42311f = new CountDownLatch(1);

    /* renamed from: h */
    private final int f42312h = 2;

    public bgk(bey bey, String str, String str2, Class<?>... clsArr) {
        this.f42306a = bey;
        this.f42307b = str;
        this.f42308c = str2;
        this.f42310e = clsArr;
        this.f42306a.f42217b.submit(new bgl(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo30127a(byte[] bArr, String str) throws bek, UnsupportedEncodingException {
        return new String(this.f42306a.f42219d.mo30084a(bArr, str), "UTF-8");
    }

    /* renamed from: a */
    public final Method mo30128a() {
        if (this.f42309d != null) {
            return this.f42309d;
        }
        try {
            if (!this.f42311f.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f42309d;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
