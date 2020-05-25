package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.p1057b.p1058a.C17432q;
import com.google.p1057b.p1065h.p1066a.C17803b;
import com.google.p1057b.p1065h.p1066a.C17819d;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39545af.C39546a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.q */
final /* synthetic */ class C44402q implements C17819d {

    /* renamed from: a */
    private final C17432q f112340a;

    C44402q(C17432q qVar) {
        this.f112340a = qVar;
    }

    /* renamed from: a */
    public final C17832m mo34644a(Object obj) {
        C23459a aVar = (C23459a) obj;
        return C39618d.f101166g.mo74179a(aVar) ? new C17803b<V>(aVar, this.f112340a) {

            /* renamed from: a */
            final /* synthetic */ C23459a f112209a;

            /* renamed from: b */
            final /* synthetic */ C17432q f112210b;

            {
                this.f112209a = r2;
                this.f112210b = r3;
                C39618d.f101166g.mo74178a(this.f112209a, new C39546a() {
                    /* renamed from: b */
                    public final void mo80651b() {
                        C443391.this.mo34623a((Throwable) C443391.this.f112209a);
                    }

                    /* renamed from: a */
                    public final void mo80650a() {
                        C17825i.m43740a((C17832m) C443391.this.f112210b.get(), new C17824h<V>() {
                            public final void onFailure(Throwable th) {
                                C443391.this.mo34623a(th);
                            }

                            public final void onSuccess(V v) {
                                C443391.this.mo34624b(v);
                            }
                        }, C23551l.f62672a);
                    }
                });
            }
        } : C17825i.m43737a((Throwable) aVar);
    }
}
