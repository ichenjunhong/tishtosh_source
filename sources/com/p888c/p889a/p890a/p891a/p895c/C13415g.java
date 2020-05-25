package com.p888c.p889a.p890a.p891a.p895c;

import com.p888c.p889a.p890a.p891a.p892a.C13385b;
import com.p888c.p889a.p890a.p891a.p892a.C13386c;
import com.p888c.p889a.p890a.p891a.p892a.C13387d;
import com.p888c.p889a.p890a.p891a.p892a.C13388e;
import com.p888c.p889a.p890a.p891a.p893b.C13404l;
import com.p888c.p889a.p890a.p891a.p895c.C13407b.C13409a;
import com.p888c.p889a.p890a.p891a.p900h.C13435a;

/* renamed from: com.c.a.a.a.c.g */
public final class C13415g implements C13386c, C13409a {

    /* renamed from: c */
    private static C13415g f34967c;

    /* renamed from: a */
    public float f34968a;

    /* renamed from: b */
    public C13387d f34969b;

    /* renamed from: d */
    private final C13388e f34970d;

    /* renamed from: e */
    private final C13385b f34971e;

    /* renamed from: f */
    private C13406a f34972f;

    private C13415g(C13388e eVar, C13385b bVar) {
        this.f34970d = eVar;
        this.f34971e = bVar;
    }

    /* renamed from: a */
    public static C13415g m27045a() {
        if (f34967c == null) {
            f34967c = new C13415g(new C13388e(), new C13385b());
        }
        return f34967c;
    }

    /* renamed from: a */
    public final void mo25112a(boolean z) {
        if (z) {
            C13435a.m27093a().mo25135b();
        } else {
            C13435a.m27093a().mo25136c();
        }
    }

    /* renamed from: b */
    public final void mo25120b() {
        C13407b.m27027a().f34955e = this;
        C13407b.m27027a().mo25109b();
        if (C13407b.m27027a().mo25110c()) {
            C13435a.m27093a().mo25135b();
        }
        this.f34969b.mo25078a();
    }

    /* renamed from: a */
    public final void mo25077a(float f) {
        this.f34968a = f;
        if (this.f34972f == null) {
            this.f34972f = C13406a.m27022a();
        }
        for (C13404l c : this.f34972f.mo25107c()) {
            c.mo25100c().mo25125a(f);
        }
    }
}
