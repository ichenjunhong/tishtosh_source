package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.util.Base64;
import com.google.gson.C18085o;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52808d;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.h */
public final class C27179h {

    /* renamed from: a */
    public static final C27179h f71702a = new C27179h();

    /* renamed from: b */
    private static volatile AtomicInteger f71703b = new AtomicInteger(0);

    private C27179h() {
    }

    /* renamed from: a */
    public static AtomicInteger m65597a() {
        return f71703b;
    }

    /* renamed from: b */
    public static AtomicInteger m65599b() {
        return f71703b;
    }

    /* renamed from: a */
    public final String mo55529a(C18085o oVar) {
        C52711k.m112240b(oVar, "dataObj");
        try {
            byte[] a = m65598a(oVar.toString(), "UTF-8");
            if (a == null) {
                return null;
            }
            CharSequence subSequence = "PodsmmNttCSojTyx".subSequence(0, 4);
            StringBuilder sb = new StringBuilder();
            String substring = "PodsmmNttCSojTyx".substring(4);
            C52711k.m112236a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            sb.append(subSequence);
            String sb2 = sb.toString();
            Charset charset = C52808d.f131043a;
            if (sb2 != null) {
                byte[] bytes = sb2.getBytes(charset);
                C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                C52711k.m112240b(bytes, "key");
                C52711k.m112240b(a, "clear");
                SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
                Cipher instance = Cipher.getInstance("AES/ECB/PKCS7Padding");
                instance.init(1, secretKeySpec);
                byte[] doFinal = instance.doFinal(a);
                if (doFinal == null) {
                    return null;
                }
                return Base64.encodeToString(doFinal, 0);
            }
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m65598a(java.lang.String r4, java.lang.String r5) {
        /*
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x000e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            r1 = 0
            if (r0 == 0) goto L_0x0013
            return r1
        L_0x0013:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x004f, all -> 0x0047 }
            r3 = r0
            java.io.OutputStream r3 = (java.io.OutputStream) r3     // Catch:{ IOException -> 0x004f, all -> 0x0047 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x004f, all -> 0x0047 }
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            java.lang.String r1 = "Charset.forName(charsetName)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r1)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            if (r4 == 0) goto L_0x003b
            byte[] r4 = r4.getBytes(r5)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            java.lang.String r5 = "(this as java.lang.String).getBytes(charset)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            r2.write(r4)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            r2.close()
            goto L_0x0054
        L_0x003b:
            d.u r4 = new d.u     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.String"
            r4.<init>(r5)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            throw r4     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
        L_0x0043:
            r4 = move-exception
            goto L_0x0049
        L_0x0045:
            r1 = r2
            goto L_0x004f
        L_0x0047:
            r4 = move-exception
            r2 = r1
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            r2.close()
        L_0x004e:
            throw r4
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.close()
        L_0x0054:
            byte[] r4 = r0.toByteArray()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.business.C27179h.m65598a(java.lang.String, java.lang.String):byte[]");
    }
}
