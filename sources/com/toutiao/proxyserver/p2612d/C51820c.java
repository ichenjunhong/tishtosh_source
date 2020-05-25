package com.toutiao.proxyserver.p2612d;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: com.toutiao.proxyserver.d.c */
public final class C51820c {

    /* renamed from: a */
    public static C51818a f129298a;

    /* renamed from: b */
    public static boolean f129299b;

    /* renamed from: a */
    public static String m111138a(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "UnknownHostException";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        C17840a.m43751a(th, printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static void m111139a(String str, String str2) {
        m111140a(str, str2, null);
    }

    /* renamed from: b */
    public static void m111141b(String str, String str2) {
        m111142b(str, str2, null);
    }

    /* renamed from: c */
    public static void m111143c(String str, String str2) {
        m111144c(str, str2, null);
    }

    /* renamed from: d */
    public static void m111145d(String str, String str2) {
        m111146d(str, str2, null);
    }

    /* renamed from: a */
    public static void m111140a(String str, String str2, String str3) {
        if (f129298a != null && f129299b) {
            f129298a.mo95394a(str, str2, str3);
        }
    }

    /* renamed from: b */
    public static void m111142b(String str, String str2, String str3) {
        if (f129298a != null && f129299b) {
            f129298a.mo95395b(str, str2, str3);
        }
    }

    /* renamed from: c */
    public static void m111144c(String str, String str2, String str3) {
        if (f129298a != null && f129299b) {
            f129298a.mo95396c(str, str2, str3);
        }
    }

    /* renamed from: d */
    public static void m111146d(String str, String str2, String str3) {
        if (f129298a != null && f129299b) {
            f129298a.mo95397d(str, str2, str3);
        }
    }
}
