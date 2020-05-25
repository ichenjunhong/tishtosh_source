package android.support.p030v4.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.graphics.g */
public final class C0823g extends C0822f {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Typeface mo2665a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2780a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2786g.invoke(null, new Object[]{newInstance, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Method mo2666a(Class cls) throws NoSuchMethodException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
