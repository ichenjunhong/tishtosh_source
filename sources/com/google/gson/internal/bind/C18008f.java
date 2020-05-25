package com.google.gson.internal.bind;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.gson.internal.bind.f */
final class C18008f {
    /* renamed from: a */
    static List m44208a(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, Field field) {
        try {
            C17952c cVar = (C17952c) field.getAnnotation(C17952c.class);
            if (cVar == null) {
                return Collections.singletonList(reflectiveTypeAdapterFactory.f49953a.mo34872a(field));
            }
            String a = cVar.mo34828a();
            String[] b = cVar.mo34829b();
            if (b.length == 0) {
                return Collections.singletonList(a);
            }
            ArrayList arrayList = new ArrayList(b.length + 1);
            arrayList.add(a);
            for (String add : b) {
                arrayList.add(add);
            }
            return arrayList;
        } catch (IncompatibleClassChangeError e) {
            C32458a.m75148a((Throwable) e);
            return Collections.singletonList(reflectiveTypeAdapterFactory.f49953a.mo34872a(field));
        }
    }
}
