package com.bytedance.bdlocation.utils;

import com.google.gson.C17955b;
import com.google.gson.C17957c;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.bdlocation.utils.f */
public final class C9275f implements C17955b {
    public final boolean shouldSkipClass(Class<?> cls) {
        return false;
    }

    public final boolean shouldSkipField(C17957c cVar) {
        String b = cVar.mo34836b();
        for (Class superclass = cVar.mo34835a().getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (m18393a(superclass, b) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static Field m18393a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
