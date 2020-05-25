package com.p683ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.os.Bundle;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.p683ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.story.live.i */
public final class C46648i implements NoticeLiveServiceAdapter {
    /* renamed from: a */
    public static NoticeLiveServiceAdapter m101247a() {
        if (C27991b.f73434R == null) {
            synchronized (NoticeLiveServiceAdapter.class) {
                if (C27991b.f73434R == null) {
                    C27991b.f73434R = C27628bo.m66314i();
                }
            }
        }
        return (NoticeLiveServiceAdapter) C27991b.f73434R;
    }

    public final boolean hasLivePermission() {
        ILiveOuterService a = C36173w.m81665a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
        return a.getLiveServiceAdapter().mo74827a();
    }

    public final void setLivePermission(boolean z) {
        ILiveOuterService a = C36173w.m81665a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
        a.getLiveServiceAdapter().mo74826a(z);
    }

    public final void enterLiveConverge(Context context, Bundle bundle) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bundle, "bundle");
        String string = bundle.getString("requestPage");
        ILiveOuterService a = C36173w.m81665a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
        a.getLiveWatcherUtils().mo70090a(context, bundle, string);
    }
}
