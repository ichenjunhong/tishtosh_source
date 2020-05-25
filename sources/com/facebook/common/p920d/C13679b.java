package com.facebook.common.p920d;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.facebook.common.d.b */
public final class C13679b {

    /* renamed from: a */
    static final Logger f35657a = Logger.getLogger(C13679b.class.getName());

    private C13679b() {
    }

    /* renamed from: a */
    public static void m27634a(InputStream inputStream) {
        try {
            m27633a(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static void m27633a(Closeable closeable, boolean z) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                f35657a.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
            }
        }
    }
}
