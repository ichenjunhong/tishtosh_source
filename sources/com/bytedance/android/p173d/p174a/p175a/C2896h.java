package com.bytedance.android.p173d.p174a.p175a;

import com.C2240a;
import java.io.IOException;

/* renamed from: com.bytedance.android.d.a.a.h */
public final class C2896h {
    /* renamed from: b */
    public static int m8231b(C2895g gVar) throws IOException {
        return gVar.mo7520e();
    }

    /* renamed from: c */
    public static long m8232c(C2895g gVar) throws IOException {
        return gVar.mo7521f();
    }

    /* renamed from: e */
    public static String m8234e(C2895g gVar) throws IOException {
        return gVar.mo7519d();
    }

    /* renamed from: f */
    public static byte[] m8235f(C2895g gVar) throws IOException {
        return gVar.mo7518c();
    }

    /* renamed from: d */
    public static double m8233d(C2895g gVar) throws IOException {
        return Double.longBitsToDouble(gVar.mo7523h());
    }

    /* renamed from: a */
    public static boolean m8230a(C2895g gVar) throws IOException {
        int e = gVar.mo7520e();
        if (e == 0) {
            return false;
        }
        if (e == 1) {
            return true;
        }
        throw new IOException(C2240a.m6772a("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(e)}));
    }

    /* renamed from: g */
    public static void m8236g(C2895g gVar) throws IOException {
        int i = gVar.f8557a;
        if (i != 5) {
            switch (i) {
                case 0:
                    gVar.mo7521f();
                    return;
                case 1:
                    gVar.mo7523h();
                    return;
                case 2:
                    gVar.mo7518c();
                    return;
                default:
                    throw new IllegalStateException("Unexpected field encoding found!");
            }
        } else {
            gVar.mo7522g();
        }
    }
}
