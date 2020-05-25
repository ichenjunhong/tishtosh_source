package com.bytedance.p702im.core.internal.utils;

import com.bytedance.p702im.core.p705b.C11176d;

/* renamed from: com.bytedance.im.core.internal.utils.e */
public final class C11467e {

    /* renamed from: a */
    public static int f30774a = 2;

    /* renamed from: a */
    public static boolean m23466a() {
        if (f30774a <= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m23462a(String str) {
        m23463a("imsdk", str);
    }

    /* renamed from: b */
    public static void m23467b(String str) {
        m23468b("imsdk", str);
    }

    /* renamed from: c */
    public static void m23470c(String str) {
        m23473d("imsdk", str);
    }

    /* renamed from: d */
    public static void m23472d(String str) {
        m23471c("imsdk", str);
    }

    /* renamed from: e */
    private static void m23474e(String str, String str2) {
        C11176d.m22634a(str, str2, (Throwable) null);
    }

    /* renamed from: a */
    public static void m23463a(String str, String str2) {
        if (str2 != null) {
            m23474e(str, str2);
        }
    }

    /* renamed from: b */
    public static void m23468b(String str, String str2) {
        if (str2 != null) {
            m23474e(str, str2);
        }
    }

    /* renamed from: c */
    public static void m23471c(String str, String str2) {
        if (str2 != null) {
            m23474e(str, str2);
        }
    }

    /* renamed from: d */
    private static void m23473d(String str, String str2) {
        if (str2 != null) {
            m23474e(str, str2);
        }
    }

    /* renamed from: a */
    public static void m23465a(String str, Throwable th) {
        if (str != null || th != null) {
            m23469b("", str, th);
        }
    }

    /* renamed from: a */
    public static void m23464a(String str, String str2, Throwable th) {
        m23469b(str, str2, th);
    }

    /* renamed from: b */
    private static void m23469b(String str, String str2, Throwable th) {
        C11176d.m22634a(str, str2, th);
    }
}
