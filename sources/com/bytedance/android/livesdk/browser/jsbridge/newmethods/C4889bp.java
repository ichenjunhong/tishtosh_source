package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bp */
public final class C4889bp extends C10782e<Object, C4890a> {

    /* renamed from: a */
    public static boolean f13165a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bp$a */
    static final class C4890a {
        @C17952c(mo34828a = "is_login")

        /* renamed from: a */
        boolean f13166a;
        @C17952c(mo34828a = "user_id")

        /* renamed from: b */
        long f13167b = -1;
        @C17952c(mo34828a = "short_id")

        /* renamed from: c */
        long f13168c = -1;
        @C17952c(mo34828a = "sec_user_id")

        /* renamed from: d */
        String f13169d;
        @C17952c(mo34828a = "is_silent")

        /* renamed from: e */
        int f13170e;

        C4890a() {
        }
    }

    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        C8333e h = TTLiveSDKContext.getHostService().mo10315h();
        C3009i a = h.mo14521a();
        C4890a aVar = new C4890a();
        aVar.f13166a = h.mo14532c();
        if (aVar.f13166a) {
            aVar.f13168c = a.getShortId();
            aVar.f13167b = a.getId();
            aVar.f13169d = a.getSecUid();
        }
        aVar.f13170e = f13165a ? 1 : 0;
        return aVar;
    }
}
