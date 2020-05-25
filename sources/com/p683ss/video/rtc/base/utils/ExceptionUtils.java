package com.p683ss.video.rtc.base.utils;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.ss.video.rtc.base.utils.ExceptionUtils */
public class ExceptionUtils {
    public static String cause(Throwable th) {
        String str = null;
        while (th != null && th.getCause() != null) {
            str = th.getCause().toString();
            th = th.getCause();
        }
        return str;
    }

    public static String stackTrace(Throwable th) {
        C17840a.m43751a(th, new PrintWriter(new StringWriter()));
        return th.toString();
    }
}
