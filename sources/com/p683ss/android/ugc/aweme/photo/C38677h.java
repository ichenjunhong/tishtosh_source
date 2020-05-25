package com.p683ss.android.ugc.aweme.photo;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.ss.android.ugc.aweme.photo.h */
public final class C38677h {

    /* renamed from: a */
    private static final byte[] f98372a = {71, 73, 70, 56, 55, 97};

    /* renamed from: b */
    private static final byte[] f98373b = {71, 73, 70, 56, 57, 97};

    /* renamed from: c */
    private static final byte[] f98374c = {-1, -40, -1};

    /* renamed from: d */
    private static final byte[] f98375d = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: e */
    private static final byte[] f98376e = {66, 77};

    /* renamed from: f */
    private static final byte[] f98377f = {82, 73, 70, 70, 87, 69, 66, 80};

    /* renamed from: g */
    private static final byte[] f98378g = {0, 0, 0, 0, 102, 116, 121, 112};

    /* renamed from: h */
    private static final byte[] f98379h = {102, 116, 121, 112, 51, 103};

    /* renamed from: a */
    private static void m86029a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private static boolean m86032b(byte[] bArr) {
        byte[] bArr2 = f98378g;
        if (bArr == null || bArr.length != 12) {
            return false;
        }
        for (int i = 4; i < 8; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m86030a(byte[] bArr) {
        byte[] bArr2 = f98377f;
        if (bArr == null || bArr.length != 12) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if (bArr[(bArr.length - i2) - 1] != bArr2[(bArr2.length - i2) - 1]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m86028a(String str) {
        BufferedInputStream bufferedInputStream;
        String str2;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(str)));
            try {
                byte[] bArr = new byte[12];
                bufferedInputStream.read(bArr);
                if (!m86031a(bArr, f98373b)) {
                    if (!m86031a(bArr, f98372a)) {
                        if (m86031a(bArr, f98374c)) {
                            str2 = "image/jpg";
                        } else if (m86031a(bArr, f98375d)) {
                            str2 = "image/png";
                        } else if (m86031a(bArr, f98376e)) {
                            str2 = "image/bmp";
                        } else if (m86030a(bArr)) {
                            str2 = "image/webp";
                        } else if (m86032b(bArr)) {
                            str2 = "video/avc";
                        } else if (m86031a(bArr, f98379h)) {
                            str2 = "video/3gpp";
                        } else {
                            str2 = "";
                        }
                        m86029a((Closeable) bufferedInputStream);
                        return str2;
                    }
                }
                str2 = "image/gif";
                m86029a((Closeable) bufferedInputStream);
                return str2;
            } catch (Throwable th) {
                th = th;
                m86029a((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
            m86029a((Closeable) bufferedInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private static boolean m86031a(byte[] bArr, byte[] bArr2) {
        boolean z = false;
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= bArr2.length) {
                z = true;
                break;
            } else if (bArr[i] != bArr2[i]) {
                break;
            } else {
                i++;
            }
        }
        return z;
    }
}
