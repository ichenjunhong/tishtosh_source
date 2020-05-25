package com.google.android.gms.internal.ads;

import java.io.IOException;

final class awk {
    /* renamed from: a */
    static int m34276a(byte[] bArr, int i, awl awl) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m34271a((int) b, bArr, i2, awl);
        }
        awl.f41461a = b;
        return i2;
    }

    /* renamed from: a */
    static int m34271a(int i, byte[] bArr, int i2, awl awl) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            awl.f41461a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            awl.f41461a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            awl.f41461a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            awl.f41461a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                awl.f41461a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: b */
    static int m34278b(byte[] bArr, int i, awl awl) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            awl.f41462b = j;
            return i2;
        }
        long j2 = j & 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j3 = j2 | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        awl.f41462b = j3;
        return i3;
    }

    /* renamed from: a */
    static int m34275a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: b */
    static long m34279b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: c */
    static double m34280c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m34279b(bArr, i));
    }

    /* renamed from: d */
    static float m34282d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m34275a(bArr, i));
    }

    /* renamed from: c */
    static int m34281c(byte[] bArr, int i, awl awl) throws ayi {
        int a = m34276a(bArr, i, awl);
        int i2 = awl.f41461a;
        if (i2 < 0) {
            throw ayi.m34779b();
        } else if (i2 == 0) {
            awl.f41463c = "";
            return a;
        } else {
            awl.f41463c = new String(bArr, a, i2, ayb.f41627a);
            return a + i2;
        }
    }

    /* renamed from: d */
    static int m34283d(byte[] bArr, int i, awl awl) throws ayi {
        int a = m34276a(bArr, i, awl);
        int i2 = awl.f41461a;
        if (i2 < 0) {
            throw ayi.m34779b();
        } else if (i2 == 0) {
            awl.f41463c = "";
            return a;
        } else {
            awl.f41463c = bbc.m35237b(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: e */
    static int m34284e(byte[] bArr, int i, awl awl) throws ayi {
        int a = m34276a(bArr, i, awl);
        int i2 = awl.f41461a;
        if (i2 < 0) {
            throw ayi.m34779b();
        } else if (i2 > bArr.length - a) {
            throw ayi.m34778a();
        } else if (i2 == 0) {
            awl.f41463c = awo.zzfuo;
            return a;
        } else {
            awl.f41463c = awo.zzi(bArr, a, i2);
            return a + i2;
        }
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [int] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m34274a(com.google.android.gms.internal.ads.bab r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.awl r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m34271a(r8, r7, r0, r10)
            int r8 = r10.f41461a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo29894a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo29897a(r1, r2, r3, r4, r5)
            r6.mo29901c(r9)
            r10.f41463c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.ayi r6 = com.google.android.gms.internal.ads.ayi.m34778a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.awk.m34274a(com.google.android.gms.internal.ads.bab, byte[], int, int, com.google.android.gms.internal.ads.awl):int");
    }

    /* renamed from: a */
    static int m34273a(bab bab, byte[] bArr, int i, int i2, int i3, awl awl) throws IOException {
        azo azo = (azo) bab;
        Object a = azo.mo29894a();
        int a2 = azo.mo29893a(a, bArr, i, i2, i3, awl);
        azo.mo29901c(a);
        awl.f41463c = a;
        return a2;
    }

    /* renamed from: a */
    static int m34269a(int i, byte[] bArr, int i2, int i3, ayh<?> ayh, awl awl) {
        aya aya = (aya) ayh;
        int a = m34276a(bArr, i2, awl);
        aya.mo29835d(awl.f41461a);
        while (a < i3) {
            int a2 = m34276a(bArr, a, awl);
            if (i != awl.f41461a) {
                break;
            }
            a = m34276a(bArr, a2, awl);
            aya.mo29835d(awl.f41461a);
        }
        return a;
    }

    /* renamed from: a */
    static int m34277a(byte[] bArr, int i, ayh<?> ayh, awl awl) throws IOException {
        aya aya = (aya) ayh;
        int a = m34276a(bArr, i, awl);
        int i2 = awl.f41461a + a;
        while (a < i2) {
            a = m34276a(bArr, a, awl);
            aya.mo29835d(awl.f41461a);
        }
        if (a == i2) {
            return a;
        }
        throw ayi.m34778a();
    }

    /* renamed from: a */
    static int m34272a(bab<?> bab, int i, byte[] bArr, int i2, int i3, ayh<?> ayh, awl awl) throws IOException {
        int a = m34274a((bab) bab, bArr, i2, i3, awl);
        ayh.add(awl.f41463c);
        while (a < i3) {
            int a2 = m34276a(bArr, a, awl);
            if (i != awl.f41461a) {
                break;
            }
            a = m34274a((bab) bab, bArr, a2, i3, awl);
            ayh.add(awl.f41463c);
        }
        return a;
    }

    /* renamed from: a */
    static int m34270a(int i, byte[] bArr, int i2, int i3, bav bav, awl awl) throws ayi {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 5) {
                switch (i4) {
                    case 0:
                        int b = m34278b(bArr, i2, awl);
                        bav.mo29972a(i, (Object) Long.valueOf(awl.f41462b));
                        return b;
                    case 1:
                        bav.mo29972a(i, (Object) Long.valueOf(m34279b(bArr, i2)));
                        return i2 + 8;
                    case 2:
                        int a = m34276a(bArr, i2, awl);
                        int i5 = awl.f41461a;
                        if (i5 < 0) {
                            throw ayi.m34779b();
                        } else if (i5 <= bArr.length - a) {
                            if (i5 == 0) {
                                bav.mo29972a(i, (Object) awo.zzfuo);
                            } else {
                                bav.mo29972a(i, (Object) awo.zzi(bArr, a, i5));
                            }
                            return a + i5;
                        } else {
                            throw ayi.m34778a();
                        }
                    case 3:
                        bav b2 = bav.m35114b();
                        int i6 = (i & -8) | 4;
                        int i7 = 0;
                        while (true) {
                            if (i2 < i3) {
                                int a2 = m34276a(bArr, i2, awl);
                                int i8 = awl.f41461a;
                                if (i8 != i6) {
                                    i7 = i8;
                                    i2 = m34270a(i8, bArr, a2, i3, b2, awl);
                                } else {
                                    i7 = i8;
                                    i2 = a2;
                                }
                            }
                        }
                        if (i2 > i3 || i7 != i6) {
                            throw ayi.m34784g();
                        }
                        bav.mo29972a(i, (Object) b2);
                        return i2;
                    default:
                        throw ayi.m34781d();
                }
            } else {
                bav.mo29972a(i, (Object) Integer.valueOf(m34275a(bArr, i2)));
                return i2 + 4;
            }
        } else {
            throw ayi.m34781d();
        }
    }

    /* renamed from: a */
    static int m34268a(int i, byte[] bArr, int i2, int i3, awl awl) throws ayi {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 5) {
                return i2 + 4;
            }
            switch (i4) {
                case 0:
                    return m34278b(bArr, i2, awl);
                case 1:
                    return i2 + 8;
                case 2:
                    return m34276a(bArr, i2, awl) + awl.f41461a;
                case 3:
                    int i5 = (i & -8) | 4;
                    int i6 = 0;
                    while (i2 < i3) {
                        i2 = m34276a(bArr, i2, awl);
                        i6 = awl.f41461a;
                        if (i6 != i5) {
                            i2 = m34268a(i6, bArr, i2, i3, awl);
                        } else if (i2 > i3 && i6 == i5) {
                            return i2;
                        } else {
                            throw ayi.m34784g();
                        }
                    }
                    if (i2 > i3) {
                    }
                    throw ayi.m34784g();
                default:
                    throw ayi.m34781d();
            }
        } else {
            throw ayi.m34781d();
        }
    }
}
