package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.C3009i.C3010a;
import com.bytedance.android.live.base.model.user.C3013l;
import com.bytedance.android.livesdkapi.depend.p440h.C8637b;
import com.bytedance.android.livesdkapi.host.IHostUser;
import p064c.p065a.C1683ag;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.user.q */
final /* synthetic */ class C8357q implements C8637b {

    /* renamed from: a */
    private final C8348m f22739a;

    /* renamed from: b */
    private final IHostUser f22740b;

    C8357q(C8348m mVar, IHostUser iHostUser) {
        this.f22739a = mVar;
        this.f22740b = iHostUser;
    }

    /* renamed from: a */
    public final void mo14559a(boolean z) {
        C8348m mVar = this.f22739a;
        IHostUser iHostUser = this.f22740b;
        if (z) {
            mVar.mo14554b(iHostUser.getCurUser());
            mVar.mo14535e().mo6159b((C1683ag<? super T>) new C1683ag<C3009i>() {
                public final void onError(Throwable th) {
                }

                public final void onSubscribe(C1690c cVar) {
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    C8348m.this.mo14554b((C3009i) obj);
                }
            });
            return;
        }
        mVar.mo14554b((C3009i) new C8340j());
        mVar.f22713c.onNext(new C3013l(C3010a.Logout, mVar.mo14521a()));
    }
}
