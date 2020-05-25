package com.p683ss.android.ugc.bogut.library.p2414a;

import com.p683ss.android.ugc.bogut.library.p2415b.C48501a;

/* renamed from: com.ss.android.ugc.bogut.library.a.a */
public final class C48496a<P extends C48501a> implements C48498c<P> {

    /* renamed from: a */
    private Class<P> f121938a;

    /* renamed from: a */
    public final P mo95984a() {
        try {
            return (C48501a) this.f121938a.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private C48496a(Class<P> cls) {
        this.f121938a = cls;
    }

    /* renamed from: a */
    public static <P extends C48501a> C48496a<P> m104926a(Class<?> cls) {
        Class cls2;
        C48497b bVar = (C48497b) cls.getAnnotation(C48497b.class);
        if (bVar == null) {
            cls2 = null;
        } else {
            cls2 = bVar.mo95985a();
        }
        if (cls2 == null) {
            return null;
        }
        return new C48496a<>(cls2);
    }
}
