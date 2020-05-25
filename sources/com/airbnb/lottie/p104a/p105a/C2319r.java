package com.airbnb.lottie.p104a.p105a;

import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p108c.p110b.C2379q;
import com.airbnb.lottie.p108c.p110b.C2379q.C2380a;
import com.airbnb.lottie.p108c.p111c.C2382a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.r */
public final class C2319r implements C2301b, C2321a {

    /* renamed from: a */
    public final C2380a f7244a;

    /* renamed from: b */
    public final C2320a<?, Float> f7245b;

    /* renamed from: c */
    public final C2320a<?, Float> f7246c;

    /* renamed from: d */
    public final C2320a<?, Float> f7247d;

    /* renamed from: e */
    private final String f7248e;

    /* renamed from: f */
    private final List<C2321a> f7249f = new ArrayList();

    /* renamed from: a */
    public final void mo6712a(List<C2301b> list, List<C2301b> list2) {
    }

    /* renamed from: b */
    public final String mo6713b() {
        return this.f7248e;
    }

    /* renamed from: a */
    public final void mo6707a() {
        for (int i = 0; i < this.f7249f.size(); i++) {
            ((C2321a) this.f7249f.get(i)).mo6707a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6718a(C2321a aVar) {
        this.f7249f.add(aVar);
    }

    public C2319r(C2382a aVar, C2379q qVar) {
        this.f7248e = qVar.f7406a;
        this.f7244a = qVar.f7407b;
        this.f7245b = qVar.f7408c.mo6735a();
        this.f7246c = qVar.f7409d.mo6735a();
        this.f7247d = qVar.f7410e.mo6735a();
        aVar.mo6752a(this.f7245b);
        aVar.mo6752a(this.f7246c);
        aVar.mo6752a(this.f7247d);
        this.f7245b.mo6722a((C2321a) this);
        this.f7246c.mo6722a((C2321a) this);
        this.f7247d.mo6722a((C2321a) this);
    }
}
