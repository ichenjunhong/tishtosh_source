package com.p683ss.android.ugc.aweme.main.guide;

import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a.C42247b;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.main.guide.b */
public final class C36656b implements C42247b {

    /* renamed from: a */
    public static final C36657a f93803a = new C36657a(null);

    /* renamed from: b */
    private final C52671b<String, C52860x> f93804b;

    /* renamed from: com.ss.android.ugc.aweme.main.guide.b$a */
    public static final class C36657a {
        private C36657a() {
        }

        public /* synthetic */ C36657a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C36656b m82572a(C52671b<? super String, C52860x> bVar) {
            C52711k.m112240b(bVar, "listener");
            return new C36656b(bVar);
        }
    }

    /* renamed from: a */
    public static final C36656b m82569a(C52671b<? super String, C52860x> bVar) {
        return C36657a.m82572a(bVar);
    }

    /* renamed from: b */
    public final void mo75533b() {
        this.f93804b.invoke("onGuideShow");
    }

    /* renamed from: a */
    public final void mo75532a() {
        this.f93804b.invoke("onGuideHide");
    }

    public C36656b(C52671b<? super String, C52860x> bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f93804b = bVar;
    }
}
