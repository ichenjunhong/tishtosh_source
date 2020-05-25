package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class ayb {

    /* renamed from: a */
    static final Charset f41627a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f41628b;

    /* renamed from: c */
    private static final Charset f41629c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final ByteBuffer f41630d;

    /* renamed from: e */
    private static final axa f41631e;

    /* renamed from: a */
    public static int m34766a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m34767a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static <T> T m34768a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static <T> T m34770a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static String m34771a(byte[] bArr) {
        return new String(bArr, f41627a);
    }

    /* renamed from: a */
    static int m34765a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: a */
    static Object m34769a(Object obj, Object obj2) {
        return ((azj) obj).mo29825l().mo29585a((azj) obj2).mo29831d();
    }

    static {
        byte[] bArr = new byte[0];
        f41628b = bArr;
        f41630d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f41628b;
        f41631e = axa.m34318a(bArr2, 0, bArr2.length, false);
    }
}
