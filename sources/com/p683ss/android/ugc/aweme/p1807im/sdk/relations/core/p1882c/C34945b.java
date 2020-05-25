package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1882c;

import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1884e.C34958a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.c.b */
public final class C34945b extends C34944a<IMContact> {

    /* renamed from: b */
    public static final C34946a f89954b = new C34946a(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.c.b$a */
    public static final class C34946a {
        private C34946a() {
        }

        public /* synthetic */ C34946a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C34945b m79083a(C34958a aVar) {
            C52711k.m112240b(aVar, "parameters");
            return new C34945b(aVar);
        }
    }

    public C34945b(C34958a aVar) {
        C52711k.m112240b(aVar, "parameters");
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo73053a(IMContact iMContact) {
        C52711k.m112240b(iMContact, "obj");
        if ((this.f89953a.mo73058a() || this.f89953a.f89967c) && (iMContact instanceof IMUser) && ((IMUser) iMContact).getShareStatus() == 2) {
            return false;
        }
        return true;
    }
}
