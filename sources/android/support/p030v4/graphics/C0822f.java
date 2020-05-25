package android.support.p030v4.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.Builder;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.support.p030v4.content.p035a.C0712c.C0714b;
import android.support.p030v4.content.p035a.C0712c.C0715c;
import android.support.p030v4.p036d.C0747b;
import android.support.p030v4.p036d.C0747b.C0753b;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: android.support.v4.graphics.f */
public class C0822f extends C0808d {

    /* renamed from: a */
    protected final Class f2780a;

    /* renamed from: b */
    protected final Constructor f2781b;

    /* renamed from: c */
    protected final Method f2782c;

    /* renamed from: d */
    protected final Method f2783d;

    /* renamed from: e */
    protected final Method f2784e;

    /* renamed from: f */
    protected final Method f2785f;

    /* renamed from: g */
    protected final Method f2786g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Method mo2666a(Class cls) throws NoSuchMethodException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: a */
    private boolean m2361a() {
        if (this.f2782c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private Object m2364b() {
        try {
            return this.f2781b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public C0822f() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor constructor;
        Method method5;
        Class cls = null;
        try {
            Class cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method4 = cls2.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
            method3 = cls2.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
            method2 = cls2.getMethod("freeze", new Class[0]);
            method5 = cls2.getMethod("abortCreation", new Class[0]);
            method = mo2666a(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f2780a = cls;
        this.f2781b = constructor;
        this.f2782c = method4;
        this.f2783d = method3;
        this.f2784e = method2;
        this.f2785f = method5;
        this.f2786g = method;
    }

    /* renamed from: c */
    private void m2366c(Object obj) {
        try {
            this.f2785f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private boolean m2365b(Object obj) {
        try {
            return ((Boolean) this.f2784e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo2665a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2780a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2786g.invoke(null, new Object[]{newInstance, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final Typeface mo2604a(Context context, CancellationSignal cancellationSignal, C0753b[] bVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        Throwable th2;
        if (bVarArr.length <= 0) {
            return null;
        }
        if (!m2361a()) {
            C0753b a = mo2667a(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(a.f2591a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Builder(openFileDescriptor.getFileDescriptor()).setWeight(a.f2593c).setItalic(a.f2594d).build();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return build;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    th = r12;
                    th2 = th4;
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map a2 = C0747b.m2147a(context, bVarArr, cancellationSignal);
            Object b = m2364b();
            boolean z = false;
            for (C0753b bVar : bVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) a2.get(bVar.f2591a);
                if (byteBuffer != null) {
                    if (!m2363a(b, byteBuffer, bVar.f2592b, bVar.f2593c, bVar.f2594d ? 1 : 0)) {
                        m2366c(b);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m2366c(b);
                return null;
            } else if (!m2365b(b)) {
                return null;
            } else {
                return Typeface.create(mo2665a(b), i);
            }
        }
        if (openFileDescriptor != null) {
            if (th != null) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable th5) {
                    C17840a.m43752a(th, th5);
                }
            } else {
                openFileDescriptor.close();
            }
        }
        throw th2;
        throw th2;
    }

    /* renamed from: a */
    public final Typeface mo2663a(Context context, C0714b bVar, Resources resources, int i) {
        C0715c[] cVarArr;
        if (!m2361a()) {
            return super.mo2663a(context, bVar, resources, i);
        }
        Object b = m2364b();
        for (C0715c cVar : bVar.f2503a) {
            if (!m2362a(context, b, cVar.f2504a, cVar.f2508e, cVar.f2505b, cVar.f2506c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f2507d))) {
                m2366c(b);
                return null;
            }
        }
        if (!m2365b(b)) {
            return null;
        }
        return mo2665a(b);
    }

    /* renamed from: a */
    private boolean m2363a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f2783d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final Typeface mo2664a(Context context, Resources resources, int i, String str, int i2) {
        if (!m2361a()) {
            return super.mo2664a(context, resources, i, str, i2);
        }
        Object b = m2364b();
        if (!m2362a(context, b, str, 0, -1, -1, null)) {
            m2366c(b);
            return null;
        } else if (!m2365b(b)) {
            return null;
        } else {
            return mo2665a(b);
        }
    }

    /* renamed from: a */
    private boolean m2362a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2782c.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
