package com.bytedance.scene;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.scene.t */
public final class C12969t {

    /* renamed from: a */
    public static final C12971a f33964a = new C12971a() {
        /* renamed from: a */
        public final C12969t mo24563a() {
            return new C12969t(C12969t.m26082a());
        }
    };

    /* renamed from: f */
    private static final AtomicInteger f33965f = new AtomicInteger(0);

    /* renamed from: b */
    final String f33966b;

    /* renamed from: c */
    final Map<String, C12969t> f33967c;

    /* renamed from: d */
    final Map<Object, Object> f33968d;

    /* renamed from: e */
    private final C12969t f33969e;

    /* renamed from: com.bytedance.scene.t$a */
    public interface C12971a {
        /* renamed from: a */
        C12969t mo24563a();
    }

    /* renamed from: com.bytedance.scene.t$b */
    public interface C12972b {
        /* renamed from: a */
        void mo24483a();
    }

    /* renamed from: a */
    public static String m26082a() {
        StringBuilder sb = new StringBuilder("Scene #");
        sb.append(f33965f.getAndIncrement());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo24562b() {
        if (this.f33969e != null) {
            C12969t tVar = this.f33969e;
            tVar.f33967c.remove(this.f33966b);
        }
        for (Object next : this.f33968d.values()) {
            if (next instanceof C12972b) {
                ((C12972b) next).mo24483a();
            }
        }
        this.f33968d.clear();
        this.f33967c.clear();
    }

    /* renamed from: a */
    public final <T> T mo24560a(Object obj) {
        C12969t tVar = this;
        while (true) {
            T t = tVar.f33968d.get(obj);
            if (t != null) {
                return t;
            }
            if (tVar.f33969e == null) {
                return null;
            }
            tVar = tVar.f33969e;
        }
    }

    /* renamed from: a */
    public final void mo24561a(Object obj, Object obj2) {
        this.f33968d.put(obj, obj2);
    }

    C12969t(C12969t tVar, String str) {
        this.f33967c = new HashMap();
        this.f33968d = new HashMap();
        this.f33969e = tVar;
        this.f33966b = str;
    }
}
