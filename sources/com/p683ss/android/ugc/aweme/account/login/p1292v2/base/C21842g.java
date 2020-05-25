package com.p683ss.android.ugc.aweme.account.login.p1292v2.base;

import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.g */
public final class C21842g {

    /* renamed from: a */
    public C21844b f59131a;

    /* renamed from: b */
    private C1690c f59132b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.g$a */
    public interface C21843a {
        /* renamed from: a */
        void mo45978a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.g$b */
    public interface C21844b {
        /* renamed from: a */
        void mo45979a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.g$c */
    static final class C21845c<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ C21842g f59133a;

        C21845c(C21842g gVar) {
            this.f59133a = gVar;
        }

        public final void subscribe(final C2204x<String> xVar) {
            C52711k.m112240b(xVar, "it");
            this.f59133a.f59131a = new C21844b() {
                /* renamed from: a */
                public final void mo45979a(String str) {
                    C52711k.m112240b(str, "msg");
                    C2204x xVar = xVar;
                    C52711k.m112236a((Object) xVar, "it");
                    if (!xVar.isDisposed()) {
                        xVar.mo6282a(str);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.g$d */
    static final class C21847d<T> implements C1710e<String> {

        /* renamed from: a */
        final /* synthetic */ C21843a f59135a;

        C21847d(C21843a aVar) {
            this.f59135a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            C21843a aVar = this.f59135a;
            C52711k.m112236a((Object) str, "p0");
            aVar.mo45978a(str);
        }
    }

    /* renamed from: a */
    public final void mo45975a() {
        C1690c cVar = this.f59132b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* renamed from: a */
    public final void mo45977a(String str) {
        C52711k.m112240b(str, "msg");
        C21844b bVar = this.f59131a;
        if (bVar != null) {
            bVar.mo45979a(str);
        }
    }

    /* renamed from: a */
    public final void mo45976a(C21843a aVar, long j, TimeUnit timeUnit) {
        C52711k.m112240b(aVar, "onReceiveMsgListener");
        C52711k.m112240b(timeUnit, "timeUnit");
        C2201v a = C2201v.m6601a((C2205y<T>) new C21845c<T>(this));
        C52711k.m112236a((Object) a, "Observable.create {\n    …}\n            }\n        }");
        this.f59132b = a.mo6534c(1000, timeUnit).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C21847d<Object>(aVar));
    }
}
