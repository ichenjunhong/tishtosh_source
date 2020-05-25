package com.p683ss.android.ugc.aweme.filter;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.n */
public final class C31475n implements C31405ah {

    /* renamed from: a */
    public static final C31476a f82365a = new C31476a(null);

    /* renamed from: b */
    private final String f82366b;

    /* renamed from: c */
    private final C31409al f82367c;

    /* renamed from: com.ss.android.ugc.aweme.filter.n$a */
    public static final class C31476a {
        private C31476a() {
        }

        public /* synthetic */ C31476a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C31475n m73313a(String str) {
            C52711k.m112240b(str, "tag");
            return new C31475n(str, new C31410am());
        }
    }

    /* renamed from: a */
    public static final C31475n m73310a(String str) {
        return C31476a.m73313a(str);
    }

    public C31475n(String str, C31409al alVar) {
        C52711k.m112240b(str, "storeName");
        C52711k.m112240b(alVar, "kvFloatStore");
        this.f82366b = str;
        this.f82367c = alVar;
    }

    /* renamed from: a */
    public final int mo64304a(C31459g gVar, C31406ai aiVar) {
        C52711k.m112240b(gVar, "filterBean");
        C52711k.m112240b(aiVar, "getter");
        C31460h.m73282a(gVar, aiVar);
        C31409al alVar = this.f82367c;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f82366b);
        sb.append('-');
        sb.append(gVar.f82324a);
        int b = alVar.mo64310b(sb.toString(), -1);
        if (b == -1) {
            return C31460h.m73280a(gVar, gVar.f82334k, aiVar);
        }
        return b;
    }

    /* renamed from: a */
    public final void mo64305a(C31459g gVar, int i) {
        C52711k.m112240b(gVar, "filterBean");
        C31409al alVar = this.f82367c;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f82366b);
        sb.append('-');
        sb.append(gVar.f82324a);
        alVar.mo64309a(sb.toString(), i);
    }
}
