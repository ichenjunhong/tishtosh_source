package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import java.math.BigInteger;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.r */
public final class C29455r {

    /* renamed from: b */
    public static final C29455r f77117b = new C29455r(0);

    /* renamed from: a */
    public final BigInteger f77118a;

    /* renamed from: a */
    public final byte[] mo59527a() {
        return m69478a(this.f77118a);
    }

    /* renamed from: b */
    public final long mo59528b() {
        return this.f77118a.longValue();
    }

    public final int hashCode() {
        return this.f77118a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZipEightByteInteger value: ");
        sb.append(this.f77118a);
        return sb.toString();
    }

    public C29455r(long j) {
        this(BigInteger.valueOf(j));
    }

    private C29455r(BigInteger bigInteger) {
        this.f77118a = bigInteger;
    }

    /* renamed from: a */
    public static long m69475a(byte[] bArr) {
        return m69476a(bArr, 0).longValue();
    }

    /* renamed from: a */
    public static byte[] m69477a(long j) {
        return m69478a(BigInteger.valueOf(j));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C29455r)) {
            return false;
        }
        return this.f77118a.equals(((C29455r) obj).f77118a);
    }

    /* renamed from: a */
    private static byte[] m69478a(BigInteger bigInteger) {
        long longValue = bigInteger.longValue();
        byte[] bArr = {(byte) ((int) (255 & longValue)), (byte) ((int) ((65280 & longValue) >> 8)), (byte) ((int) ((16711680 & longValue) >> 16)), (byte) ((int) ((4278190080L & longValue) >> 24)), (byte) ((int) ((1095216660480L & longValue) >> 32)), (byte) ((int) ((280375465082880L & longValue) >> 40)), (byte) ((int) ((71776119061217280L & longValue) >> 48)), (byte) ((int) ((longValue & 9151314442816847872L) >> 56))};
        if (bigInteger.testBit(63)) {
            bArr[7] = (byte) (bArr[7] | Byte.MIN_VALUE);
        }
        return bArr;
    }

    public C29455r(byte[] bArr, int i) {
        this.f77118a = m69476a(bArr, i);
    }

    /* renamed from: a */
    private static BigInteger m69476a(byte[] bArr, int i) {
        int i2 = i + 7;
        BigInteger valueOf = BigInteger.valueOf(((((long) bArr[i2]) << 56) & 9151314442816847872L) + ((((long) bArr[i + 6]) << 48) & 71776119061217280L) + ((((long) bArr[i + 5]) << 40) & 280375465082880L) + ((((long) bArr[i + 4]) << 32) & 1095216660480L) + ((((long) bArr[i + 3]) << 24) & 4278190080L) + ((((long) bArr[i + 2]) << 16) & 16711680) + ((((long) bArr[i + 1]) << 8) & 65280) + (((long) bArr[i]) & 255));
        if ((bArr[i2] & Byte.MIN_VALUE) == Byte.MIN_VALUE) {
            return valueOf.setBit(63);
        }
        return valueOf;
    }
}
