package com.p1081h.p1082a;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: com.h.a.h */
final class C18119h {
    /* renamed from: a */
    static <T> T m44335a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static String m44336a(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        C17840a.m43751a(th, printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}
