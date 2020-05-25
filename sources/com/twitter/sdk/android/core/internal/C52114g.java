package com.twitter.sdk.android.core.internal;

import android.content.Context;
import android.content.res.Resources;
import com.twitter.sdk.android.core.C52190l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.twitter.sdk.android.core.internal.g */
public final class C52114g {

    /* renamed from: a */
    private static Boolean f129720a;

    /* renamed from: a */
    public static void m111466a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static boolean m111470a(Context context) {
        if (f129720a == null) {
            f129720a = Boolean.valueOf(m111471a(context, "com.twitter.sdk.android.TRACE_ENABLED", false));
        }
        return f129720a.booleanValue();
    }

    /* renamed from: a */
    public static void m111464a(Context context, String str) {
        m111470a(context);
    }

    /* renamed from: a */
    public static void m111467a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m111469a(String str, String str2) {
        if (C52190l.m111620b()) {
            throw new IllegalStateException(str2);
        }
    }

    /* renamed from: a */
    public static void m111465a(Context context, String str, Throwable th) {
        m111470a(context);
    }

    /* renamed from: a */
    public static String m111462a(Context context, String str, String str2) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int b = m111472b(context, str, "string");
                if (b > 0) {
                    return resources.getString(b);
                }
            }
        }
        return str2;
    }

    /* renamed from: b */
    private static int m111472b(Context context, String str, String str2) {
        String str3;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            str3 = context.getResources().getResourcePackageName(i);
        } else {
            str3 = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, str3);
    }

    /* renamed from: a */
    public static void m111468a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static boolean m111471a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int b = m111472b(context, str, "bool");
                if (b > 0) {
                    return resources.getBoolean(b);
                }
                int b2 = m111472b(context, str, "string");
                if (b2 > 0) {
                    return Boolean.parseBoolean(context.getString(b2));
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public static void m111463a(Context context, int i, String str, String str2) {
        m111470a(context);
    }
}
