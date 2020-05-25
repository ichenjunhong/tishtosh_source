package com.p683ss.android.ugc.aweme.base.api;

import android.support.p030v4.p038f.C0777a;
import com.google.gson.C18086p;
import com.google.gson.C18091u;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1407a.C23457c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.base.api.a */
public abstract class C23453a {
    private static final Object sLock = new Object();
    private static final Map<Class<?>, List<Field>> sRequiredMap = Collections.synchronizedMap(new C0777a());

    public <T> T checkValid() throws Throwable {
        Class cls = getClass();
        initRequiredFieldMap(cls);
        List list = (List) sRequiredMap.get(cls);
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                Field field = (Field) list.get(i);
                if (field.get(this) != null) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder("Unexpected null value in ");
                    sb.append(cls.getName());
                    sb.append(", required field: ");
                    sb.append(field.getName());
                    throw new C18091u(sb.toString());
                }
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }
        return this;
    }

    public static RuntimeException getCompatibleException(ExecutionException executionException) throws Exception {
        Throwable cause = executionException.getCause();
        if (cause instanceof C23459a) {
            return (C23459a) cause;
        }
        if (cause instanceof C18086p) {
            return new C23457c(cause);
        }
        throw ((Exception) cause);
    }

    public static void initRequiredFieldMap(Class<?> cls) {
        if (sRequiredMap.get(cls) == null) {
            synchronized (sLock) {
                Field[] declaredFields = cls.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.getAnnotation(C23460b.class) != null) {
                        field.setAccessible(true);
                        arrayList.add(field);
                    }
                }
                sRequiredMap.put(cls, Collections.unmodifiableList(arrayList));
            }
        }
    }
}
