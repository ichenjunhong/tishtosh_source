package org.webrtc;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtils {
    public static String stackTrace(Throwable th) {
        C17840a.m43751a(th, new PrintWriter(new StringWriter()));
        return th.toString();
    }
}
