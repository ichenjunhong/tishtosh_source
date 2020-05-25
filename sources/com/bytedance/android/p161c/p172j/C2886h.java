package com.bytedance.android.p161c.p172j;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.bytedance.android.c.j.h */
public final class C2886h {
    /* renamed from: a */
    public static boolean m8192a(String str) {
        if (str == null || "".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m8189a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        C17840a.m43751a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static String m8190a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        String str = "[";
        for (byte b : bArr) {
            StringBuilder sb = new StringBuilder("'");
            sb.append(b);
            sb.append("',");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: a */
    public static String m8191a(Object[] objArr) {
        if (objArr == null) {
            return "";
        }
        String str = "[";
        for (Object obj : objArr) {
            StringBuilder sb = new StringBuilder("'");
            sb.append(obj.toString());
            sb.append("',");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }
}
