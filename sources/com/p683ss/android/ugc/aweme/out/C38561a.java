package com.p683ss.android.ugc.aweme.out;

import com.p683ss.android.ugc.aweme.external.p1697b.C29596d;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.external.IUIService;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.out.a */
public final class C38561a implements AsyncAVService {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f98067a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38561a.class), "uiService", "getUiService()Lcom/ss/android/ugc/aweme/external/ui/UIServiceImpl;"))};

    /* renamed from: b */
    private final C52668f f98068b = C52732g.m112285a(C38562a.f98069a);

    /* renamed from: com.ss.android.ugc.aweme.out.a$a */
    static final class C38562a extends C52712l implements C52670a<C29596d> {

        /* renamed from: a */
        public static final C38562a f98069a = new C38562a();

        C38562a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29596d();
        }
    }

    public final IUIService uiService() {
        return (C29596d) this.f98068b.getValue();
    }
}
