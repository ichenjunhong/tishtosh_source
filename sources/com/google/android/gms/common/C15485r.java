package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.r */
abstract class C15485r extends C15483p {

    /* renamed from: b */
    private static final WeakReference<byte[]> f39897b = new WeakReference<>(null);

    /* renamed from: a */
    private WeakReference<byte[]> f39898a = f39897b;

    C15485r(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract byte[] mo28470d();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final byte[] mo28467c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f39898a.get();
            if (bArr == null) {
                bArr = mo28470d();
                this.f39898a = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
