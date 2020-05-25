package com.bytedance.android.p140a.p151b.p153b.p154a;

import com.bytedance.android.p140a.p141a.p150i.C2800b;
import com.bytedance.android.p140a.p151b.C2806a;
import com.bytedance.android.p140a.p151b.p153b.C2820c;
import com.bytedance.android.p140a.p151b.p153b.C2822d;
import com.bytedance.android.p140a.p151b.p153b.p154a.C2815b.C2816a;
import java.util.List;

/* renamed from: com.bytedance.android.a.b.b.a.a */
public abstract class C2813a implements C2815b {

    /* renamed from: a */
    protected final C2806a f8401a;

    /* renamed from: com.bytedance.android.a.b.b.a.a$a */
    public static class C2814a implements C2816a {

        /* renamed from: a */
        private C2820c f8402a;

        /* renamed from: b */
        private int f8403b = 0;

        /* renamed from: c */
        private List<C2815b> f8404c;

        /* renamed from: a */
        public final C2820c mo7413a() {
            return this.f8402a;
        }

        /* renamed from: a */
        public final C2822d mo7414a(C2820c cVar) {
            if (cVar == null) {
                return C2822d.m8022a(C2800b.m7961a("null request"));
            }
            if (this.f8404c == null || this.f8404c.isEmpty()) {
                return C2822d.m8022a(C2800b.m7961a("no interceptor in the chain"));
            }
            if (this.f8403b >= this.f8404c.size()) {
                return C2822d.m8023a(C2800b.m7961a("interceptors index out of bound"), cVar);
            }
            C2815b bVar = (C2815b) this.f8404c.get(this.f8403b);
            if (bVar == null) {
                return C2822d.m8023a(C2800b.m7961a("null interceptor"), cVar);
            }
            this.f8402a = cVar;
            this.f8403b++;
            return bVar.mo7410a(this);
        }

        public C2814a(List<C2815b> list, int i) {
            this.f8404c = list;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2820c mo7411a(C2820c cVar) {
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2822d mo7412a(C2822d dVar) {
        return dVar;
    }

    public C2813a(C2806a aVar) {
        this.f8401a = aVar;
    }

    /* renamed from: a */
    public C2822d mo7410a(C2816a aVar) {
        return mo7412a(aVar.mo7414a(mo7411a(aVar.mo7413a())));
    }
}
