package com.bytedance.android.p173d.p176b;

import android.os.Build.VERSION;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: com.bytedance.android.d.b.j */
final class C2936j {

    /* renamed from: a */
    public static Class f8636a;

    /* renamed from: b */
    public static Method f8637b;

    /* renamed from: c */
    public static Class f8638c;

    /* renamed from: d */
    public static Method f8639d;

    /* renamed from: e */
    public static Method f8640e;

    /* renamed from: f */
    public static Class f8641f;

    /* renamed from: g */
    public static Method f8642g;

    /* renamed from: b */
    private static void m8364b(final MappedByteBuffer mappedByteBuffer) {
        AccessController.doPrivileged(new PrivilegedAction<Object>() {
            public final Object run() {
                try {
                    if (C2936j.f8636a == null) {
                        C2936j.f8636a = Class.forName("java.nio.MappedByteBufferAdapter");
                    }
                    if (C2936j.f8637b == null) {
                        C2936j.f8637b = C2936j.f8636a.getMethod("free", new Class[0]);
                    }
                    C2936j.f8637b.setAccessible(true);
                    C2936j.f8637b.invoke(mappedByteBuffer, new Object[0]);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Unable to unmap MappedByteBuffer! API: ");
                    sb.append(VERSION.SDK_INT);
                    C2909b.m8285a(sb.toString(), e);
                }
                return null;
            }
        });
    }

    /* renamed from: c */
    private static void m8365c(final MappedByteBuffer mappedByteBuffer) {
        AccessController.doPrivileged(new PrivilegedAction<Object>() {
            public final Object run() {
                try {
                    if (C2936j.f8638c == null) {
                        C2936j.f8638c = Class.forName("java.nio.DirectByteBuffer");
                    }
                    if (C2936j.f8639d == null) {
                        C2936j.f8639d = C2936j.f8638c.getMethod("free", new Class[0]);
                    }
                    C2936j.f8639d.setAccessible(true);
                    C2936j.f8639d.invoke(mappedByteBuffer, new Object[0]);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Unable to unmap MappedByteBuffer! API: ");
                    sb.append(VERSION.SDK_INT);
                    C2909b.m8285a(sb.toString(), e);
                }
                return null;
            }
        });
    }

    /* renamed from: d */
    private static void m8366d(final MappedByteBuffer mappedByteBuffer) {
        AccessController.doPrivileged(new PrivilegedAction<Object>() {
            public final Object run() {
                try {
                    if (C2936j.f8640e == null) {
                        C2936j.f8640e = mappedByteBuffer.getClass().getMethod("cleaner", new Class[0]);
                    }
                    if (C2936j.f8641f == null) {
                        C2936j.f8641f = Class.forName("sun.misc.Cleaner");
                    }
                    if (C2936j.f8642g == null) {
                        C2936j.f8642g = C2936j.f8641f.getMethod("clean", new Class[0]);
                    }
                    C2936j.f8640e.setAccessible(true);
                    C2936j.f8642g.setAccessible(true);
                    C2936j.f8642g.invoke(C2936j.f8640e.invoke(mappedByteBuffer, new Object[0]), new Object[0]);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Unable to unmap MappedByteBuffer! API: ");
                    sb.append(VERSION.SDK_INT);
                    C2909b.m8285a(sb.toString(), e);
                }
                return null;
            }
        });
    }

    /* renamed from: a */
    static void m8363a(MappedByteBuffer mappedByteBuffer) {
        if (mappedByteBuffer != null) {
            mappedByteBuffer.force();
            if (VERSION.SDK_INT <= 17) {
                m8364b(mappedByteBuffer);
            } else if (VERSION.SDK_INT < 23) {
                m8365c(mappedByteBuffer);
            } else {
                m8366d(mappedByteBuffer);
            }
        }
    }
}
