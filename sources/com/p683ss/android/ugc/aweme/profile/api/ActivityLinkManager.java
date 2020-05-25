package com.p683ss.android.ugc.aweme.profile.api;

import android.content.Context;
import android.text.TextUtils;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23393g;
import com.p683ss.android.ugc.aweme.main.C36606dx;
import com.p683ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.profile.api.ActivityLinkManager */
public final class ActivityLinkManager {

    /* renamed from: a */
    private static Map<String, ActivityLinkResponse> f101544a = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.profile.api.ActivityLinkManager$ActivityLinkApi */
    interface ActivityLinkApi {
        @C53075f(mo110603a = "/aweme/v1/activity/profile_link/")
        C17832m<ActivityLinkResponse> getLinkInfo();

        @C53075f(mo110603a = "/aweme/v1/activity/profile_link/")
        C17832m<ActivityLinkResponse> getLinkInfo(@C53089t(mo110619a = "sec_uid") String str, @C53089t(mo110619a = "show_other_banner") boolean z);
    }

    /* renamed from: b */
    public static void m88491b(Context context) {
        C0013i.m16a((Callable<TResult>) new C39788a<TResult>(context));
    }

    /* renamed from: a */
    public static boolean m88490a(Context context) {
        C36606dx dxVar = (C36606dx) C23393g.m57474a(context, C36606dx.class);
        if (dxVar == null) {
            return false;
        }
        return TextUtils.equals(dxVar.mo48518c(""), "true");
    }
}
