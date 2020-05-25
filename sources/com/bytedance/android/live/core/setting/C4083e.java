package com.bytedance.android.live.core.setting;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.bytedance.android.live.core.setting.e */
public final class C4083e {
    /* renamed from: a */
    private static C4097p m10198a(Object obj) {
        C4097p pVar;
        if (obj instanceof C4097p) {
            return (C4097p) obj;
        }
        try {
            Class cls = obj.getClass();
            Field declaredField = cls.getDeclaredField(LeakCanaryFileProvider.f132049i);
            declaredField.setAccessible(true);
            String str = (String) declaredField.get(obj);
            Field declaredField2 = cls.getDeclaredField("description");
            declaredField2.setAccessible(true);
            String str2 = (String) declaredField2.get(obj);
            Field declaredField3 = cls.getDeclaredField("defaultValue");
            declaredField3.setAccessible(true);
            Object obj2 = declaredField3.get(obj);
            if (obj2 != null) {
                Field declaredField4 = cls.getDeclaredField("option");
                declaredField4.setAccessible(true);
                pVar = new C4097p(str, obj2, str2, (String[]) declaredField4.get(obj));
            } else {
                Field declaredField5 = cls.getDeclaredField("type");
                declaredField5.setAccessible(true);
                pVar = new C4097p(str, (Class) declaredField5.get(obj), str2);
            }
        } catch (Exception unused) {
            pVar = null;
        }
        return pVar;
    }

    /* renamed from: a */
    public static List<C4097p> m10199a(String[] strArr) {
        Field[] fields;
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (String cls : strArr) {
            try {
                for (Field field : Class.forName(cls).getFields()) {
                    if (Modifier.isStatic(field.getModifiers())) {
                        try {
                            obj = field.get(null);
                        } catch (IllegalAccessException unused) {
                            obj = null;
                        }
                        C4097p a = m10198a(obj);
                        if (a != null && !TextUtils.isEmpty(C4098q.m10220b(a))) {
                            arrayList.add(a);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        Collections.sort(arrayList, C4084f.f11239a);
        return arrayList;
    }
}
