package com.bytedance.android.livesdk.user;

import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.host.p453c.C8799b;
import p064c.p065a.C1674ab;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.user.s */
final /* synthetic */ class C8359s implements C2205y {

    /* renamed from: a */
    private final C8348m f22742a;

    /* renamed from: b */
    private final C8341k f22743b;

    /* renamed from: c */
    private final C8319a f22744c;

    C8359s(C8348m mVar, C8341k kVar, C8319a aVar) {
        this.f22742a = mVar;
        this.f22743b = kVar;
        this.f22744c = aVar;
    }

    public final void subscribe(C2204x xVar) {
        C8348m mVar = this.f22742a;
        C8341k kVar = this.f22743b;
        mVar.f22712b.unFollowWithConfirm(kVar.f22701d, kVar.f22699b, kVar.f22660a, new C8799b(this.f22744c, kVar, xVar) {

            /* renamed from: a */
            final /* synthetic */ C8319a f22725a;

            /* renamed from: b */
            final /* synthetic */ C8341k f22726b;

            /* renamed from: c */
            final /* synthetic */ C2204x f22727c;

            /* renamed from: a */
            public final void mo14556a() {
                C8348m.this.mo14553a(0, this.f22725a.f22660a, this.f22726b.f22702e).mo6314a((C1674ab<? super T>) new C1674ab<C8686a>() {
                    public final void onSubscribe(C1690c cVar) {
                    }

                    public final void onComplete() {
                        C83523.this.f22727c.mo6273a();
                    }

                    public final void onError(Throwable th) {
                        C83523.this.f22727c.mo6274a(th);
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        C83523.this.f22727c.mo6282a((C8686a) obj);
                        C83523.this.f22727c.mo6273a();
                    }
                });
            }

            {
                this.f22725a = r2;
                this.f22726b = r3;
                this.f22727c = r4;
            }
        });
    }
}
