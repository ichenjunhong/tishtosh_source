package com.google.gson.internal.p1079a;

import com.google.gson.internal.C18058d;
import java.lang.reflect.AccessibleObject;

/* renamed from: com.google.gson.internal.a.b */
public abstract class C17984b {

    /* renamed from: a */
    private static final C17984b f49932a;

    /* renamed from: a */
    public static C17984b m44136a() {
        return f49932a;
    }

    /* renamed from: a */
    public abstract void mo34921a(AccessibleObject accessibleObject);

    static {
        C17984b bVar;
        if (C18058d.f50106a < 9) {
            bVar = new C17983a();
        } else {
            bVar = new C17985c();
        }
        f49932a = bVar;
    }
}
