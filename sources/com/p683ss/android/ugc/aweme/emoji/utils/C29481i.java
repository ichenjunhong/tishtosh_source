package com.p683ss.android.ugc.aweme.emoji.utils;

import com.facebook.p909a.C13594o;
import com.google.gson.C17971f;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.i */
public final class C29481i {

    /* renamed from: a */
    public static final C29481i f77225a = new C29481i();

    /* renamed from: b */
    private static final C17971f f77226b = new C17971f();

    private C29481i() {
    }

    /* renamed from: a */
    public static final String m69568a(Object obj) {
        C52711k.m112240b(obj, C13594o.f35460a);
        String b = f77226b.mo34889b(obj);
        C52711k.m112236a((Object) b, "INSTANCE.toJson(o)");
        return b;
    }

    /* renamed from: a */
    public static final <T> T m69567a(String str, Class<T> cls) {
        C52711k.m112240b(cls, "clazz");
        return f77226b.mo34884a(str, cls);
    }

    /* renamed from: b */
    public static final <T> List<T> m69569b(String str, Class<T[]> cls) {
        C52711k.m112240b(cls, "clazz");
        Object[] objArr = (Object[]) f77226b.mo34884a(str, cls);
        if (objArr != null) {
            return C52568f.m112085f(objArr);
        }
        return new ArrayList<>();
    }
}
