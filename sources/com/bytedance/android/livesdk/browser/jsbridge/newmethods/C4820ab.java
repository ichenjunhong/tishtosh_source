package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.core.p230g.C3889d;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab */
public final class C4820ab extends C10779d<Object, Object> {

    /* renamed from: a */
    public C1690c f13040a;

    public final void onTerminate() {
        if (this.f13040a != null) {
            this.f13040a.dispose();
        }
    }

    public final void invoke(Object obj, C10783f fVar) {
        if (C3889d.m9831a(fVar.f28972a) == null) {
            finishWithFailure();
        }
        TTLiveSDKContext.getHostService().mo10315h().mo14516a(fVar.f28972a, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.eva)).mo14541a()).mo6314a((C1674ab<? super T>) new C1674ab<C3009i>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
                C4820ab.this.finishWithFailure(th);
            }

            public final /* synthetic */ void onNext(Object obj) {
                C3009i iVar = (C3009i) obj;
                C4820ab.this.finishWithSuccess();
            }

            public final void onSubscribe(C1690c cVar) {
                C4820ab.this.f13040a = cVar;
            }
        });
    }
}
