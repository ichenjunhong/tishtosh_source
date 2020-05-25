package com.p683ss.android.ugc.aweme.story.live;

import android.content.Context;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.p683ss.android.ugc.aweme.notice.api.utils.NoticeLiveWatcherUtil;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;
import com.p683ss.android.ugc.aweme.p1803i.C33089c.C33090a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.story.live.j */
public final class C46649j implements NoticeLiveWatcherUtil {
    /* renamed from: a */
    public static NoticeLiveWatcherUtil m101248a() {
        if (C27991b.f73529y == null) {
            synchronized (NoticeLiveWatcherUtil.class) {
                if (C27991b.f73529y == null) {
                    C27991b.f73529y = C27628bo.m66310e();
                }
            }
        }
        return (NoticeLiveWatcherUtil) C27991b.f73529y;
    }

    public final void watchFromNotification(Context context, User user) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        ILiveOuterService a = C36173w.m81665a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
        a.getLiveWatcherUtils().mo70093a(context, user, (C33090a) null);
    }
}
