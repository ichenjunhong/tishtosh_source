package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@C16299uq
public abstract class bwu {

    /* renamed from: b */
    private static MessageDigest f44178b;

    /* renamed from: a */
    protected Object f44179a = new Object();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract byte[] mo30835a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MessageDigest mo30834a() {
        synchronized (this.f44179a) {
            if (f44178b != null) {
                MessageDigest messageDigest = f44178b;
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f44178b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f44178b;
            return messageDigest2;
        }
    }
}
