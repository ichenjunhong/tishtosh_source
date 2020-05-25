package com.p683ss.android.ugc.aweme.profile.api;

import android.content.Context;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23393g;
import com.p683ss.android.ugc.aweme.main.C36606dx;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.api.a */
final /* synthetic */ class C39788a implements Callable {

    /* renamed from: a */
    private final Context f101558a;

    C39788a(Context context) {
        this.f101558a = context;
    }

    public final Object call() {
        Context context = this.f101558a;
        if (!((Boolean) SharePrefCache.inst().getEnableProfileActivityLink().mo47782d()).booleanValue()) {
            C36606dx dxVar = (C36606dx) C23393g.m57474a(context, C36606dx.class);
            if (dxVar != null) {
                dxVar.mo48511a("");
                dxVar.mo48520d("");
                dxVar.mo48515b("");
                dxVar.mo48525f(false);
            }
            C40026s.f101964a.clearNinePatchBubbleState(context);
        }
        return Boolean.valueOf(true);
    }
}
