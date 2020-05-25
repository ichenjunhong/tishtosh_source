package com.bytedance.geckox.utils;

import java.io.Closeable;
import java.io.InputStream;
import java.security.MessageDigest;

/* renamed from: com.bytedance.geckox.utils.i */
public final class C10161i {

    /* renamed from: a */
    static final char[] f27496a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static void m20487a(InputStream inputStream, String str) throws Exception {
        if (str != null) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 4096);
                        if (read == -1) {
                            break;
                        }
                        instance.update(bArr, 0, read);
                    }
                    C10152b.m20477a((Closeable) inputStream);
                    try {
                        byte[] digest = instance.digest();
                        String a = m20486a(digest, 0, digest.length);
                        if (!str.equals(a)) {
                            StringBuilder sb = new StringBuilder("md5 check failed file: local md5:");
                            sb.append(a);
                            sb.append(" expect md5:");
                            sb.append(str);
                            throw new RuntimeException(sb.toString());
                        }
                    } catch (Exception e) {
                        StringBuilder sb2 = new StringBuilder("md5 check failed:");
                        sb2.append(e.getMessage());
                        throw new RuntimeException(sb2.toString(), e);
                    }
                } catch (Exception e2) {
                    StringBuilder sb3 = new StringBuilder("md5 check failed:");
                    sb3.append(e2.getMessage());
                    throw new RuntimeException(sb3.toString(), e2);
                } catch (Throwable th) {
                    C10152b.m20477a((Closeable) inputStream);
                    throw th;
                }
            } catch (Exception e3) {
                StringBuilder sb4 = new StringBuilder("md5 check failed:");
                sb4.append(e3.getMessage());
                throw new RuntimeException(sb4.toString(), e3);
            }
        } else {
            throw new RuntimeException("md5 check failed: md5 == null");
        }
    }

    /* renamed from: a */
    private static String m20486a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b = bArr[i5 + 0] & 255;
                int i6 = i4 + 1;
                cArr[i4] = f27496a[b >> 4];
                i4 = i6 + 1;
                cArr[i6] = f27496a[b & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
