package com.bytedance.android.live.p245d;

import com.bytedance.android.live.base.C2952b;
import com.taobao.android.dexposed.ClassUtils;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.d.c */
public class C4116c {

    /* renamed from: a */
    private static final ConcurrentHashMap<Class, Object> f11312a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static <T extends C2952b> T m10249a(Class<T> cls) {
        T t = (C2952b) f11312a.get(cls);
        if (t != null) {
            return t;
        }
        try {
            C2952b bVar = (C2952b) m10250a(cls, "$$impl");
            try {
                m10251a(cls, (T) bVar);
            } catch (Exception unused) {
            }
            return bVar;
        } catch (Exception unused2) {
            return t;
        }
    }

    /* renamed from: a */
    public static <T extends C2952b> void m10251a(Class<T> cls, T t) {
        f11312a.put(cls, t);
    }

    /* renamed from: a */
    private static <T, C> T m10250a(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(canonicalName.replace('.', '_'));
        sb.append(str);
        String sb2 = sb.toString();
        try {
            if (name.isEmpty()) {
                str2 = sb2;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(name);
                sb3.append(ClassUtils.PACKAGE_SEPARATOR);
                sb3.append(sb2);
                str2 = sb3.toString();
            }
            return Class.forName(str2).newInstance();
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder("cannot find implementation for ");
            sb4.append(cls.getCanonicalName());
            sb4.append(". ");
            sb4.append(sb2);
            sb4.append(" does not exist");
            throw new RuntimeException(sb4.toString());
        } catch (IllegalAccessException unused2) {
            StringBuilder sb5 = new StringBuilder("Cannot access the constructor");
            sb5.append(cls.getCanonicalName());
            throw new RuntimeException(sb5.toString());
        } catch (InstantiationException unused3) {
            StringBuilder sb6 = new StringBuilder("Failed to create an instance of ");
            sb6.append(cls.getCanonicalName());
            throw new RuntimeException(sb6.toString());
        }
    }
}
