package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.browser.p294h.C4757b;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.au */
public final class C4846au extends C10779d<C4848b, Object> {

    /* renamed from: a */
    private C4847a f13063a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.au$a */
    public interface C4847a {
        /* renamed from: a */
        void mo10552a(C4757b bVar);

        /* renamed from: d */
        C4757b mo10557d();
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.au$b */
    static final class C4848b {
        @C17952c(mo34828a = "title")

        /* renamed from: a */
        String f13064a;
        @C17952c(mo34828a = "desc")

        /* renamed from: b */
        String f13065b;
        @C17952c(mo34828a = "image")

        /* renamed from: c */
        String f13066c;
        @C17952c(mo34828a = "url")

        /* renamed from: d */
        String f13067d;

        C4848b() {
        }
    }

    public final void onTerminate() {
        this.f13063a = null;
    }

    public C4846au(C4847a aVar) {
        this.f13063a = aVar;
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) throws Exception {
        C4848b bVar = (C4848b) obj;
        this.f13063a.mo10552a(new C4757b(bVar.f13064a, bVar.f13065b, bVar.f13066c, bVar.f13067d));
        finishWithSuccess();
    }
}
