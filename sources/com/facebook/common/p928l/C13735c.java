package com.facebook.common.p928l;

import java.io.UnsupportedEncodingException;

/* renamed from: com.facebook.common.l.c */
public final class C13735c {

    /* renamed from: a */
    public static final boolean f35722a;

    /* renamed from: b */
    public static final boolean f35723b;

    /* renamed from: c */
    public static final boolean f35724c;

    /* renamed from: d */
    public static C13733b f35725d = null;

    /* renamed from: e */
    public static final byte[] f35726e = m27788a("VP8 ");

    /* renamed from: f */
    public static final byte[] f35727f = m27788a("VP8L");

    /* renamed from: g */
    public static final byte[] f35728g = m27788a("VP8X");

    /* renamed from: h */
    private static boolean f35729h = false;

    /* renamed from: i */
    private static final byte[] f35730i = m27788a("RIFF");

    /* renamed from: j */
    private static final byte[] f35731j = m27788a("WEBP");

    /* renamed from: a */
    public static C13733b m27785a() {
        if (f35729h) {
            return f35725d;
        }
        C13733b bVar = null;
        try {
            bVar = (C13733b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        f35729h = true;
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r1.outWidth == 1) goto L_0x003c;
     */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            r2 = 1
            r3 = 0
            if (r0 > r1) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            f35722a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 14
            if (r0 < r4) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            f35723b = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r1) goto L_0x001e
        L_0x001c:
            r2 = 0
            goto L_0x003c
        L_0x001e:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 != r1) goto L_0x003c
            java.lang.String r0 = "UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA=="
            byte[] r0 = android.util.Base64.decode(r0, r3)
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r1.inJustDecodeBounds = r2
            int r4 = r0.length
            android.graphics.BitmapFactory.decodeByteArray(r0, r3, r4, r1)
            int r0 = r1.outHeight
            if (r0 != r2) goto L_0x001c
            int r0 = r1.outWidth
            if (r0 == r2) goto L_0x003c
            goto L_0x001c
        L_0x003c:
            f35724c = r2
            r0 = 0
            f35725d = r0
            f35729h = r3
            java.lang.String r0 = "RIFF"
            byte[] r0 = m27788a(r0)
            f35730i = r0
            java.lang.String r0 = "WEBP"
            byte[] r0 = m27788a(r0)
            f35731j = r0
            java.lang.String r0 = "VP8 "
            byte[] r0 = m27788a(r0)
            f35726e = r0
            java.lang.String r0 = "VP8L"
            byte[] r0 = m27788a(r0)
            f35727f = r0
            java.lang.String r0 = "VP8X"
            byte[] r0 = m27788a(r0)
            f35728g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.p928l.C13735c.<clinit>():void");
    }

    /* renamed from: a */
    private static byte[] m27788a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: a */
    public static boolean m27786a(byte[] bArr, int i, int i2) {
        if (i2 < 20 || !m27787a(bArr, i, f35730i) || !m27787a(bArr, i + 8, f35731j)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m27787a(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
