package com.p683ss.android.ugc.aweme.journey;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.journey.r */
public final class C35778r implements C35889c {

    /* renamed from: a */
    public static volatile boolean f91892a;

    /* renamed from: b */
    public static final C35779a f91893b = new C35779a(null);

    /* renamed from: c */
    private final boolean f91894c;

    /* renamed from: com.ss.android.ugc.aweme.journey.r$a */
    public static final class C35779a {

        /* renamed from: com.ss.android.ugc.aweme.journey.r$a$a */
        public static final class C35780a implements C1674ab<C35768n> {

            /* renamed from: a */
            final /* synthetic */ Context f91895a;

            public final void onComplete() {
            }

            C35780a(Context context) {
                this.f91895a = context;
            }

            public final /* synthetic */ void onNext(Object obj) {
                C35768n nVar = (C35768n) obj;
                C52711k.m112240b(nVar, "response");
                C47718bf.m103289b(nVar);
            }

            public final void onSubscribe(C1690c cVar) {
                C52711k.m112240b(cVar, "d");
                C35778r.f91892a = true;
            }

            public final void onError(Throwable th) {
                C52711k.m112240b(th, "throwable");
                if (C35781s.f91909n.mo74444h()) {
                    C47718bf.m103289b(new C35768n(new C35776p(C35762i.m80899a(this.f91895a), true), null));
                }
            }
        }

        private C35779a() {
        }

        /* renamed from: a */
        public static boolean m80909a() {
            return C35778r.f91892a;
        }

        public /* synthetic */ C35779a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m80908a(Context context) {
            C52711k.m112240b(context, "context");
            C35764j.m80900a().getJourney(C35781s.f91909n.mo74446j(), "new_user_journey").mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C35780a<Object>(context));
        }
    }

    /* renamed from: a */
    public final C35897g mo46246a() {
        if (this.f91894c) {
            return C35897g.NORMAL;
        }
        return C35897g.IDLE;
    }

    public C35778r() {
        boolean z;
        if (!C35781s.f91909n.mo74441e() || C35781s.f91897b || f91892a) {
            z = false;
        } else {
            z = true;
        }
        this.f91894c = z;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        if (this.f91894c) {
            C35779a.m80908a(context);
        }
    }
}
