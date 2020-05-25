package com.bytedance.android.livesdk.browser.jsbridge.p298c;

import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.g */
public final class C4784g extends C10782e<C4785a, Void> {

    /* renamed from: a */
    private C4786b f13004a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.g$a */
    public static final class C4785a {
        @C17952c(mo34828a = "status")

        /* renamed from: a */
        public int f13005a;
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.g$b */
    public interface C4786b {
        /* renamed from: a */
        void mo10600a(C4785a aVar);
    }

    public C4784g(C4786b bVar) {
        this.f13004a = bVar;
    }

    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        C4785a aVar = (C4785a) obj;
        if (this.f13004a != null) {
            this.f13004a.mo10600a(aVar);
        }
        return null;
    }
}
