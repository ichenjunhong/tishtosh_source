package com.facebook.imageutils;

import com.facebook.common.p921e.C13697a;
import com.facebook.p955h.C13900c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.facebook.imageutils.c */
public final class C14254c {

    /* renamed from: a */
    private static Class f37159a;

    /* renamed from: b */
    private static Class f37160b;

    /* renamed from: c */
    private static C13900c f37161c;

    /* renamed from: d */
    private static Method f37162d;

    static {
        try {
            f37159a = Class.forName("com.ixigua.image.heif.Heif");
            f37160b = Class.forName("com.bytedance.fresco.heif.HeifDecoder");
        } catch (ClassNotFoundException e) {
            C13697a.m27696c("HeifFormatUtil", "Heif init ", (Throwable) e);
        }
    }

    /* renamed from: a */
    public static C13900c m29211a() {
        if (f37161c != null) {
            return f37161c;
        }
        if (f37160b == null) {
            return null;
        }
        try {
            f37161c = (C13900c) f37160b.getDeclaredField("HEIF_FORMAT").get(null);
        } catch (NoSuchFieldException e) {
            C13697a.m27696c("HeifFormatUtil", "HeifFormat init ", (Throwable) e);
        } catch (IllegalAccessException e2) {
            C13697a.m27696c("HeifFormatUtil", "HeifFormat init ", (Throwable) e2);
        } catch (Exception unused) {
        }
        return f37161c;
    }

    /* renamed from: a */
    public static int[] m29212a(byte[] bArr, int i) {
        if (f37159a == null) {
            return null;
        }
        try {
            if (f37162d == null) {
                f37162d = f37159a.getDeclaredMethod("parseMeta", new Class[]{byte[].class, Integer.TYPE});
            }
            if (f37162d != null) {
                f37162d.setAccessible(true);
                return (int[]) f37162d.invoke(null, new Object[]{bArr, Integer.valueOf(i)});
            }
        } catch (Exception | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }
}
