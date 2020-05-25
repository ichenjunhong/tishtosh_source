package com.p683ss.android.ttvecamera;

import android.util.Log;

/* renamed from: com.ss.android.ttvecamera.p */
public final class C20296p {

    /* renamed from: a */
    public static String f55775a = "VESDK-";

    /* renamed from: b */
    public static byte f55776b = 3;

    /* renamed from: c */
    public static C20297a f55777c = null;

    /* renamed from: d */
    private static byte f55778d = 1;

    /* renamed from: e */
    private static byte f55779e = 2;

    /* renamed from: f */
    private static byte f55780f = 4;

    /* renamed from: g */
    private static byte f55781g = 8;

    /* renamed from: h */
    private static byte f55782h = 16;

    /* renamed from: com.ss.android.ttvecamera.p$a */
    public interface C20297a {
        /* renamed from: a */
        void mo42937a(byte b, String str, String str2);
    }

    /* renamed from: a */
    public static void m50059a(String str, String str2) {
        if ((f55780f & f55776b) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f55775a);
            sb.append(str);
            String sb2 = sb.toString();
            if (f55777c != null) {
                f55777c.mo42937a(f55780f, sb2, str2);
            }
        }
    }

    /* renamed from: b */
    public static void m50061b(String str, String str2) {
        if ((f55781g & f55776b) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f55775a);
            sb.append(str);
            String sb2 = sb.toString();
            if (f55777c != null) {
                f55777c.mo42937a(f55781g, sb2, str2);
            }
        }
    }

    /* renamed from: c */
    public static void m50062c(String str, String str2) {
        if ((f55779e & f55776b) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f55775a);
            sb.append(str);
            String sb2 = sb.toString();
            if (f55777c != null) {
                f55777c.mo42937a(f55779e, sb2, str2);
            }
        }
    }

    /* renamed from: d */
    public static void m50063d(String str, String str2) {
        if ((f55778d & f55776b) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f55775a);
            sb.append(str);
            String sb2 = sb.toString();
            if (f55777c != null) {
                f55777c.mo42937a(f55778d, sb2, str2);
            }
        }
    }

    /* renamed from: a */
    public static void m50060a(String str, String str2, Throwable th) {
        if ((f55778d & f55776b) != 0 && f55777c != null) {
            C20297a aVar = f55777c;
            byte b = f55778d;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(th.getMessage());
            sb.append("stack: ");
            sb.append(Log.getStackTraceString(th));
            aVar.mo42937a(b, str, sb.toString());
        }
    }
}
