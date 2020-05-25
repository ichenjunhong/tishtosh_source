package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21840e;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a.C21639a;
import p064c.p065a.C2193n;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52723a;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.u */
public final class C21806u {

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.u$a */
    static final class C21807a<T> implements C1710e<T> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59067a;

        /* renamed from: b */
        final /* synthetic */ C52723a f59068b;

        C21807a(C21829b bVar, C52723a aVar) {
            this.f59067a = bVar;
            this.f59068b = aVar;
        }

        public final void accept(T t) {
            this.f59067a.mo45963b(0);
            this.f59068b.element = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.u$b */
    static final class C21808b<T> implements C1715j<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59069a;

        /* renamed from: b */
        final /* synthetic */ C52723a f59070b;

        C21808b(C21829b bVar, C52723a aVar) {
            this.f59069a = bVar;
            this.f59070b = aVar;
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112240b(th, "it");
            this.f59069a.mo45963b(0);
            this.f59070b.element = true;
            if (th instanceof C21675r) {
                C21829b bVar = this.f59069a;
                C21675r rVar = (C21675r) th;
                int errorCode = rVar.getErrorCode();
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                C21639a.m54351a(bVar, errorCode, message, rVar.getScene(), rVar.getStep(), rVar.getExtra());
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.u$c */
    static final class C21809c implements C1706a {

        /* renamed from: a */
        final /* synthetic */ C52723a f59071a;

        /* renamed from: b */
        final /* synthetic */ C21829b f59072b;

        C21809c(C52723a aVar, C21829b bVar) {
            this.f59071a = aVar;
            this.f59072b = bVar;
        }

        /* renamed from: a */
        public final void mo6199a() {
            if (!this.f59071a.element) {
                this.f59072b.mo45963b(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.u$d */
    static final class C21810d<T> implements C1710e<C1690c> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59073a;

        C21810d(C21829b bVar) {
            this.f59073a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C1690c cVar = (C1690c) obj;
            this.f59073a.mo45963b(1);
        }
    }

    /* renamed from: a */
    public static final <T> C2193n<T> m54453a(C21829b bVar, C2193n<T> nVar) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(nVar, "source");
        C52723a aVar = new C52723a();
        aVar.element = false;
        C2193n a = nVar.mo6484a(C1667a.m5940a());
        C52711k.m112236a((Object) a, "source\n            .subs…dSchedulers.mainThread())");
        C2193n<T> b = C21840e.m54518a(a, bVar).mo6496c((C1710e<? super T>) new C21807a<Object>(bVar, aVar)).mo6488a((C1715j<? super Throwable>) new C21808b<Object>(bVar, aVar)).mo6492b((C1706a) new C21809c(aVar, bVar)).mo6493b((C1710e<? super C1690c>) new C21810d<Object>(bVar));
        C52711k.m112236a((Object) b, "source\n            .subs…_ANIMATIOM)\n            }");
        return b;
    }
}
