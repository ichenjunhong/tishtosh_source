package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.zh */
public final class C16425zh {
    /* renamed from: a */
    public static int m39224a(byte b) {
        return b < 0 ? b + 256 : b;
    }

    /* renamed from: a */
    public static long m39225a(ByteBuffer byteBuffer) {
        long j = (long) byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    /* renamed from: b */
    public static int m39226b(ByteBuffer byteBuffer) {
        return (m39224a(byteBuffer.get()) << 8) + 0 + m39224a(byteBuffer.get());
    }

    /* renamed from: c */
    public static long m39227c(ByteBuffer byteBuffer) {
        long a = (m39225a(byteBuffer) << 32) + 0;
        if (a >= 0) {
            return a + m39225a(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    /* renamed from: d */
    public static double m39228d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = (double) (0 | ((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255));
        Double.isNaN(d);
        return d / 65536.0d;
    }

    /* renamed from: e */
    public static double m39229e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = (double) (0 | ((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255));
        Double.isNaN(d);
        return d / 1.073741824E9d;
    }

    /* renamed from: f */
    public static String m39230f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
