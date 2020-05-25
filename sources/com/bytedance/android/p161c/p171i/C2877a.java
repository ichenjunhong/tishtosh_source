package com.bytedance.android.p161c.p171i;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bytedance.android.c.i.a */
public final class C2877a {
    /* renamed from: a */
    private static MessageDigest m8174a() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0080 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.bytedance.android.p161c.p168g.C2854a> m8175a(java.io.InputStream r16) throws java.io.IOException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r3 = r16
            r2.<init>(r3)
            r1.<init>(r2)
            java.lang.String r2 = "config"
            com.bytedance.android.c.g.a r3 = new com.bytedance.android.c.g.a
            r3.<init>()
            java.security.MessageDigest r4 = m8174a()
            r7 = 0
        L_0x001d:
            r8 = 0
            r10 = 0
        L_0x0020:
            java.lang.String r11 = r1.readLine()
            if (r11 == 0) goto L_0x0186
            java.lang.String r11 = r11.trim()
            r12 = 1
            if (r11 == 0) goto L_0x003c
            java.lang.String r13 = ""
            java.lang.String r14 = r11.trim()
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r13 = 0
            goto L_0x003d
        L_0x003c:
            r13 = 1
        L_0x003d:
            if (r13 != 0) goto L_0x0020
            if (r4 == 0) goto L_0x0048
            byte[] r13 = r11.getBytes()
            r4.update(r13)
        L_0x0048:
            int r13 = r2.hashCode()
            r14 = -1354792126(0xffffffffaf3f8342, float:-1.7417981E-10)
            r15 = 2
            if (r13 == r14) goto L_0x0071
            r14 = -894949835(0xffffffffcaa82635, float:-5509914.5)
            if (r13 == r14) goto L_0x0067
            r14 = -389939970(0xffffffffe8c1fcfe, float:-7.328669E24)
            if (r13 == r14) goto L_0x005d
            goto L_0x007b
        L_0x005d:
            java.lang.String r13 = "read_origin_info"
            boolean r13 = r2.equals(r13)
            if (r13 == 0) goto L_0x007b
            r13 = 2
            goto L_0x007c
        L_0x0067:
            java.lang.String r13 = "read_block_point"
            boolean r13 = r2.equals(r13)
            if (r13 == 0) goto L_0x007b
            r13 = 1
            goto L_0x007c
        L_0x0071:
            java.lang.String r13 = "config"
            boolean r13 = r2.equals(r13)
            if (r13 == 0) goto L_0x007b
            r13 = 0
            goto L_0x007c
        L_0x007b:
            r13 = -1
        L_0x007c:
            r14 = 3
            switch(r13) {
                case 0: goto L_0x014f;
                case 1: goto L_0x00f4;
                case 2: goto L_0x0088;
                default: goto L_0x0080;
            }
        L_0x0080:
            com.bytedance.android.c.c.b r0 = new com.bytedance.android.c.c.b
            java.lang.String r1 = "Unknown file format while read metadata!"
            r0.<init>(r1)
            throw r0
        L_0x0088:
            java.util.Map<java.lang.String, com.bytedance.android.c.g.b<java.lang.Long, java.lang.String>> r13 = r3.f8492f
            if (r13 != 0) goto L_0x0093
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            r3.f8492f = r13
        L_0x0093:
            java.lang.String r13 = " "
            java.lang.String[] r13 = r11.split(r13)
            int r5 = r13.length
            if (r5 != r14) goto L_0x00e0
            r5 = r13[r12]
            long r5 = java.lang.Long.parseLong(r5)
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x00a7
            r8 = r5
        L_0x00a7:
            com.bytedance.android.c.g.b r11 = new com.bytedance.android.c.g.b
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = r13[r15]
            r11.<init>(r5, r6)
            java.util.Map<java.lang.String, com.bytedance.android.c.g.b<java.lang.Long, java.lang.String>> r5 = r3.f8492f
            r6 = r13[r7]
            r5.put(r6, r11)
            int r10 = r10 + -1
            if (r10 > 0) goto L_0x0020
            r3.f8494h = r8
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r4 = r4.digest()
            r2.<init>(r12, r4)
            r4 = 16
            java.lang.String r2 = r2.toString(r4)
            r3.f8498l = r2
            r0.add(r3)
            com.bytedance.android.c.g.a r3 = new com.bytedance.android.c.g.a
            r3.<init>()
            java.lang.String r2 = "config"
            java.security.MessageDigest r4 = m8174a()
            goto L_0x001d
        L_0x00e0:
            com.bytedance.android.c.c.b r0 = new com.bytedance.android.c.c.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid file format while read so info: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f4:
            java.lang.String r5 = " "
            java.lang.String[] r5 = r11.split(r5)
            int r6 = r5.length
            if (r6 != r15) goto L_0x013b
            java.util.List<java.lang.Long> r6 = r3.f8490d
            if (r6 != 0) goto L_0x0108
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r3.f8490d = r6
        L_0x0108:
            java.util.List<java.lang.Long> r6 = r3.f8491e
            if (r6 != 0) goto L_0x0113
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r3.f8491e = r6
        L_0x0113:
            java.util.List<java.lang.Long> r6 = r3.f8490d
            r11 = r5[r7]
            long r13 = java.lang.Long.parseLong(r11)
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r6.add(r11)
            java.util.List<java.lang.Long> r6 = r3.f8491e
            r5 = r5[r12]
            long r11 = java.lang.Long.parseLong(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            r6.add(r5)
            int r10 = r10 + -1
            if (r10 > 0) goto L_0x0020
            java.lang.String r2 = "read_origin_info"
            int r10 = r3.f8489c
            goto L_0x0020
        L_0x013b:
            com.bytedance.android.c.c.b r0 = new com.bytedance.android.c.c.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid file format while read block point: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x014f:
            java.lang.String r2 = " "
            java.lang.String[] r2 = r11.split(r2)
            int r5 = r2.length
            if (r5 != r14) goto L_0x0172
            r5 = r2[r7]
            r3.f8487a = r5
            r5 = r2[r12]
            int r5 = java.lang.Integer.parseInt(r5)
            r3.f8488b = r5
            r2 = r2[r15]
            int r2 = java.lang.Integer.parseInt(r2)
            r3.f8489c = r2
            java.lang.String r2 = "read_block_point"
            int r10 = r3.f8488b
            goto L_0x0020
        L_0x0172:
            com.bytedance.android.c.c.b r0 = new com.bytedance.android.c.c.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid file format while read config: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0186:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p161c.p171i.C2877a.m8175a(java.io.InputStream):java.util.List");
    }
}
