package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1882c;

import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1882c.C34945b.C34946a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1884e.C34958a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.c.c */
public final class C34947c extends C34944a<IMContact> {

    /* renamed from: b */
    public static final C34948a f89955b = new C34948a(null);

    /* renamed from: c */
    private final C34945b f89956c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.c.c$a */
    public static final class C34948a {
        private C34948a() {
        }

        public /* synthetic */ C34948a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C34947c m79085a(C34958a aVar) {
            C52711k.m112240b(aVar, "parameters");
            return new C34947c(aVar);
        }
    }

    public C34947c(C34958a aVar) {
        C52711k.m112240b(aVar, "parameters");
        super(aVar);
        this.f89956c = C34946a.m79083a(aVar);
    }

    /* renamed from: a */
    public final boolean mo73054a(IMContact iMContact) {
        C52711k.m112240b(iMContact, "obj");
        return this.f89956c.mo73053a(iMContact);
    }
}
