package android.support.p030v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.p030v4.content.p035a.C0712c.C0714b;
import android.support.p030v4.content.p035a.C0712c.C0715c;
import android.support.p030v4.p036d.C0747b.C0753b;
import android.support.p030v4.p038f.C0800n;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: android.support.v4.graphics.e */
final class C0821e extends C0824h {

    /* renamed from: a */
    static final Method f2776a;

    /* renamed from: b */
    private static final Class f2777b;

    /* renamed from: c */
    private static final Constructor f2778c;

    /* renamed from: d */
    private static final Method f2779d;

    C0821e() {
    }

    /* renamed from: a */
    private static Object m2357a() {
        try {
            return f2778c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        Method method;
        Method method2;
        Class cls;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method2 = null;
            method = null;
        }
        f2778c = constructor;
        f2777b = cls;
        f2776a = method;
        f2779d = method2;
    }

    /* renamed from: a */
    private static Typeface m2356a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2777b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2779d.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final Typeface mo2604a(Context context, CancellationSignal cancellationSignal, C0753b[] bVarArr, int i) {
        Object a = m2357a();
        C0800n nVar = new C0800n();
        for (C0753b bVar : bVarArr) {
            Uri uri = bVar.f2591a;
            ByteBuffer byteBuffer = (ByteBuffer) nVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = C0828i.m2388a(context, cancellationSignal, uri);
                nVar.put(uri, byteBuffer);
            }
            if (!m2358a(a, byteBuffer, bVar.f2592b, bVar.f2593c, bVar.f2594d)) {
                return null;
            }
        }
        return Typeface.create(m2356a(a), i);
    }

    /* renamed from: a */
    public final Typeface mo2663a(Context context, C0714b bVar, Resources resources, int i) {
        C0715c[] cVarArr;
        Object a = m2357a();
        for (C0715c cVar : bVar.f2503a) {
            ByteBuffer a2 = C0828i.m2387a(context, resources, cVar.f2509f);
            if (a2 == null || !m2358a(a, a2, cVar.f2508e, cVar.f2505b, cVar.f2506c)) {
                return null;
            }
        }
        return m2356a(a);
    }

    /* renamed from: a */
    private static boolean m2358a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f2776a.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
