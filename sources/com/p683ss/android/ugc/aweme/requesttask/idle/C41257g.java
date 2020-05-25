package com.p683ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import com.p683ss.android.ugc.aweme.live.C36095h;
import com.p683ss.android.ugc.aweme.live.C36097j;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.g */
public final class C41257g implements C35889c {
    /* renamed from: a */
    public final C35897g mo46246a() {
        return C35897g.IDLE;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        ILiveOuterService a = C36173w.m81665a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
        a.getLiveFeedFactory().mo74832a(context);
        ILiveOuterService a2 = C36173w.m81665a();
        C52711k.m112236a((Object) a2, "ServiceManager.get().get…OuterService::class.java)");
        C36095h liveOuterSettingService = a2.getLiveOuterSettingService();
        if (liveOuterSettingService != null) {
            C36097j a3 = liveOuterSettingService.mo74816a();
            if (a3 != null) {
                a3.mo74849a(context);
            }
        }
    }
}
