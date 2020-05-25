package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.i */
public final class C4901i extends C10779d<Object, Object> {

    /* renamed from: a */
    private C4902a f13186a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.i$a */
    public interface C4902a {
        /* renamed from: e */
        void mo10558e();
    }

    public final void onTerminate() {
    }

    public C4901i(C4902a aVar) {
        this.f13186a = aVar;
    }

    public final void invoke(Object obj, C10783f fVar) throws Exception {
        if (this.f13186a != null) {
            this.f13186a.mo10558e();
        }
    }
}
