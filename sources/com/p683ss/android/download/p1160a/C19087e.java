package com.p683ss.android.download.p1160a;

import java.lang.ref.SoftReference;
import java.util.HashMap;

/* renamed from: com.ss.android.download.a.e */
public final class C19087e<K, V> implements C19086d<K, V> {

    /* renamed from: a */
    public final C19088a f52565a;

    /* renamed from: b */
    public final C19088a f52566b;

    /* renamed from: c */
    public HashMap<K, C19088a> f52567c;

    /* renamed from: d */
    private final int f52568d;

    /* renamed from: com.ss.android.download.a.e$a */
    public class C19088a {

        /* renamed from: a */
        public C19088a f52569a;

        /* renamed from: b */
        public C19088a f52570b;

        /* renamed from: c */
        K f52571c;

        /* renamed from: d */
        SoftReference<V> f52572d;

        C19088a() {
        }
    }

    public C19087e() {
        this(16);
    }

    /* renamed from: a */
    private static void m46490a(C19088a aVar) {
        aVar.f52569a.f52570b = aVar.f52570b;
        aVar.f52570b.f52569a = aVar.f52569a;
        aVar.f52570b = null;
        aVar.f52569a = null;
    }

    public C19087e(int i) {
        this.f52567c = new HashMap<>();
        if (i > 1) {
            this.f52568d = i;
            this.f52565a = new C19088a<>();
            this.f52566b = new C19088a<>();
            this.f52565a.f52570b = this.f52566b;
            this.f52566b.f52569a = this.f52565a;
            return;
        }
        throw new IllegalArgumentException("capacity must be great than one");
    }

    /* renamed from: a */
    public final V mo39014a(K k) {
        C19088a aVar = (C19088a) this.f52567c.get(k);
        if (aVar == null) {
            return null;
        }
        V v = aVar.f52572d.get();
        if (v == null) {
            this.f52567c.remove(k);
            if (!(aVar.f52569a == null || aVar.f52570b == null)) {
                m46490a(aVar);
            }
            return null;
        }
        if (!(aVar.f52569a == null || aVar.f52570b == null || aVar.f52569a == this.f52565a)) {
            m46490a(aVar);
            m46491a(this.f52565a, aVar);
        }
        return v;
    }

    /* renamed from: a */
    public final void mo39016a(int i) {
        while (this.f52567c.size() > 8 && this.f52566b.f52569a != this.f52565a) {
            this.f52567c.remove(this.f52566b.f52569a.f52571c);
            m46490a(this.f52566b.f52569a);
        }
    }

    /* renamed from: a */
    private static void m46491a(C19088a aVar, C19088a aVar2) {
        aVar2.f52569a = aVar;
        aVar2.f52570b = aVar.f52570b;
        aVar2.f52570b.f52569a = aVar2;
        aVar.f52570b = aVar2;
    }

    /* renamed from: a */
    public final void mo39015a(K k, V v) {
        if (k != null && v != null) {
            C19088a aVar = (C19088a) this.f52567c.get(k);
            if (aVar != null) {
                if (v != aVar.f52572d.get()) {
                    aVar.f52572d = new SoftReference<>(v);
                }
                aVar.f52571c = k;
                if (!(aVar.f52569a == null || aVar.f52570b == null || aVar.f52569a == this.f52565a)) {
                    m46490a(aVar);
                    m46491a(this.f52565a, aVar);
                }
                return;
            }
            C19088a aVar2 = new C19088a();
            aVar2.f52571c = k;
            aVar2.f52572d = new SoftReference<>(v);
            this.f52567c.put(k, aVar2);
            m46491a(this.f52565a, aVar2);
            if (this.f52567c.size() > this.f52568d && this.f52566b.f52569a != this.f52565a) {
                this.f52567c.remove(this.f52566b.f52569a.f52571c);
                m46490a(this.f52566b.f52569a);
            }
        }
    }
}
