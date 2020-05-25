package com.bytedance.jedi.arch.ext.list.p744a;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.arch.ext.list.a.e */
public final class C11848e {

    /* renamed from: a */
    public final C11850b f31433a;

    /* renamed from: b */
    private final boolean f31434b;

    /* renamed from: c */
    private final int f31435c;

    /* renamed from: com.bytedance.jedi.arch.ext.list.a.e$a */
    public static final class C11849a {

        /* renamed from: a */
        int f31436a;

        /* renamed from: b */
        boolean f31437b;

        /* renamed from: c */
        final C11850b f31438c;

        public C11849a(C11850b bVar) {
            C52711k.m112240b(bVar, "fetcher");
            this.f31438c = bVar;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.a.e$b */
    public interface C11850b {
        /* renamed from: a */
        void mo22560a(int i);
    }

    /* renamed from: a */
    public final void mo22599a(int i) {
        if (this.f31434b) {
            this.f31433a.mo22560a(i + this.f31435c);
        }
    }

    private C11848e(C11850b bVar, boolean z, int i) {
        this.f31433a = bVar;
        this.f31434b = z;
        this.f31435c = i;
    }

    public /* synthetic */ C11848e(C11850b bVar, boolean z, int i, C52707g gVar) {
        this(bVar, z, i);
    }
}
