package com.bytedance.android.p161c.p172j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;

/* renamed from: com.bytedance.android.c.j.f */
public final class C2884f {
    /* renamed from: a */
    public static String m8186a(File file) {
        if (!file.isFile()) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            return m8187a((InputStream) new FileInputStream(file));
        } catch (FileNotFoundException unused) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("timed: file ");
            sb.append(file.getName());
            sb.append(" md5 time is ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            printStream.println(sb.toString());
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0032 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m8187a(java.io.InputStream r7) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]
            r2 = 0
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ Exception -> 0x0032, all -> 0x002c }
        L_0x000b:
            r4 = 0
            int r5 = r7.read(r1, r4, r0)     // Catch:{ Exception -> 0x0032, all -> 0x002c }
            r6 = -1
            if (r5 == r6) goto L_0x0017
            r3.update(r1, r4, r5)     // Catch:{ Exception -> 0x0032, all -> 0x002c }
            goto L_0x000b
        L_0x0017:
            r7.close()     // Catch:{ IOException -> 0x002b }
            java.math.BigInteger r7 = new java.math.BigInteger
            r0 = 1
            byte[] r1 = r3.digest()
            r7.<init>(r0, r1)
            r0 = 16
            java.lang.String r7 = r7.toString(r0)
            return r7
        L_0x002b:
            return r2
        L_0x002c:
            r0 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0031 }
            throw r0
        L_0x0031:
            return r2
        L_0x0032:
            r7.close()     // Catch:{ IOException -> 0x0036 }
            return r2
        L_0x0036:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p161c.p172j.C2884f.m8187a(java.io.InputStream):java.lang.String");
    }
}
