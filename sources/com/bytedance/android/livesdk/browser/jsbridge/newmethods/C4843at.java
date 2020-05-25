package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.p290d.C4742w;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.at */
public final class C4843at extends C10782e<C4844a, Object> {

    /* renamed from: a */
    private C4742w f13055a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.at$a */
    static final class C4844a {
        @C17952c(mo34828a = "type")

        /* renamed from: a */
        String f13056a;
        @C17952c(mo34828a = "args")

        /* renamed from: b */
        C4845a f13057b;

        /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.at$a$a */
        static final class C4845a {
            @C17952c(mo34828a = "url")

            /* renamed from: a */
            String f13058a;
            @C17952c(mo34828a = "width")

            /* renamed from: b */
            int f13059b;
            @C17952c(mo34828a = "height")

            /* renamed from: c */
            int f13060c;
            @C17952c(mo34828a = "radius")

            /* renamed from: d */
            int f13061d;
            @C17952c(mo34828a = "close_by_mask")

            /* renamed from: e */
            int f13062e;
        }

        C4844a() {
        }
    }

    public C4843at(C4742w wVar) {
        this.f13055a = wVar;
    }

    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        C4844a aVar = (C4844a) obj;
        if (TextUtils.equals("webview_popup", aVar.f13056a)) {
            C4845a aVar2 = aVar.f13057b;
            this.f13055a.mo10579a(aVar2.f13058a, aVar2.f13059b, aVar2.f13060c, aVar2.f13061d, aVar2.f13062e);
        } else {
            terminate();
        }
        return null;
    }
}
