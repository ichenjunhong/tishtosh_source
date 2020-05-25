package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.arch.b */
public final class C11793b {

    /* renamed from: a */
    private static final C0212b f31300a = new C11794a();

    /* renamed from: com.bytedance.jedi.arch.b$a */
    public static final class C11794a implements C0212b {
        C11794a() {
        }

        /* renamed from: a */
        public final <T extends C0209x> T mo361a(Class<T> cls) {
            C52711k.m112240b(cls, "modelClass");
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getSimpleName());
            sb.append(" should be created in the host before being used.");
            throw new C11792ae(sb.toString());
        }
    }

    /* renamed from: a */
    public static final C0212b m24134a() {
        return f31300a;
    }
}
