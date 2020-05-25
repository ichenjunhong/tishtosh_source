package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.hf */
public final class C16743hf {

    /* renamed from: a */
    static final Charset f47107a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f47108b;

    /* renamed from: c */
    private static final Charset f47109c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final ByteBuffer f47110d;

    /* renamed from: e */
    private static final C16704ge f47111e;

    /* renamed from: a */
    public static int m40312a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m40313a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static <T> T m40314a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static <T> T m40316a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static String m40317a(byte[] bArr) {
        return new String(bArr, f47107a);
    }

    /* renamed from: a */
    static int m40311a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: a */
    static Object m40315a(Object obj, Object obj2) {
        return ((C16775ik) obj).mo32231h().mo31991a((C16775ik) obj2).mo32238c();
    }

    static {
        byte[] bArr = new byte[0];
        f47108b = bArr;
        f47110d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f47108b;
        f47111e = C16704ge.m39889a(bArr2, 0, bArr2.length, false);
    }
}
