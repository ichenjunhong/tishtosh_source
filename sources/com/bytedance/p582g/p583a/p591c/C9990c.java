package com.bytedance.p582g.p583a.p591c;

import android.content.Context;
import java.io.UnsupportedEncodingException;

/* renamed from: com.bytedance.g.a.c.c */
public final class C9990c {

    /* renamed from: a */
    public static C9992b f27121a = new C9991a();

    /* renamed from: b */
    public static boolean f27122b;

    /* renamed from: com.bytedance.g.a.c.c$a */
    public static class C9991a implements C9992b {
        /* renamed from: a */
        public final boolean mo17955a(Context context) {
            return false;
        }
    }

    /* renamed from: com.bytedance.g.a.c.c$b */
    public interface C9992b {
        /* renamed from: a */
        boolean mo17955a(Context context);
    }

    /* renamed from: a */
    public static byte[] m20086a(String str) {
        byte[] bArr;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    bArr = str.getBytes("UTF-8");
                    return bArr;
                }
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
        bArr = null;
        return bArr;
    }
}
