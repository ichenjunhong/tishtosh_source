package com.google.gson;

import com.google.gson.internal.C17982a;
import java.lang.reflect.Field;

/* renamed from: com.google.gson.c */
public final class C17957c {

    /* renamed from: a */
    private final Field f49845a;

    /* renamed from: a */
    public final Class<?> mo34835a() {
        return this.f49845a.getDeclaringClass();
    }

    /* renamed from: b */
    public final String mo34836b() {
        return this.f49845a.getName();
    }

    public C17957c(Field field) {
        C17982a.m44133a(field);
        this.f49845a = field;
    }
}
