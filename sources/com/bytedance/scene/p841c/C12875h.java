package com.bytedance.scene.p841c;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.p038f.C0800n;
import com.bytedance.scene.C12924i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/* renamed from: com.bytedance.scene.c.h */
public final class C12875h {

    /* renamed from: a */
    private static final C0800n<String, Class<?>> f33707a = new C0800n<>();

    /* renamed from: com.bytedance.scene.c.h$a */
    public static class C12876a extends RuntimeException {
        C12876a(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: a */
    public static boolean m25797a(C12924i iVar) {
        Class cls = iVar.getClass();
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return false;
        }
        int modifiers = cls.getModifiers();
        if (!Modifier.isPublic(modifiers)) {
            return false;
        }
        if (cls.isMemberClass() && !Modifier.isStatic(modifiers)) {
            return false;
        }
        for (Constructor parameterTypes : cls.getConstructors()) {
            if (parameterTypes.getParameterTypes().length > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static C12924i m25796a(Class<?> cls, Bundle bundle) {
        try {
            C12924i iVar = (C12924i) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(iVar.getClass().getClassLoader());
                iVar.f33839g = bundle;
            }
            return iVar;
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder("Unable to instantiate scene ");
            sb.append(cls);
            sb.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C12876a(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate scene ");
            sb2.append(cls);
            sb2.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C12876a(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder("Unable to instantiate scene ");
            sb3.append(cls);
            sb3.append(": could not find Scene constructor");
            throw new C12876a(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder("Unable to instantiate scene ");
            sb4.append(cls);
            sb4.append(": calling Scene constructor caused an exception");
            throw new C12876a(sb4.toString(), e4);
        }
    }

    /* renamed from: a */
    public static C12924i m25795a(Context context, String str, Bundle bundle) {
        Class cls = (Class) f33707a.get(str);
        if (cls == null) {
            try {
                cls = context.getClassLoader().loadClass(str);
                f33707a.put(str, cls);
            } catch (ClassNotFoundException e) {
                StringBuilder sb = new StringBuilder("Unable to instantiate scene ");
                sb.append(str);
                sb.append(": make sure class name exists, is public, and has an empty constructor that is public");
                throw new C12876a(sb.toString(), e);
            }
        }
        return m25796a(cls, bundle);
    }
}
