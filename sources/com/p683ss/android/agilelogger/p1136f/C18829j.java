package com.p683ss.android.agilelogger.p1136f;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.agilelogger.C18778a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: com.ss.android.agilelogger.f.j */
public final class C18829j {

    /* renamed from: a */
    private static final String f52008a;

    static {
        String name = C18778a.class.getName();
        f52008a = name.substring(0, name.lastIndexOf(46) + 1);
    }

    /* renamed from: a */
    public static String m45923a(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "ALOG:UnknownHostException";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            C17840a.m43751a(th, printWriter);
        } catch (Throwable unused) {
        }
        printWriter.flush();
        return stringWriter.toString();
    }
}
