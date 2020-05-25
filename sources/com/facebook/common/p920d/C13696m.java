package com.facebook.common.p920d;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.facebook.common.d.m */
public final class C13696m {
    /* renamed from: a */
    public static void m27665a(Throwable th) {
        m27666a(th, Error.class);
        m27666a(th, RuntimeException.class);
    }

    /* renamed from: b */
    public static RuntimeException m27667b(Throwable th) {
        m27665a((Throwable) C13689i.m27652a(th));
        throw new RuntimeException(th);
    }

    /* renamed from: c */
    public static String m27668c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        C17840a.m43751a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    private static <X extends Throwable> void m27666a(Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }
}
