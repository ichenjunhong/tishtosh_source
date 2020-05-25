package com.bytedance.ies.geckoclient.p686e;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ies.geckoclient.e.f */
public final class C10941f {

    /* renamed from: b */
    private static C10941f f29354b = new C10941f();

    /* renamed from: a */
    public boolean f29355a;

    /* renamed from: c */
    private Map<String, C10942a> f29356c = new ConcurrentHashMap();

    /* renamed from: com.bytedance.ies.geckoclient.e.f$a */
    public interface C10942a {
        /* renamed from: a */
        void mo19732a(String str);

        /* renamed from: b */
        void mo19733b(String str);
    }

    /* renamed from: a */
    public static C10941f m22204a() {
        return f29354b;
    }

    /* renamed from: b */
    public final void mo19729b() {
        this.f29355a = true;
    }

    /* renamed from: c */
    public final void mo19731c() {
        this.f29355a = false;
    }

    private C10941f() {
    }

    /* renamed from: a */
    public final void mo19727a(String str) {
        if (str != null) {
            C10942a aVar = (C10942a) this.f29356c.get(str);
            if (aVar != null) {
                aVar.mo19732a(str);
            }
        }
    }

    /* renamed from: b */
    public final void mo19730b(String str) {
        if (str != null) {
            C10942a aVar = (C10942a) this.f29356c.get(str);
            if (aVar != null) {
                aVar.mo19733b(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo19728a(String str, C10942a aVar) {
        if (str != null) {
            this.f29356c.put(str, aVar);
        }
    }
}
